package LoopsAndArrays;

public class DisplayNumber {
    public static void main(String[] args) {
          display1();
          display2();
    
      
    }

    public static void display1(){
        for (int i = 1; i <= 10; i++) {

            if (i == 4 || i == 7 || i == 8) {
                continue;
            }

            System.out.println(i);

        }

    }

    public static void display2(){

        int i = 1;
        while (i <= 10) {
            if (i == 4  || i == 7 || i == 8) {
               i++;
                continue;
            }
    
            System.out.println(i);
            i++;
            
        }

    }

}
