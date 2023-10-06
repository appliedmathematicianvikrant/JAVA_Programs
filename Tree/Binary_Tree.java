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
        displayNodes(this.root, "");
    }

    public void displayNodes(Node node, String indent){
            if(node == null){
                return;
            }
            System.out.println(indent + node.data);
            displayNodes(node.left, indent + "\t");
            displayNodes(node.right ,indent + "\t");
        }

        public void goodDisplay(){
            nicedisplay(root, 0);
        }
        public void nicedisplay(Node node, int level){
            if(node == null){
                return;
            }
            nicedisplay(node.right, level + 1);
            if(level !=0){
                for(int i = 0; i < level - 1; i++){
                    System.out.print("|\t\t");
                }
                System.out.println("---------->"+ node.data);
            }else{
                System.out.println(node.data);
            }
            nicedisplay(node.left, level+1);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Binary_Tree tree1 = new Binary_Tree();
        tree1.insertRoot();
       // tree1.displayTree();
        tree1.goodDisplay();

    }
}
