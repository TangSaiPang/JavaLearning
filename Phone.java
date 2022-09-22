public class Phone {
    //1. 私有化成员变量
    private String brand;
    private int price;

    //2. 构造无参方法
    public Phone() {
    }

    //3. 构造带全部参数方法
    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    //4. 创建 set/get 方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
