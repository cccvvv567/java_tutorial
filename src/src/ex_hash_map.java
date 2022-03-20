import java.util.HashMap; // import the HashMap class
import java.util.ArrayList;
public class ex_hash_map {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        HashMap<Integer, ArrayList<Integer>> object = new HashMap<>();
        System.out.println(object.get(2));
        int[] numList = {2,3,5,7,11};
        for(int num: numList){
            for (int i = 1; i <= 100; i++) {
                if (i % num == 0) {
                    if(object.get(num) == null){
                        ArrayList<Integer> arrList = new ArrayList<>();
                        arrList.add(i);
                        object.put(num,arrList);
                    }else {
                        ArrayList<Integer> arrList = object.get(num);
                        arrList.add(i);
                        object.put(num,arrList);
                    }
                }
            }
        }
        System.out.println(object);
    }
}

////1-100
//2,3,5,7,11
//"2": [4,6,8,10,12,14]
//"3": [3,6,9,12]

//import java.util.HashMap; // import the HashMap class
//
//public class ex_hash_map {
//    public static void main(String[] args) {
//        HashMap<String, String> object = new HashMap<String, String>();
//        object.put("England","London");
//        object.put("Taiwan","Taipei");
//        System.out.println("object>>>" + object);
//        System.out.println("England>>>" + object.get("England"));
//        System.out.println("Taiwan>>>" + object.get("Taiwan"));
//    }
//}

////1-100
//2,3,5,7,11
//"2": [4,6,8,10,12,14]
//"3": [3,6,9,12]