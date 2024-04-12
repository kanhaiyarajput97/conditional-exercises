import java.util.Scanner;

public class Abs {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int output = s.nextInt();
        System.out.println("Absolute number " + Math.abs(output));

    }
}
