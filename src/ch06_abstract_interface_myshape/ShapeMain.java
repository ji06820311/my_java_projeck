package ch06_abstract_interface_myshape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
                new Triangle("yellow", "black", 15.0, 10.0),
                new Rectangle("red", "green", 20.0, 10.0),
                new Circle("pink", "blue", 5.0, 3.0, 4.0)
        };

        for (int i = 0; i < shape.length; i++) {
            shape[i].display();
            System.out.println();
        }
    }
}
