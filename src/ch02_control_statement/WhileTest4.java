package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;  // 합계
        int count = 0;  // 횟수

        while (true){
            System.out.println("점수 입력 : ");
            int grade = scan.nextInt();

            if(grade < -10){
                System.out.println("프로그램을 종료합니다.");
                break;

            }else if(grade <0) {
                grade = -grade;
            }else {

            }
            total += grade;
            count++;
        }

    }
}
