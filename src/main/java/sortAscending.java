import java.util.Arrays;
import java.util.Scanner;

public class sortAscending {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myPersonalArray = {1, 2, 3, 4, 5, 6};
        int[] anotherArray = myPersonalArray;
        System.out.println(myPersonalArray.toString());
        System.out.println(anotherArray.toString());

        System.out.println(Arrays.toString(myPersonalArray));
        System.out.println(Arrays.toString(anotherArray));

        System.out.println("Enter 5 numbers");
        int[] myIntArray = new int[6];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = scanner.nextInt();
            System.out.println("The value for index " + i + " is " + myIntArray[i]);
        }


        int[] ascendingOrder = myIntArray;
        boolean flag = true;
        int temp; // temp does not reference same object in memory as it's a new variable
        while (flag) {
            flag = false;
            for (int i = 0; i < ascendingOrder.length - 1; i++) {
                //10, 100, 120, 40, 30
                if (ascendingOrder[i] > ascendingOrder[i + 1]) {
                    temp = ascendingOrder[i];
                    ascendingOrder[i] = ascendingOrder[i + 1];
                    ascendingOrder[i + 1] = temp;
                    flag = true;
                }
            }
        }

        for (int i = 0; i < ascendingOrder.length; i++) {
            System.out.println("The ascended array is " + ascendingOrder[i]);
        }
    }

}
