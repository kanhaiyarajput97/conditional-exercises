package LoopsAndArrays;

import java.util.Scanner;

public class AddAllEvenNo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number  ");
        int limit = s.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= limit) {
            if (i % 2 == 0) {
                sum = sum + i;
            } 
            i++;
        }
        System.out.println("result  " +sum);

    }
}
