package ch02_control_statement;

public class Multilf02 {
    public static void main(String[] args) {
        int age = 10;
        double ticket = 1000.0 ;
        double discoount;  //한인율
        String msg;

        if(age < 8){
            msg = "유아(무료 입장)";
            discoount = 0;
        }else if(age < 14) {
            msg = "어린이(50% 할인)";
            discoount = ticket * 0.5;
        }else if(age < 20){
            msg = "청소년(30%할인)";
            discoount = ticket * 0.7;
        }else if(age >= 65) {
            msg = "노인(40% 할인)";
            discoount = ticket * 0.6;
        }else{
              msg = "성인(정가)";
              discoount = ticket ;
        }
            System.out.println(age + "살 : " + msg + "가격은" +(int)discoount+ "원입니다");

    }
}
