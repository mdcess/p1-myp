package src.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {

    public static void writeFile(String content, String path) {
    
        File file = new File(path);

        file.getParentFile().mkdirs();

    
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

}