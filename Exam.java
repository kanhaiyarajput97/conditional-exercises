import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("no of classes Held");
        int held = s.nextInt();
        System.out.println("Number of classes attended");
        int attended = s.nextInt();
        int actualPrecentage = ((attended * 100) / held);

        System.out.println("Precentage " + actualPrecentage);

        if (actualPrecentage > 75) {
            System.out.println("student is allowed to sit in exam " + actualPrecentage + '%');

        } else {
            System.out.println("student is not allowed to sit in exam " + actualPrecentage + '%');
        }
    }
}
