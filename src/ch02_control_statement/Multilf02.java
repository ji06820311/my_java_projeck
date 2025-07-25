package ch02_control_statement;

public class Multilf02 {
    public static void main(String[] args) {
        int age = 10;
        double ticket = 1000.0;
        double df;  //한인율
        String msg;

        if (age < 8) {
            msg = "유아(무료 입장)";
            df = 0;
        } else if (age < 14) {
            msg = "어린이(50% 할인)";
            df = ticket * 0.5;
        } else if (age < 20) {
            msg = "청소년(30%할인)";
            df = ticket * 0.7;
        } else if (age >= 65) {
            msg = "노인(40% 할인)";
            df = ticket * 0.6;
        } else {
            msg = "성인(정가)";
            df = ticket;
        }
        System.out.println(age + "살 : " + msg + "가격은" + (int) df + "원입니다");

        int odl = 19;
        int sc = 85;
        String na = "홍길동";
        String aa;

        if (odl >= 20 && sc >= 90) {
            aa = "님은 성인이며 우수 회원입니다";

        } else if (odl >= 20 && sc < 90) {
            aa = "님은 성인이지만 일반 회원 입니다";
        } else {

            aa = "님은 미성년자 입니다";
        }
        System.out.println(na + aa);

        int ge1 = 1;

        if (ge1 == 1) {
            aa = "남성 입니다";

        } else if (ge1 == 2) {
            aa = "여성 입니다";
        } else {
            aa = "기타 입니다";
        }

        System.out.println(aa);

    }
}
