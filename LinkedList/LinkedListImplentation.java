import java.util.Scanner;

public class LinkedListImplentation {

    Node head;
    Node tail;
    int size;

    LinkedListImplentation(){
        head = null;
        tail = head;
        size = 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedListImplentation l1 = new LinkedListImplentation();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
      
       
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        l1.insertAtIndex(100, 2);
        l1.deleteAtIndex(3);
        l1.displayData();
        l1.sizeDisplay();

    }

    private void deleteAtIndex(int index) {
        Node prev = null;
        Node temp = head;
        if (index == 0) {
            deleteAtFirst();
        }else if(index == size){
            deleteAtLast();
        }else{
            for(int i = 1; i <= index; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            size--;
        }
    }

    public void deleteAtFirst() {
        head = head.next; 
        size--; 
    }

    public void deleteAtLast(){
        Node temp = head;
        for (int i = 1; i <= size-2 ; i++) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
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

    public void addLast(int data){
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void displayData(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtIndex(int data, int index){
        if (index == 0) {
            addFirst(data);
        }else if (index == size) {
            addLast(data);
        }else{
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void sizeDisplay(){
        System.out.println("The size of the linked list is "+ size);
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
