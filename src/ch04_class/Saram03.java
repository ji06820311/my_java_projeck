package ch04_class;

public class Saram03 {
    // 접근 지정자 private.pubic,기본
    // private는 비밀 그리고 코딩규정에서 권장
    // public는 비밀을 공개하는 그리고 private에서 public으로 반환(반환타입)
    //set(쓰기)(void 반드시 앞에는 대문자 -> this )  get(읽기) (메소드 -> return) 이걸 메소드라고 합니다
    // this 참조 변수  인스턴스와 지역변수 구별 할 때
    private String name;// 인스턴스 변수
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
