package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        //참조 변수 인스턴스
        Saram03 ysuin = new Saram03();
        Saram03 soon = new Saram03();

        ysuin.setName("김유신");
        ysuin.setHeight(173.5);
        ysuin.setWeight(65.2);
        ysuin.setHobby("축구");
        ysuin.setBlood("A");

        soon.setName("유관순");
        soon.setHeight(165.4);
        soon.setWeight(52.6);
        soon.setHobby("야구");
        soon.setBlood("B");

        System.out.println("이름 :" + ysuin.getName());
        System.out.println("키 :" + ysuin.getHeight());
        System.out.println("몸무게 :" + ysuin.getWeight());
        System.out.println("취미 :" + ysuin.getHobby());
        System.out.println("혈액형 :" + ysuin.getBlood());

        System.out.println("이름 :" + soon.getName());
        System.out.println("키 :" + soon.getHeight());
        System.out.println("몸무게 :" + soon.getWeight());
        System.out.println("취미 :" + soon.getHobby());
        System.out.println("혈액형 :" + soon.getBlood());

    }
}
