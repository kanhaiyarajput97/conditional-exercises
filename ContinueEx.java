public class ContinueEx {
    public static void main(String[] args) {

        String week_days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        for (String name : week_days) {

            if (name == "Saturday" || name == "Sunday") {
                continue;

            }
            System.out.println(name);

        }

    }
}
