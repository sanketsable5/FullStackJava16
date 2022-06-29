package fiilehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\test.txt");

        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            String str="Welcome";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

         try {
             FileInputStream fileInputStream=new FileInputStream(file);
             int i=fileInputStream.read();
             while (i>0){
                 System.out.print((char)i);
                 i= fileInputStream.read();
             }


         } catch (IOException e) {
             e.printStackTrace();
         }

    }

        }
