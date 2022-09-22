/*
练习：添加手机对象并返回要求的数据

需求：
定义一个Javabean类：Phone
Phone属性：品牌，价格。
main方法中定义一个集合，存入三个手机对象。
分别为：小米，1000 苹果，8000 锤子，2999
定义一个方法，将价格低于3000的手机信息返回。
 */

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class TestPhone {
    public static void main(String[] args) {
        //1. 创建集合对象
        ArrayList<Phone> list =new ArrayList<>();

        //2. 创建手机的对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        //3. 添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4. 调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        //5. 遍历结合，打印
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + " " + phone.getPrice());
        }
    }

    //1. 我要干嘛？ 查询手机信息
    //2. 我干这件事需要什么才能完成？ 集合
    //3. 调用处是否需要使用方法的结果？ 返回低于3000的手机信息，并在控制台打印
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //创建一个手机对象，并将集合中的手机信息赋值给该对象
            Phone p = list.get(i);
            int price = p.getPrice();

            //如果当前手机的价格低于3000，那么就把手机对象添加到resultList中
            if(price < 3000){
                resultList.add(p);
            }
        }

        return resultList;
    }
}
