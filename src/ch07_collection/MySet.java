package ch07_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();    //<타입> set가 복수이름
        //원소 넣기
        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear();

        set.add("아메리카노");
        set.add("에스프레스");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";

        System.out.println(findData + "존재 여부 : " + set.contains(findData)); //boolean 반환타입

        if (set.contains(findData)) {
            System.out.println(findData + " 있음");
        } else {
            System.out.println(findData + "없음");
        }

        // '마키야또'가 존재하는 지 확인하시고, 없으면 추가해 주세요
        String addData = "마키야또";
        if (set.contains(addData) == false) {
            set.add(addData);
        }
        ;
        //'믹스커피' 가 가 존재하면 삭제하고 '삭제 성공'이라는 문구를 출력해 보세요
        // remove() 메소드를 사용하여 '믹스커피'를 삭제하고 '삭제 성공'이라는 문구를 출력해 주세요.
        // 없으면 '존재하지 않음'이라는 문구를 출력해 보세요
        String bddData = "믹스커피";
        if (set.remove(bddData)) {
            System.out.println(bddData + " 삭제 성공");
        } else {
            System.out.println(bddData + "는 목록에 존재하지 않는군요");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");
        // for(타입 단수이름:복수이름){...}  복수 이름은 set임  타입은 Object
        for (Object item : set) {
            System.out.println(item);
        }

        System.out.println("요소 크기" + set.size());

    }
}
