package LoopsAndArrays;

import java.util.Scanner;

public class AddAllOddNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int limit = s.nextInt();
        int sum = oddSum(limit);
        System.out.println("result  " + sum);

    }

    public static int oddSum(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {

            if (i % 2 != 0) {

                sum = sum + i;

            }

        }
        return sum;
    }
}
