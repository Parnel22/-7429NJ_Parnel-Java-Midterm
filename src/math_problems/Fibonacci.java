package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {

        int previousNumber = 0;
        int nextNumber = 1;

        int i=1;
        while(i <= 40)
        {
            System.out.print(previousNumber+" ");

            int sum = previousNumber + nextNumber;

            previousNumber = nextNumber;

            nextNumber = sum;

            i++;
        }

    }
}

