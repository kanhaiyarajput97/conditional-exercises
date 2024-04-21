public class ForEachEx1 {
    public static void main(String[] args) {

        String[] cars = { "bolero", "swift", "bmd", "bolero", "swift", "bmd" };

        for (String name : cars) {
            System.out.println(name);
        }

        System.out.println("***************************************************************************");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("***************************************************************************");

        int i = 0;
        while (i < cars.length) {
            System.out.println(cars[i]);
            i++;
        }

        System.out.println("***************************************************************************");

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);
        System.out.println(cars[5]);
    }
}
