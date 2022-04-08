package math_problems;

import java.sql.SQLOutput;

public class Pattern {

    /**
     * INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     * <p>
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     */

    public static void main(String[] args) {

//        int i = 100;
//        while (i >= 90) {
//            System.out.println(i + " ");
//            i--;
//        }
//        int x = 90;
//        while (x>70){
//            x = x-2;
//            System.out.println(x+ " ");
//        }
//        int p = 70;
//        while (p >= 41) {
//            System.out.println(p + " ");
//            p = p -3;
//        }
//        int q = 40;
//        while (q>=0){
//            System.out.println(q + " ");
//            q = q-4;
//        }
//
//    }
        int num = 100;
        int count = 1;
        int secondCount = 1;
        while (num >= 0) {

            System.out.print(num + " ");

            num -= secondCount;
            count++;
            if (count == 11) {
                count = 1;
                secondCount++;
            }
        }
    }
}