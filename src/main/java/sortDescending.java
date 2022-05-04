import java.util.Scanner;

public class sortDescending {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] userInputs = printArray();

        sortArrayInDescendingOrder(userInputs);

    }

    private static int[] printArray() {
        System.out.println("Enter 5 values");
        int[] valuesInputted = new int[5];
        for (int i = 0; i < valuesInputted.length; i++) {
            valuesInputted[i] = scanner.nextInt();
            System.out.println("index " + i + " has a value of " + valuesInputted[i]);
        }
        return valuesInputted;
    }

    private static void sortArrayInDescendingOrder(int[] userInputs) {
        int[] sortedArray = new int[userInputs.length];
        for (int i = 0; i < userInputs.length; i++) {
            sortedArray[i] = userInputs[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("the array sorted by descending order is " + sortedArray[i]);
        }

    }

}
