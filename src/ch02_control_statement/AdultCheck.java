package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동"; //이름
        int age = 25;  // 나이
        int _gender = 4; // 주민 번호 뒷자리 성별(숫자)
        String gender; // 성별(한글)
        String abult; // 미성년자 여부 문자열
        System.out.println("이름 :" + name);

        if (age >= 19) {
            abult = "성인";

        } else {
            abult = "미성년자";

        }

        if (_gender == 1 || _gender == 3) {
            gender = "남자";

        } else {
            gender = "여자";
        }
        String messge;
        messge = "이름 : " + name + "님, 나이 : " + age + "세, 성인 체크 " + abult + ", 성별 :" + gender;
        System.out.println(messge);






    }
}
