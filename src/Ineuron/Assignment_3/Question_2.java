
package Ineuron.Assignment_3;

public class Question_2 {
    public static String reverse(String s){

        char []arr=s.toCharArray();

        char []arr1=new char[arr.length];

        int count=0;

        for(int i=arr.length-1;i>=0;i--) {

            arr1[count] = arr[i];

            count++;
        }

        String revString="";

        for(char i:arr1) {


            revString=revString+i;

        }

//        System.out.println(revString);

        return revString;
    }
    public static String reverse1(String s) {

        String s1="";
        String s2="";
        int mid=0;
        for(int i=0;i<s.length();i++) {

            if(s.charAt(i)==' ') {

                mid=i;


            }

        }

        for(int i=0;i<mid;i++) {


            s1=s1+s.charAt(i);

        }

        for(int i=mid+1;i<s.length();i++) {


            s2=s2+s.charAt(i);

        }

        String result = reverse(s1)+" "+reverse(s2);

        return result.toLowerCase();

    }

    public static void main(String[] args) {
        System.out.println(reverse1("Think Twice")) ;

    }
}
