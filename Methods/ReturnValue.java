package Methods;

public class ReturnValue {

    public static void main(String[] args) {
        int input = 70;
       int result = increise100(input);
       System.out.println(result);

    }

    public static int increise100(int x) {
       int result = x + 100;
       return result;
    }
}
