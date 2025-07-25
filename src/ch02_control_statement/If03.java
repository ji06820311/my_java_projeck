package ch02_control_statement;

public class If03 {
    public static void main(String[] args) {
        int su = 3 ;

        if (su%3 == 0) {
            System.out.println(su + "는(은)3의 배수입니다");
            System.out.println(su*su);

        }else {
            System.out.println("3의 배수가 아닙니다");
            System.out.println(su+5);

        }
        int su2 = 7;

        if (su2%3 == 0){
            System.out.println(su2 +"는(은)3의 배수 입니다");
            System.out.println(su2*su2);

        }else {
            System.out.println(su2 + "는(은)3의 배수가 아닙니다");
            System.out.println(su2+5);

        }
    }
}
