package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;  // 합계
        int count = 0;  // 횟수

        while (true) {     // while 무한 루프
            System.out.println("점수 입력 : ");
            int grade = scan.nextInt();

            if (grade < -10) { //숫자가 -10 미만인 경우에 대한 처리
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (grade < 0) {  // -10 이상의 음수에 대한 처리
                grade = -grade;
            } else {

            }
            total += grade;
            count++;
        }

    }
}
