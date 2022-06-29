package practice;

public class OneAndZero {
    public static void main(String[] args) {
        int k= 10101001;
        Integer k1= new Integer(k);
        char[] chars= k1.toString().toCharArray();

        int countOne=0, countZero=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='1'){
                countOne++;
            }else {
                countZero++;
            }
        }
        System.out.println("one=" +countOne);
        System.out.println("zero=" +countZero);
    }
}

