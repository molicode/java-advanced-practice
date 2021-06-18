import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> list;

    public ShoppingList(String filename) throws IOException {
        loadList(filename);
    }

    private void loadList(String filename) throws IOException {
            list = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
    }

    public String getItem(int index) {
        if (index <= list.size()) {
            return list.get(index);
        } else {
            return "Element not found";
        }
    }
}
