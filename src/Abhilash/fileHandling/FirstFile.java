package Abhilash.fileHandling;

import java.io.File;
import java.io.IOException;

public class FirstFile {
    public File getFile() throws IOException {
        File file = new File("first.txt");
        if(file.createNewFile()){
            System.out.println("file is created" + file.getName());
        }


        return file;
    }


}
