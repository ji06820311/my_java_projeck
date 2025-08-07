package ch06_abstract_interface.cartest;

public interface Radio {
    // 인터페이스 내에 선언된 static 매소드는 모든 구현체 클래스들이 사용할 수 있습니다.
    static void plat(Frequency frequency, double channel) {
        String fraq = "";
        if (frequency == Frequency.FM) {
            fraq = "FM";
        } else {
            fraq = "AM";
        }
        String message = "라디오 " + fraq + " 채널 " + channel + "을 재생합니다";
        System.out.println(message);
    }

    // 인터페이스 내에 default 매소드는 2개 이상 작성이 가능하며, 필요하다면 오바라이딩도 가능합니다.
    default void sayHwllo(String carName, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("안녕~~방가워~~" + carName);
        }
    }
}
