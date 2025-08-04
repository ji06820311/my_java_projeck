package ch05_package_inheritance.mysport;

public class SportMain {
    public static void main(String[] args) {
        BaseBall base = new BaseBall("야구",9,9,0.412);

        FootBall foot = new FootBall("축구",11,1,5);
        foot.display();

        base.display();


    }

}
