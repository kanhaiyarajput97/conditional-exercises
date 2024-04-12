import java.util.Scanner;

/**
 * Practice3
 */
public class Practice3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter vthe quantity");
        int Quantity = s.nextInt();
        int Price = 100;
        int cost = Quantity * Price;
        if (cost > 1000) {
            System.out.println("the final cost with discount " + (cost - cost * 0.1));

        } else {
            System.out.println("Final cost " + cost);
        }
    }
}