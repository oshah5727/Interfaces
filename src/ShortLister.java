import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ShortLister {
    public static void main(String[] args) throws IOException {

        JFileChooser fileChooser = new JFileChooser();

        int chooserValue = fileChooser.showOpenDialog(null);

        if (chooserValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            ShortWordFilter filter = new ShortWordFilter();

            ArrayList<String> shortWords = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (filter.accept(word)) {
                        shortWords.add(word);
                    }
                }
            }
            reader.close();

            System.out.println("The short words in the file are:");
            for (String word : shortWords) {
                System.out.println(word);
            }
        }
    }
}
