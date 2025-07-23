package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {

        double width;      //너비   //변수 실수(double) 정의
        double height;     //높이
        double area;       //면적
        double perimeter;  //둘레

        width = 10.0;  //변수 실수(double) 대입
        height = 5.0;
        area = width * height;
        perimeter = 2.0 * (width + height);

        System.out.println("사각형의 넓이: " + area);     //변수 실수(double) 결과 출력
        System.out.println("사각형의 둘레: " + perimeter);



    }
}
