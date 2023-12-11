
import java.util.Scanner;

public class LinkedListManagement {
    Node head;
    Node tail;
    int size;

    LinkedListManagement() {
        head = null;
        tail = head;
        size = 0;
    }

    public void addFirst() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element you want to add");
        int data = in.nextInt();

        Node node = new Node(data);
        if (head == null) {
            System.out.println("The linked list is empty and this is the first node");
            head = node;
            tail = head;
            System.out.println("First node added successfully");
            size++;
            displayList();
        } else {
            Node temp = head;
            head = node;
            node.next = temp;
            size++;
            System.out.println("The element was successfully added at the front");
            displayList();
        }
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public void createList() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elements do you want to add");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the element");
            int data = in.nextInt();
            Node node = new Node(data);
            if (head == null) {
                head = node;
                tail = head;
                size++;
            }else{
            Node temp = head;
            head = node;
            node.next = temp;
            size++;
            }
        }
        displayList();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
