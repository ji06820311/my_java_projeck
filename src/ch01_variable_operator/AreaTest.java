package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {

        double radiur; //반지름     //변수 실수(double) 정의
        double Pl; //원주율

        radiur = 10.0;         //변수 대입
        Pl = 3.14;

        double area; // 면적
        area = Pl * radiur * radiur;

        System.out.println("반지름이" + radiur + "일 때");     //변수값출력
        System.out.println("원즤 면적은" + area + "입니다");
    }
}
