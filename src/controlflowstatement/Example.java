package controlflowstatement;

public class Example {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,6,7,8};
        boolean flag=false;

        for (int i=0;i< arr.length-2;i++){
            if (arr[i]+arr[i+1]+arr[i+2]==7){
                flag=true;
            }
        }
        System.out.println(flag);
    }

}
