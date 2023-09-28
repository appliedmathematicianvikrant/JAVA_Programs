/**********************************************************************************
 *** Auhtor: Vikrant Kumar Verma                                               ****
 *** Date: 28 September 2023                                                   ****
 *** Objective: To check if all the chracters in a string are unique or not    ****
 ***                                                                           ****
 **********************************************************************************/



import java.util.Scanner;

public class Unique_Chars{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to test.");
        String str = in.next();
        int length = str.length();
        int count = 0;
        for(int i = 0; i < str.length();i++){
            for(int j = 0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){       // the inner for loop will run for each character of string
                    count++;
                }
            }
        }
        if (count == str.length()) {
            System.out.println("All the characters in the string are unique.");
        } else {
            System.out.println("The characters in the string are repetitive.");
        }
    }
}