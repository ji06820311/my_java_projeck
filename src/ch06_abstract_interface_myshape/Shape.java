package ch06_abstract_interface_myshape;

public abstract class Shape {
    //일반화 : 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 색상등은 수퍼 클래스에서 사용합니다.
    protected double area;   //면적
    protected double perimeter;  // 도형의 둘레
    private String linecolor; // 라인 색상
    private String fillcolor; // 채우기 색상

    //내용이 정의되지 않는 모델 개념으로, 불완전한 매소드입니다.
    public abstract double calcArea();

    public abstract double calcPerimeter();

    public abstract void display();


    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    public Shape() {

    }
}
