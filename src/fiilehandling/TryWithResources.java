package fiilehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\test.txt");

        try(FileOutputStream fileOutputStream= new FileOutputStream((file))) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
