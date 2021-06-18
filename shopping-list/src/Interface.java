import java.io.IOException;
import java.util.Scanner;

public class Interface {

    private ShoppingList shoppingList;

    public Interface(String file) {
        try {
            shoppingList = new ShoppingList(file);
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println("There was a problem with the file my-list.txt");
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosenOption;
        do {
            System.out.println("To exit enter 0");
            System.out.println("To view an item enter the item's position");
            chosenOption = scanner.nextInt();
            if (chosenOption != 0) {
                showItem(chosenOption);
            }
        } while (chosenOption != 0);

    }

    private void showItem(int index) {
        System.out.println("Item number: " + index + " in the list is: " + shoppingList.getItem(index));
        System.out.println("");
    }
}
