import java.util.Scanner;

class Practice1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("please enter the length no");
        int L = s.nextInt();
        System.out.println("please enter the width no");
        int W = s.nextInt();
        if (L == W) {
            System.out.println("Squire");
       } else {
            System.out.println("rictengle");
        }

    }
}