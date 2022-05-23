package junaid.sampleproject.exceptionhandling;
// Checked Exception at compile Time
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException
{
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Windows\\System32\\notepad.exe");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (int count = 0; count < 5; count++)
        {
            System.out.println(bufferedReader.read());
            bufferedReader.close();
        }
    }
}
