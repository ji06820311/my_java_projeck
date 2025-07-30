package ch04_class;

public class MovieMain01 {
    public static void main(String[] args) {
        //단계 2 : 객체 생성
        Movie01 fantasti4 = new Movie01();

       //단계 3 : 객체의 맴버 변수에 쓰기 작업
        fantasti4.name = "fantasti4";
        fantasti4.director ="Matt Shakman";
        fantasti4.time = 114;
        fantasti4.money = 13.000;

        //단계4 : 객체의 맴버 변수의 값을 출력
        System.out.println("영화 이름 :" + fantasti4.name);
        System.out.println("영화 감독 :" + fantasti4.director);
        System.out.println("영화 시간 :" + fantasti4.time);
        System.out.println("영화 가격 :" + fantasti4.money);

        String message = fantasti4.showMoneyinfo();
        System.out.println(message);

        message = fantasti4.showMovieinfo();
        System.out.println(message);;
    }
}
