package HashMap;
import java.util.*;


public class practice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pramod", 72);
        map.put("Ajay", 60);
        map.put("Rashmi", 48);
        map.put("Roshan", 65);

//        System.out.println(map.containsKey("Ajay"));
//        System.out.println(map.get("Pramod"));
//        System.out.println(map.entrySet());
//        System.out.println(map.keySet());
//
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // alternative way to print key and keyvalue
        Set<String>keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
    }


}