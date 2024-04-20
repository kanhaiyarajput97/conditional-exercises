import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("please enter highest number ");
        int n = s.nextInt();
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                System.out.println("Even "+ i);
            } else {
                System.out.println("Odd " + i);
            }
            i++;
        }

    }
}
