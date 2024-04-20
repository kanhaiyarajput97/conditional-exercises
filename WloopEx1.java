import java.util.Scanner;

public class WloopEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = s.nextLine();

        System.out.println("please enter no");
        int limit = s.nextInt();
       
        WloopEx1.printer(limit,name);
    }

    public static void printer(int limit,String name){
        int i = 1;
        while (i <= limit) {
            System.out.println(name + " " + i);
            i++;
        }
    }
}
