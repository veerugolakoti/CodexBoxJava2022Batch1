package smrutiranjan.practice.excedemo.trycatchex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowEx {
    void throwEx()throws IOException
    {
        FileReader file = new FileReader("D:\\SmrutiRanjanWorkspace");
        BufferedReader fileInput = new BufferedReader(file);
        for(int i = 0; i<3; i++ )
            System.out.println(fileInput.readLine());
        fileInput.close();
        }
    }

