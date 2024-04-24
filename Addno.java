import java.util.Scanner;

public class Addno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the any first no");
        int x = s.nextInt();
        System.out.println("enter the any second no");
        int y = s.nextInt();

        System.out.println("addition  " + Addno.add(x, y));
        System.out.println("substraction  " + Addno.sub(x, y));
        System.out.println("multiplication  " + Addno.multi(x, y));

    }

    public static int add(int a, int b) {
        return a + b;

    }

    public static int sub(int a, int b) {
        return a - b;

    }

    public static int multi(int a, int b) {
        return a * b;
    }
}
