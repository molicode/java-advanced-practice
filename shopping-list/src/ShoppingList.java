import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> list;
    private String file;

    public ShoppingList(String filename) throws IOException {
        loadList(filename);
        file = filename;
    }

    private void loadList(String filename) throws IOException {
        list = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
    }

    public String getItem(int position) throws PositionException{
        try {
            return list.get(position - 1);
        } catch (ArrayIndexOutOfBoundsException e){
             throw new PositionException("Position outside the limits of the list", e);
        }
    }

    public void insertElement(String element) throws IOException {
        try (FileWriter fstream = new FileWriter(file, true); BufferedWriter out = new BufferedWriter(fstream)) {
            out.write("\n" + element);
            loadList(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
