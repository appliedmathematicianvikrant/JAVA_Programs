import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = in.next().trim().charAt(0);
    
        if('a' <= character && character <= 'u'){
            System.out.println("You have entered a vowel");
        }else {
            System.out.println("You have enetered a consonant");
        }
    }
}
