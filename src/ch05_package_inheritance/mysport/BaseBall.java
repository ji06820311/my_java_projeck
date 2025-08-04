package ch05_package_inheritance.mysport;

public class BaseBall extends Sport {
    private int innings;
    public double hitrate;

    public BaseBall(String name,int entry, int innings, double hitrate) {
        super(name,entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }



    public void display() {
        super.showInfo();
        System.out.println(innings+"개의 이닝으로 구성되며, 타율"+hitrate+"를 기록하였습니다");
        System.out.println();
    }
}
