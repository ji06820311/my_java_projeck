package ch04_class;

public class MovieMain03 {
    public static void main(String[] args) {
        Movie03 fatasti4 = new Movie03();
        // 쓰기
        fatasti4.setName("판타스틱4");
        fatasti4.setDirector("matt Shakman");
        fatasti4.setTime(114);
        fatasti4.setMoney(13000.0);
        // 읽기
        System.out.println("영화 이름은 :" + fatasti4.getName());
        System.out.println("영화 감독은 :" + fatasti4.getDirector());
        System.out.println("영화 시간은 :" + fatasti4.getTime() + "분");
        System.out.println("영화표 가격은 :" + fatasti4.getMoney());

    }
}
