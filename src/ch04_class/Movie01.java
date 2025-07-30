package ch04_class;

public class Movie01 {
    //단계 1 : 클래스 정의
    String name;   //영화 이름
    String director; // 영화 감독
    int time ; //영화 시간
    double money ; //영화 가격

    String showMoneyinfo(){
        String bb = " ";
        if(money>=13.000 && money<=15.000){
            bb= "비싼 영화";
        }else if(money>=10.000 && money<=12.000){
            bb= "요즘 시대에 그리 비싸지 않는 영화";
        }else{
            bb= "10.000 미만은 완전히 저렴한 영화 16.000 이상은 완전 비싼 영화";
        }
        String message = name+ " 은(는) " + bb;
        return message;
    }

    String showMovieinfo(){
        String aa = " ";
        if(time >= 117 && time <= 120){
            aa = "시간이 지루한 영화";
        }else if(time >= 113 && time <= 116){
            aa = "시간이 적당한 영화";
        }else if(time >= 100 && time <= 112){
            aa = "시간이 적당해서 추천영화";
        }else {
            aa = "시간 비추천 영화";
        }
        String message = name + " 은(는) " + aa;
        return message ;
    }
}
