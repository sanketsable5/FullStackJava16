package fiilehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        //character stream


        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\test.txt");
            fileWriter.write("Today is Wednesday");
            System.out.println("file write successfully");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\test.txt");
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
