import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the salary amount");
        float salary = s.nextFloat();
        
        System.out.println("please enter you service of year");
        int yearOfService = s.nextInt();

        if (yearOfService > 5) {
            System.out.println("your bonus " + salary * 0.05);

        }else{
            System.out.println("you r not elesible for bonus");
        }

    }
}