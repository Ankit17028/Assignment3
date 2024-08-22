//1. WAP to reverse a String.
//        Input: “iNeuron”
//        Output: “norueNi”


package Ineuron.Assignment_3;

public class Question_1 {
    public static String reverse(String s){

        char [] arr = s.toCharArray();

        char [] arr1 = new char[arr.length];

        int cnt=0;

        for(int i=arr.length-1;i>=0;i--) {

            arr1[cnt] = arr[i];

            cnt++;
        }

        String revString = "";

        for(char i:arr1) {


            revString = revString+i;

        }

        System.out.println(revString);

        return revString;
    }
    public static void main(String[] args) {
        reverse("iNeuron");
    }
}
