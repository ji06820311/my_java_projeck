package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name;
    private double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public final void showData() {
        System.out.println("음료" + getName() + "단가는 " + getPrice() + "입니다");
    }

    public abstract void drink();

    public abstract void make();
}

