package ch04_class;

public class MovieMain04 {
    public static void main(String[] args) {
        Movie04[] movie = new Movie04[1];   //대상 총합 개수        //2번째로 작성

        // 위에는 대상 종합 개수면 이거는 그냥 각각 대상 개수를 적는다 예를들면 두개의 대상이 있으면 0(1) 1(2) 2(3) 이렇게 5개의 대상이 있으면 하나씩 줄여들어서 개수는 4개
        movie[0] = new Movie04("판사스틱4", "matt Shakman", 114, 13.000); //하나이면 0, 둘이면 2

        for (int i = 0; i < movie.length; i++) { //5번째 작성
            movie[i].display();
        }

    }
}
