package ch05_package_inheritance.general;

//           서버클래스 extends 슈퍼클래스 상속을 받는 입장
public class Americano03 extends Beverage03 {
    private double waterAmount ; //투입하는 물의 양

    public Americano03(String name, double price, double waterAmount) {
       // super(); // 부모님의 생성자 호출
        super(name,price);
        this.waterAmount = waterAmount;
    }



    public void printinfo() {
        super.showInfo();
        System.out.println("투입된 물의 량 :" + this.waterAmount);
        System.out.println();
    }
}
