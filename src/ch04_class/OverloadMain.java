package ch04_class;

public class OverloadMain {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        double x = 1.1, y = 2.2;

        OverAdd obj = new OverAdd();

        obj.Add(a,b);
        obj.Add(x,y);

        int resiut = obj.Add(a, b,c);
        System.out.println("반환 결과 :" + resiut);
    }
}
