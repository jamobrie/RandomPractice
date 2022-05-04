package MobileExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);

    public void printArray(ArrayList<String> phoneList) {
        for (int i = 0; i < phoneList.size(); i++) {
            System.out.println("Phone details are: " + i + " : " + phoneList.get(i));
        }
    }

    public void addNewContact(ArrayList<String> phoneList) {
        System.out.println("Enter a new contact name");
        phoneList.add(scanner.nextLine());
    }

    public void updateExistingContact(ArrayList<String> phoneList) {
        System.out.println("Enter Contact To Search For: ");

        String searchedText = scanner.nextLine();
        if (phoneList.isEmpty() || !phoneList.contains(searchedText)) {
            System.out.println("No contact with those details exists");
        } else {
            System.out.println("Enter text to rename contact");
            String replacedText = scanner.nextLine();
            System.out.println("Updated name is " + replacedText);
        }
    }

    public void removeContact(ArrayList<String> phoneList) {
        String enteredName = scanner.nextLine();
        if (phoneList.isEmpty() || !phoneList.contains(enteredName)) {
            System.out.println("No contact with those details exists");
        } else {
            int positionToDelete = 0;
            for (int i = 0; i < phoneList.size(); i++) {
                if (phoneList.get(i).contains(enteredName)) {
                    positionToDelete = i;
                }
            }
            phoneList.remove(positionToDelete);
            System.out.println("Contact matching " + enteredName + " has been deleted");
        }
    }

    public void findExistingContact(ArrayList<String> phoneList) {
        System.out.println("Enter Contact To Search For: ");

        String searchedText = scanner.nextLine();
        if (phoneList.isEmpty() || !phoneList.contains(searchedText)) {
            System.out.println("No contact with those details exists");
        } else {
            System.out.println("Contact has been found for " + searchedText);
        }
    }

}
