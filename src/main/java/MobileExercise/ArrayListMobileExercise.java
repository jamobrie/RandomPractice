package MobileExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMobileExercise {

    //POOR ATTEMPT

    //SEE PROPER example online

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> phoneList = new ArrayList<>(8);

    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        printInstructions();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a No: ");
            int enteredNumber = scanner.nextInt();

//            if (phoneList.indexOf(2))


            switch (enteredNumber) {
                case 1:
                    mobilePhone.findExistingContact(phoneList);
                    break;
                case 2:
                    mobilePhone.removeContact(phoneList);
                    break;
                case 3:
                    mobilePhone.updateExistingContact(phoneList);
                    break;
                case 4:
                    mobilePhone.addNewContact(phoneList);
                    break;
                case 5:
                    if (phoneList.isEmpty()) {
                        System.out.println("Phone List is empty");
                    } else {
                        mobilePhone.printArray(phoneList);
                    }
                    break;
                case 8:
                    printInstructions();
                    break;
                case 9:
                    System.out.println("Exiting Program");
//                    flag = false;
                    break;
            }

            scanner.nextLine();
        }
        scanner.close();
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - find contact");
        System.out.println("\t 1 - Remove contact ");
        System.out.println("\t 2 - Update contact");
        System.out.println("\t 3 - Add contact");
        System.out.println("\r 4 - print contact info");
        System.out.println("\r 5 - To search for an item in the list.");
        System.out.println("\r 8 - See instructions");
        System.out.println("\r 9 - Exit App");
    }


}

