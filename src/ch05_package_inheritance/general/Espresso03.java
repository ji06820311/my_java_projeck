package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int sohtCount; // 샷 추가 개수

    public Espresso03(String name, double price, int sohtCount) {
        super(name,price);
        this.sohtCount = sohtCount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷 추가 개수 :" + this.sohtCount);
        System.out.println();;
    }


}
