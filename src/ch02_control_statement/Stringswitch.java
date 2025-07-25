package ch02_control_statement;

public class Stringswitch {
    public static void main(String[] args) {
        String manth = "January.";
        int Number = 0;

        switch (manth) {
            case "January":
                Number = 1;
                break;
            case "February":
                Number = 2;
                break;
            case "March":
                Number = 3;
                break;
            case "April":
                Number = 4;
                break;
            case "May":
                Number = 5;
                break;
            case "June":
                Number = 6;
                break;
            case "July":
                Number = 7;
                break;
            case "August":
                Number = 8;
                break;
            case "September":
                Number = 9;
                break;
            case "October":
                Number = 10;
                break;
            case "November":
                Number = 11;
                break;
            case "December":
                Number = 12;
                break;
            default:
                System.out.println("잘못 입력 되었습니다. 퇴장입니다");
                System.exit(0); // 퇴장
        }
        String message = manth + "은(는) " + Number + "월입니다.";
        System.out.println(message);
    }
}
