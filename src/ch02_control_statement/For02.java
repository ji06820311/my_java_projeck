package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int odd = 0, even = 0;

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.println("짝수의 종합: " + even);
        System.out.println("홀수의 종합: " + odd);
    }
}

