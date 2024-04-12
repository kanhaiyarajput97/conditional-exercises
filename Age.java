import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("firstPerson Age");
        int firstPersonAge = s.nextInt();
        System.out.println("secondPerson Age");
        int secondPersonAge = s.nextInt();
        System.out.println("thirdPerson Age");
        int thirdPersonAge= s.nextInt();

       int oldest = Math.max(firstPersonAge, Math.max(secondPersonAge, thirdPersonAge));
       int yongest = Math.min(firstPersonAge, Math.min(secondPersonAge, thirdPersonAge));

       // Displaying the results
       System.out.println("Oldest person's age: " + oldest);
       System.out.println("Youngest person's age: " + yongest);


    }
}