package single_responsibility_principle;

import org.omg.SendingContext.RunTime;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * If we would add save, load methods in the Journal class, it would require to handle separation of concerns
 * So better to make a separate Persistence class
 */
public class SRPMain {
    public static void main(String[] args) throws IOException {
        Journal j = new Journal();
        j.addEntry("Hello! Good Morning.");
        j.addEntry("All set");
        System.out.println(j);

        String filePath = "./src/main/java/single_responsibility_principle/journal.txt";
        Persistence p = new Persistence();
        p.saveToFile(j, filePath, true);
        Runtime.getRuntime().exec("open "+filePath);
    }
}
