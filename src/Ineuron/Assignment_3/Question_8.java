package Ineuron.Assignment_3;

public class Question_8 {
    public static int specialNo(String s) {

        int n=0;

        int special=0;

        for(char e:s.toCharArray()) {


            if(e>='A'&&e<='Z') {

                n++;


            }else {
                special++;
            }
        }

        System.out.println("special no is: "+ special);

        return n;
    }



    public static void main(String[] args) {
        String inputString = "This is a string with *special* characters!";
        int specialCharCount = specialNo(inputString);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}



