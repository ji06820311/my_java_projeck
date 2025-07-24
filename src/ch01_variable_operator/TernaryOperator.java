package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a =3, b = 50 ;
        int result = a >= b ? a-b : b-a;

        System.out.println("절대 값 :" + result);

        int x =10 ;
        result = x%2 == 0 ? x + 3 : x * x ;
        System.out.println("결과 :" + result);

        x = 8 ;
        int y = 4 ;

        result = x >= y ? x : y ;
        System.out.println("큰 수 :" + result);

        result = x <= y ? x : y ;
        System.out.println("작은 수 :" + result);

        x = 5 ;
        y = 12;
        String str = y%x == 0 ? "yes" : "no";
        System.out.println("결과 : " + str);

        String message ;
        int su = 7;
        // 숫자 7은(는) 홀수 입니다.
        message = su%2!=0 ? "숫자" + su + "은(는) 홀수 입니다." : "";
        System.out.println(message);


        int score = 98;
        message = score != 100 ? "아쉬워요" :"만점입니다" ;
        System.out.println(message);

        int number = 13;
        message= number % 2 !=0 ? "홀수" : "짝수";
        System.out.println(message);

        String userid = "guest";
        message = userid == "admin" ? "관리자 로그인" : "일반 사용자";
        System.out.println(message);

        int great = 82;
        message = great >= 90 ? "A학점" : great >=80 ? "B학점" : "c학점";
        System.out.println(message);

        number = 13;
        message = number % 2 ==0? "짝수": "홀수";
        System.out.println(message);







    }
}
