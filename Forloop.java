import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("please enter no");
        int no = s.nextInt();
        
        for(int i = 0; i <= no;  i++){

            if (i % 2==0) {
                System.out.println("even no  " + i);
            }
           else{
            System.out.println("odd no " + i);

           }
            
        }
    }
}
