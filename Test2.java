/**
 * Test2
 */
public class Test2 {

    public static void main(String[] args) {

        String s = "ABca123a2";
        int count = 0;
        for(int i = 0; i<s.length();i++){
        if (s.charAt(i)=='a'||s.charAt(i)=='A') {
            count++;

            System.out.println("no of 'a's in the string    "+ count);
            
        }
    }
    }
}