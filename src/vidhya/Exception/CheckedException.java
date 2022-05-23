package vidhya.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.FileNameMap;

public class CheckedException {
    public static void main(String[] args) {
           // throws CloneNotSupportedException {

        String FileName = "file doesn't exist";

            File file = new File(FileName);
           try {
               FileInputStream stream = new FileInputStream(file);
           } catch (FileNotFoundException e) {
                System.out.println("this exception comes when your files doesn't exist");

           }
        }
    }
