package Methods;

public class MethodOverloading {
    public static void main(String[] args) {

        sum(9, 5.6, 4);

        // double num2 = sum(10.5,15.5);
        // System.out.println("double "+ num2);

    }

    public static int sum(int x, int y, int z) {
        int r = x + y + z;
        System.out.println("3 sum  " + r);
        return r;
    }

    public static double sum(double x, double y, double z) {
        double r = x + y + z;
        System.out.println("3 sum double " + r);
        return r;
    }

    public static double sum(double x, double y) {
        double z = x + y;
        System.out.println("double  " + z);
        return z;
    }

    public static double sum(int x, int y) {
        double z = x + y;
        System.out.println("mix  " + z);
        return z;
    }
}
