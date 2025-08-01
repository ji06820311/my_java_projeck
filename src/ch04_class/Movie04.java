package ch04_class;

import java.text.DecimalFormat;

public class Movie04 {
    private String name;      //1번째로 작성
    private String director;
    private int time;
    private int money;

    public Movie04(String name, String director, int time, int money) {   //3번째로 작성
        this.name = name;
        this.director = director;
        this.time = time;
        this.money = money;
    }


    public void display() { // 4번째로 작성
        System.out.println("영화 이름은 :" + this.name);
        System.out.println("영화 감독은 :" + this.director);
        System.out.println("영화 시간은 :" + this.time);
        System.out.println("영화표 가격은 :" + this.money);

        DecimalFormat df = new DecimalFormat("###,###.##");


        String formattedNumber = df.format(money);
        System.out.println(formattedNumber);
    }
}


