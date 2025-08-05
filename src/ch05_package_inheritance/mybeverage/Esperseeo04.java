package ch05_package_inheritance.mybeverage;

public class Esperseeo04 extends Beverage04 {
    private int shotCount;

    @Override
    public String toString() {
        String messsage = ", 샷 추가 :"+ this.shotCount+"개수";
        return super.toString()+messsage;
    }

    public void drinkEsperseeo(){
        String message = "맛이 진하고 강력한 "+super.getName()+"을(를) 마십니다." ;
        System.out.println(message);
    }

    public Esperseeo04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
}
