package smrutiranjan.practice.excedemo.checkuncheck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

  //  private String s;

  //  public UncheckedException(String s) {
     //   this.s = s;

 //   }

    void checkExce() throws FileNotFoundException {
        try{

            FileReader fr = new FileReader("ja.txt");
            BufferedReader br = new BufferedReader(fr);

        }catch(FileNotFoundException e){
        System.out.println("File Not Found Exception is handled by try catch :");

        }
    }
}

