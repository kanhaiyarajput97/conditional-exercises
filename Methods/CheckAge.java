package Methods;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the age");
        int age = s.nextInt();
        ChekAge(age);
    }

    public static void ChekAge(int age) {

        if (age > 18) {
            System.out.println("it is apply for vote");

        } else {
            System.out.println("it is not apply for vote");
        }

    }

}
