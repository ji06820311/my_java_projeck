package ch02_control_statement;

public class Multilf01 {
    public static void main(String[] args) {
        int temperature = 24;
        String news;

        if (temperature >= 35) {
            news = "폭염 경보";
        } else if (temperature >= 30) {
            news = "무더운 날씨";
        } else if (temperature >= 20) {
            news = "쾌적한 날씨";
        } else if (temperature >= 10) {
            news = "쌀쌀한 날씨";
        } else {
            news = "추운 날씨";
        }
        String message = temperature + "도는 " +news+ "입니다.";
        System.out.println(message);
    }
}
