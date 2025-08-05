package ch05_package_inheritance.animalpkg01;

public class Lion01 extends Animal01{
    private int leg;

    public void showInfo(){
        super.showInfo();
        String message=this.getName()+"이(가) 다리 개수는 "+this.leg+"개입니다";
        System.out.println(message);

    }

    public Lion01(String name, int lifespan, String habitat , int speed, int leg) {
        super(name,lifespan,habitat,speed);
        this.leg =leg;

    }

    public void run(){
        String messsage=this.getName()+"이(가) "+this.getSpeed()+" 의 속도로 달려 갑니다.";
        System.out.println(messsage);
    }
}
