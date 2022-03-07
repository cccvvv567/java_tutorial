import java.util.ArrayList; // import the ArrayList class

public class ex_array_list {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Apple");
        arr.add("Grape");

        arr.set(1,"Banana");

//        arr.remove(1);
//        arr.set(1,"Banana");
        arr.clear();
        for(String i : arr){
            System.out.println(i);
        }
    }
}

