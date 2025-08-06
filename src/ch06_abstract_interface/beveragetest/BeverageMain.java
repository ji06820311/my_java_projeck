package ch06_abstract_interface.beveragetest;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage[] bevera = {
                new Americano("아메리카노", 4000.0, 250.0),
                new Espresso("에소프레소", 2000.0, 1),
                new Latte("바나나 라떼", 3000.0, "바나나 우유")

        };

        for (int i = 0; i < bevera.length; i++) {
            bevera[i].showData();
            bevera[i].drink();
            bevera[i].make();
            System.out.println();
        }

    }
}

