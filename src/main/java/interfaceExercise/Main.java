package interfaceExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Players tim = new Players("Tim", "Shotgun", 15, 1);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHealthPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
//        loadObject(tim);
        System.out.println(tim);

        Monsters siobhan = new Monsters("Siobhan", "weak", 3, 20, 46);
        Monsters eoghan = new Monsters("Eoghan", "medium", 5, 85, 200);
        System.out.println(siobhan);
        System.out.println(eoghan);

        saveObject(siobhan);
        saveObject(eoghan);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Chosen\n" +
                "1 to enter a string\n" +
                "0 to quite");

        while (!quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(Savable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Savable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
