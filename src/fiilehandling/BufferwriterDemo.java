package fiilehandling;

import java.io.*;

public class BufferwriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter= new FileWriter("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\bufferdemo.txt");

            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write("today is thursday");
            System.out.println("file write successfully");

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader= new FileReader("C:\\Users\\91749\\IdeaProjects\\FullStackJava\\src\\fiilehandling\\bufferdemo.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            int i=bufferedReader.read();
            while (i>0) {
                System.out.print((char) i);
                i = bufferedReader.read();
            }
            fileReader.close();
            bufferedReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
