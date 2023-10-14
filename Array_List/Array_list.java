import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Vikrant");
        arr.add("Shrikant");
        arr.add("Ravikant");
        arr.add(0,"Hello");
        arr.remove("Hello");
        arr.remove(1);
        if(arr.contains("Ravikant")){
            System.out.println("Yes");
        }
    }
}
