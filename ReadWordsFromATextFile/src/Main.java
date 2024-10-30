import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String FILE_PATH = "/Users/codecadet/Documents/LoremIpsum.rtf";

    public static void main(String[] args) throws FileNotFoundException {

        WordReader reader = new WordReader();

        try {
            String[] wordReader = new String[]{String.valueOf(reader.readFileByLine(FILE_PATH))};
            for (String word : wordReader) {
                System.out.println(word);
/*
        Integer<String> iterator = wordReader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
 */
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
