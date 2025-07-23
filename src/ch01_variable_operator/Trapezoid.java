package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {

        double bottom;    //변수 정의
        double top;
        double height;
        double area;

        bottom = 20.0;   // 변수 대입
        top = 10.0;
        height = 15.0;
        area = (bottom + top) * height / 2.0;

        String result = "밑변 : " + bottom;  //문자열
        result = result + "\n윗변 : " + top;
        result = result + "\n높이 : " + height;
        result = result + "\n면적 : " + area;

        System.out.println(result);    //값 출력
    }
}
