package ch04_class;

public class MovieMain04 {
    public static void main(String[] args) {
        Movie04[] movie = new Movie04[1];   //대상 총합 개수

        movie[0] = new Movie04("판사스틱4", "matt Shakman", 114, 13.000); //하나이면 0, 둘이면 2


        for (int i = 0; i < movie.length; i++) {
            movie[i].display();
        }

    }
}
