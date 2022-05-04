package AutoBoxingChallenge;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
//    private static Bank bank = new Bank();
//    private static Branch branch = new Branch();
//    private static Customer customer = new Customer();

    public static void main(String[] args) {


        ArrayList<String> myBranchName = new ArrayList<>();
//        myBranchName.add(1, "asdasd", "2123");


        boolean flag = true;

        printInstructionsForBank();
        while (flag) {
            System.out.println("Enter a number: ");
            switch (scanner.nextInt()) {
                case 0:
                    flag = false;
                    System.out.println("Exiting Program");
                    scanner.close();
                case 1:
                    printInstructionsForBank();
                    break;

                case 2:
                    System.out.println("Enter New Branch Name");
                    String branchName = scanner.nextLine();
                    System.out.println("Would you like to add a customer with an initial transaction? Type Y for yes, or N for no");
                    if(scanner.nextLine().equals("y")){
                        System.out.println("Enter Customer Name");
                        String customerName = scanner.nextLine();
                        System.out.println("Enter initial transaction");
                        String transaction = scanner.nextLine();
//                        bank.addBranch(branchName, customerName, transaction);
                    }
//                    bank.addBranch(branchName);
                    break;


                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

            }
        }

    }

    public static void printInstructionsForBank() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - exit program");
        System.out.println("\t 1 - print instructions ");
        System.out.println("\t 2 - Add branch");
        System.out.println("\t 3 - Add contact");
        System.out.println("\r 4 - print contact info");
        System.out.println("\r 5 - To search for an item in the list.");
        System.out.println("\r 8 - See instructions");
        System.out.println("\r 9 - Exit App");
    }


}
