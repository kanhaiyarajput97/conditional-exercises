public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int p = 0; p < i+1; p++) {
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