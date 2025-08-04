package ch05_package_inheritance.general;

// 상속을 하는 입장
public class Beverage03 {
    private String name;   //이름
    private double price;   //단가

    public Beverage03() {

    }

    //접근지정자 반환타입 생성자이름(매개변수){...}  // 생정자의 반환 타입은 적지 말라
    public Beverage03(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 :" + name);
        System.out.println("단가 : " + price);
    }
}
