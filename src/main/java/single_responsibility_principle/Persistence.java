package single_responsibility_principle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
    /**
     * Provide Journal to write in provided fileName and with condition to overwrite or not
     * @param journal
     * @param fileName
     * @param overwrite
     */
    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(fileName).exists()) {
            try(PrintStream out = new PrintStream(fileName)) {
                out.println(journal.toString());
            }
        }

    }
}
