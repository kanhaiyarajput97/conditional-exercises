public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int p = 0; p < i+2; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// *****