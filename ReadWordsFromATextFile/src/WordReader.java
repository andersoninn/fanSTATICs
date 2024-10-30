import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class WordReader implements Iterable {

    public Iterator<String> readFileByLine(String file) throws IOException {

        // create a new file reader
        FileReader reader = new FileReader(file);

        // wrap the file reader using a buffered reader
        BufferedReader bReader = new BufferedReader(reader);

        String line = "";
        String result = "";

        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }
        String[] resultInString = result.split(" ");

        Arrays.stream(resultInString).iterator();
        /*
        for (int i = 0; i < resultInString.length; i++) {
            System.out.println(resultInString[i]);

        };

         */

        bReader.close();
        return Arrays.stream(resultInString).iterator();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
