package fiilehandling;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\bufferdemo.txt");
            BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fileOutputStream);
            String str = "welcome";
            byte[]arr= str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("file write successfully");

            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream= new FileInputStream("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\bufferdemo.txt");
            BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream);
            int i= bufferedInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i=bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
