import java.util.Scanner;
public class AreaParallelogram{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram");
        double base = in.nextDouble();
        System.out.println("Enter the height of the parallelogram");
        double height = in.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is "+ area);

    }
}