package practice;

public class FirstLetterCap {
    public static void main(String[] args) {
        String str="seven";
        char[]chars =str.toCharArray();
        Character character =Character.toUpperCase(chars[0]);
        chars[0]=character;
        System.out.println(chars);
    }
}
