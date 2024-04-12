import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("please enter the first no");
        int A = s.nextInt();
        System.out.println("please enter the second no");
        int B = s.nextInt();
        if (A > B) {
            System.out.println("Big no  " + A);

        } else if (B > A) {
            System.out.println("Big no "+ B);

        }

        else {
            System.out.println("Both no is same");

        }

    }
}