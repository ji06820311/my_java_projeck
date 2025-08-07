package ch06_abstract_interface.enimaltest;

public interface Bird {
    final int speed = 300;
    // public static final int speed = 300; public static 이게 숨겨저 있어요.

    void fly();
    // public abstract void fly(); 이거랑 똑같은것 public 있나 없나 똑같은 것

    default void flutter(){ // 기본 동작 정의
        System.out.println("날개를 펄력입니다");
    }
}
