package ch05_package_inheritance.animalpkg01;

public class Eagle01 extends Animal01 {
    private int wing;

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName()+"의 날개 개수는 "+this.wing+"개입니다.";
        System.out.println(message);
    }


    public Eagle01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing=wing;
    }

    public void  fly(){
        String message = super.getName()+"이(가) "+super.getSpeed()+"속도로 날아 다닙니다.";
        System.out.println(message);
    }
}
