import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("enter month no");
        int monthNo = s.nextInt();

        if (monthNo==1) {
            System.out.println("january");
            
        }else if (monthNo==2) {
            System.out.println("february ");
            
        }else if (monthNo==3) {
            System.out.println("march ");
            
        }else if (monthNo==4) {
            System.out.println("april ");
            
        }else if (monthNo==5) {
            System.out.println("may ");
            
        }else if (monthNo==6) {
            System.out.println("june ");
            
        }else if (monthNo==7) {
            System.out.println("july ");
            
        }else if (monthNo==8) {
            System.out.println("august ");
            
        }else if (monthNo==9) {
            System.out.println("september ");
            
        }else if (monthNo==10) {
            System.out.println("octuber ");
            
        }else if (monthNo==11) {
            System.out.println("november ");
            
        }else if (monthNo==12) {
            System.out.println("december ");
            
        }else{
            System.out.println("invalid month no");
        }

       

    }
    
}
