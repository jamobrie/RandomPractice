import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

    List<Integer> myIntList;

    private static int[] myIntArray = new int[22];
    private static int[] mySecondIntArray = {1, 2, 3, 4, 5};

    private static ArrayList<String> shoppingList = new ArrayList<>();
    private static ArrayList<String> otherShoppingList = new ArrayList<>();

    public static void main(String[] args) {
        addShoppingItem("Banana");
        addShoppingItem("Banana");
        addShoppingItem("Banana");
        addShoppingItem("Banana");
        addShoppingItem("Banana");
        updateShoppingItem(4, "Apple");
        removeShoppingItem(2);
        findParticularValue("Apple");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println("Index of " + i + " has a value of " + shoppingList.get(i));
        }
    }

    private static String findParticularValue(String shoppingItem) {
        boolean exists = shoppingItem.contains(shoppingItem);
        int position = shoppingItem.indexOf(shoppingItem);
        if (position > 0) {
            return shoppingList.get(position);
        }
        return null;
    }

    private static void removeShoppingItem(int index) {
        String position = shoppingList.get(index);
        shoppingList.remove(position);
    }

    private static void updateShoppingItem(int position, String shoppingItemValue) {
        shoppingList.set(position, shoppingItemValue);
    }

    public static void addShoppingItem(String item) {
        shoppingList.add(item);
    }

}
