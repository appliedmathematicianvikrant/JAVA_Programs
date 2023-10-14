

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the base of the pyramid");
        double length = in.nextDouble();
        System.out.println("Enter the width of the base of the pyramid");
        double width = in.nextDouble();
        System.out.println("Enter the height of the pyramid");
        double height = in.nextDouble();
        double volume = (length * width * height)/3;
        System.out.println("The volume of the pyramid is "+ volume);

    }
}
