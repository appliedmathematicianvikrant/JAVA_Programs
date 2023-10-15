
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks obtained(out of 100)");
        double marks = in.nextDouble();
        gradePrinter(marks);
    }
    public static void gradePrinter(double marks){
        if(marks <= 40){
            System.out.println("Fail");
        }else if(41 <= marks && marks <= 50){
            System.out.println("DD");
        }else if(51 <= marks && marks <= 60){
            System.out.println("DD");
        }else if(41 <= marks && marks <= 50){
            System.out.println("CD");
        }else if(61 <= marks && marks <= 70){
            System.out.println("BC");
        }else if(71 <= marks && marks <= 80){
            System.out.println("BB");
        }else if(81 <= marks && marks <= 90){
            System.out.println("AB");
        }else if(91 <= marks && marks <= 100){
            System.out.println("AA");
        }
    }
}
