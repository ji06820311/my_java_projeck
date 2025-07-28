package ch02_control_statement;

public class Forswitch01 {
    public static void main(String[] args) {
        //for / switch 구문
        int odd = 0, even = 0;  // odd(홀수),even(짝수
        for (int i = 1; i < 11; i++) {
            switch (i % 2) {
                case 1:
                    odd += i;
                    break;
                case 0:
                    even += i;
                    break;
            }
        }
        System.out.println("짝수의 종합 :" + even);
        System.out.println("홀수의 종합 :" + odd);
    }
}
