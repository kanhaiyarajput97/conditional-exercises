package LoopsAndArrays;

public class DisplayMissingNumber {

    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int n = number.length + 1;
        int result = getMissingNumber(n, number);
        System.out.println(result);

    }

    public static int getMissingNumber(int n, int[] number) {
        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;
        for (int element : number) {
            
            actualSum = actualSum + element;
        }

        int missingNumber = expectedSum - actualSum;

        return missingNumber;

    }
}
