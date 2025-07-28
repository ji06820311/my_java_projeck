package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 1; i < 10; i++) {
            String message = a +  "*"  + i +  "=" + (a*i);
            System.out.println(message);

        }
    }
}
