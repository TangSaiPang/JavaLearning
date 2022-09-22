import java.util.Scanner;
import java.util.ArrayList;

public class TestArrayList{
	public static void main(String[] args){
		//1. 创建集合
		ArrayList<Student> list1 = new ArrayList<>();
     	ArrayList<Teacher> list2 = new ArrayList<>();
		
		//2. 创建学生对象和老师对象
     	Scanner scan = new Scanner(System.in);
     	Student stu1 = new Student(scan.next(), scan.nextInt());
     	Student stu2 = new Student(scan.next(), scan.nextInt());
     	Student stu3 = new Student(scan.next(), scan.nextInt());
        
     	Teacher t1 = new Teacher(scan.next(), scan.nextInt());
     	Teacher t2 = new Teacher(scan.next(), scan.nextInt());
     	Teacher t3 = new Teacher(scan.next(), scan.nextInt());
		//3. 添加元素进集合
     	list1.add(stu1);
     	list1.add(stu2);
     	list1.add(stu3);

     	list2.add(t1);
     	list2.add(t2);
     	list2.add(t3);

     	//4. 遍历集合
     	for (int i = 0; i < list1.size(); i++) {
         	//i 索引 list.get(i)  元素/学生对象
         	Student stu = list1.get(i);
         	System.out.print(stu.getName() + "\t" + stu.getAge() + "\t");
    	}
     	System.out.println();

        for (int i = 0; i < list2.size(); i++) {
            //i 索引 list.get(i)  元素/学生对象
            Teacher t = list2.get(i);
            System.out.print(t.getName() + "\t" + t.getAge() + "\t");
        }
        System.out.println();
	}
}
