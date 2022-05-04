import java.util.Scanner;

public class findMinimumArrayValue {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] userInput = new int[4];
        int[] userInputs = readIntegers(userInput);
        int minimumValue = findMin(userInputs);
        int minimumValue2 = findMin2(userInputs);

        System.out.println("Min value is " + minimumValue);
        System.out.println("Min value is " + minimumValue2);
    }

    private static int findMin2(int[] userInputs) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < userInputs.length; i++) {
            int value = userInputs[i];

            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int[] readIntegers(int[] userInput) {
        System.out.println("Enter 4 numbers");
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        return userInput;
    }

    public static int findMin(int[] myArray) {
        int temp;
        // 50, 100, 20, 200, 45
        //20, 45, 50, 100, 200
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("Lowest value in the array is " + myArray[0]);
        return myArray[0];
    }

}
