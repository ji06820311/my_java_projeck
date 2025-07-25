package ch02_control_statement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 10;
        int day = 0 ;

        switch (month){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                System.out.println("월 입력이 잘못 입력되었습니다");
                System.exit(0); //프로그램 강제 종료
        }

        System.out.println(month + "월의 마지막 날은 " + day + "일입니다");
    }
}
