package rajat.sample.exceptionhandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionClass {
    public void getFileNotFoundMethod(){
        File file = new File("E://photo.jpg");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("This file is not present in E-drive so plz check again");
        }
    }
}
