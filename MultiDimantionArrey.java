public class MultiDimantionArrey {
    public static void main(String[] args) {

        int[][] myNumbers = { { 10, 20, 30, 40 }, { 50, 60, 70 }, { 80, 90 }, { 100, 101 } };

        for (int row = 0; row < myNumbers.length; row++) {

            for (int col = 0; col < myNumbers[row].length; col++) {

                System.out.println(myNumbers[row][col]);
            }

        }

        // System.out.println(myNumbers[0][0]);
        // System.out.println(myNumbers[0][1]);
        // System.out.println(myNumbers[0][2]);
        // System.out.println(myNumbers[0][3]);
        // System.out.println(myNumbers[1][0]);
        // System.out.println(myNumbers[1][1]);
        // System.out.println(myNumbers[1][2]);
        // System.out.println(myNumbers[2][0]);
        // System.out.println(myNumbers[2][1]);
        // System.out.println(myNumbers[3][0]);
        // System.out.println(myNumbers[3][1]);

    }
}
