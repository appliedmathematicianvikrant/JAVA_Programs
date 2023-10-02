package Tree;

import java.util.Scanner;;

class Node {
    int data;
    Node left, right;

    public Node(int val) {
        this.data = val;
    }
}

public class Binary_Tree {
    Scanner in = new Scanner(System.in);
    Node root;

    public void insertRoot() {
        System.out.println("Enter the value of the root Node.");
        int value = in.nextInt();
        root = new Node(value);
        insertNodes(root);

    }

    public void insertNodes(Node node) {
        System.out.println("Do you want to enter left of " + node.data);
        boolean left = in.nextBoolean();
        if (left) {
            System.out.println("Enter the value  left of " + node.data);
            int value = in.nextInt();
            node.left = new Node(value);
            insertNodes(node.left);
        }
        System.out.println("Do you want to enter right of " + node.data);
        boolean right = in.nextBoolean();
        if (right) {
            System.out.println("Enter the value right of " + node.data);
            int value = in.nextInt();
            node.right = new Node(value);
            insertNodes(node.right);
        }

    }

    public void displayTree(){
        displayNodes(root);
    }

    void displayNodes(Node node){
            if(node == null){
                return;
            }
            System.out.println(node.data);
            displayNodes(node.left);
            displayNodes(node.right);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Binary_Tree tree1 = new Binary_Tree();
        tree1.insertRoot();
        tree1.displayTree();

    }
}
