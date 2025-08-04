package ch05_package_inheritance.mysport;

public class Sport extends SportMain {
    private String name;
    private int entry;

    public Sport(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }


    protected void showInfo() {
        System.out.println(name+" 경기는 "+entry+" 명의 엔트리로 구성됩니다");
    }
}
