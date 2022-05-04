import java.util.Arrays;

public class ReverseChallenge {

    public static void main(String[] args) {
        int[] myIntArray = {11, 21, 14, 48, 500, 1022};
        System.out.println("Array: " + Arrays.toString(myIntArray));
        reverse(myIntArray);
        System.out.println("Reversed Array " + Arrays.toString(myIntArray));
    }

    //{11,21,14,48,500,1022}
    //{1022,500,48,14,21,11}
    private static void reverse(int[] array) {
        int lastArrayElement = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[lastArrayElement - i];
            array[lastArrayElement - i] = temp;
        }
    }


}
