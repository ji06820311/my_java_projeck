package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        // 타입이 두 가지면 무조건 오브잭트     //타입을 모르면 무조건<>확인
        List<String> coffeeList = new ArrayList<String>();  //String를 <여기에 넣으면> add는 문조건 문자열만
        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키야또");
        coffeeList.add("카페라떼");

        int idx = -1;                            // 앞에 서 찾을때 IndxOF
        String findData = "카페라떼";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        idx = coffeeList.lastIndexOf(findData);   // 뒤에서 찾을때 lastIndxOF
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        //'카푸치노' 항목이 존재하지 않으면, 2번째 위치에 추가해 보세요.
        findData = "카푸치노";
        if (coffeeList.indexOf(findData) == -1) {
            coffeeList.add(2, findData);
        }

        System.out.println("확장 for 구문을 이용한 출력");
        for (String coffee : coffeeList) {
            System.out.print(coffee + "\t");
        }
        System.out.println();

        findData = "골드 브루";
        coffeeList.set(5, findData);

        findData = "카푸치노";
        coffeeList.remove(findData);

        coffeeList.add(findData);

        for (String xx : coffeeList) {
            System.out.println(xx);
        }

        String item = coffeeList.get(3);
        System.out.println("특정 위치 요소:" + item);


        System.out.println("일반 for 구문으로 요소 출력하기");
        for (int i = 0; i < coffeeList.size(); i++) {
            String data = coffeeList.get(i);
            System.out.println(data);
        }


        System.out.println("요소 크기 :" + coffeeList.size());
    }
}
