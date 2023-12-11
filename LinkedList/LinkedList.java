import java.util.Scanner;

public class LinkedList{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a choice");
        System.out.println("1: Add an element in front\n2: Add an element at last\n3: Remove the element by index\n4: Remove the element by index\n5: Remove the element by value\n6: Show the list\n7: Create the linked list");
        int choice = in.nextInt();
        LinkedListManagement l1 = new LinkedListManagement();

        switch (choice) {
            case 1:
                l1.addFirst();
                break;
            case 7:
                l1.createList();
        
            default:
                break;
        }


    }
}