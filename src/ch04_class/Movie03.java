package ch04_class;

public class Movie03 {
    private String name;
    private String director;
    private int time;
    private double money;

    //setName(쓰기)
    public void setName(String name) {
        this.name = name;
    }

    //getName(읽기)
    public String getName() {
        return name;
    }

    // setTime(쓰기)
    public void setTime(int time) {
        this.time = time;
    }

    // getTime(읽기)
    public int getTime() {
        return time;
    }

    // setDirector(쓰기)
    public void setDirector(String director) {
        this.director = director;
    }

    //getDirector(일기)
    public String getDirector() {
        return director;
    }

    //setMoney(쓰기)
    public void setMoney(double money) {
        this.money = money;
    }

    //getMoney(읽기)
    public double getMoney() {
        return money;
    }


}
