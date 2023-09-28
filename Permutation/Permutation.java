import java.util.Scanner;

public class Permutation{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the first string");
    String str1 = in.next();
    System.out.println("Enter the second string");
    String str2 = in.next();
    if(str1.length() != str2.length()){
        System.out.println("The strings are not permuation of each other");
    }else{
        for(int i = 0; i < str1.length();i++){
            int countStr1 = 0;
            for(int j = 0; j< str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    countStr1++;
                }
            }
            int countstr2 = 0;
            for(int k = 0; k< str1.length();k++){
                if(str1.charAt(i)== str2.charAt(k)){
                    countstr2++;
                }
            }
            if(countStr1 != countstr2){
                System.out.println("The strings are not permuations of each other");
                break;
            }
           
        }
         System.out.println("The strings are permutations of each other");
    }
}
}