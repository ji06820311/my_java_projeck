package ch01_variable_operator;

public class PlusMinus02 {
    public static void main(String[] args) {
        int x = 3, y = 5, z;

        z = x++ + --y ; // x = 4 + y = 4
        //3   1 2  4
        System.out.println("x : " + x); // x = 3 + 1 = 4
        System.out.println("y : " + y); // y = 5 - 1 = 4
        System.out.println("z : " + z); // z = 3 + 4 = 7

        z += --x + y++ ;
        // 2  4  3    1
        //z = z + --x + y++
        //  4   2  1  3  5

        System.out.println("x : " + x); // x = 4 - 1 = 3
        System.out.println("y : " + y); // y = 4 + 1 = 5
        System.out.println("z : " + z); // z = 4 + 7 + 3 = 14
    }
}
