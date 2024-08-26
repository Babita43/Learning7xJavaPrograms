package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.*;

public class ProgramOfMaps {
    public static void main(String[] args) {


        System.out.println("HASHMAP");

        Map map = new HashMap();// as hash it does not print in order
        map.put("name","Babi");
      //  map.put("name","shoam");// it allows unique key so first one removed itself
        map.put(null,null);// onee key can be null
        map.put("id","465");
        System.out.println(map);
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("Babi"));
        System.out.println(map.get("id"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("LinkedMap");

        Map mp = new LinkedHashMap(); // in prints in array in order
        mp.put("Cs enabled" , "True");
        mp.put("Aan access" , "True");
        mp.put("Ban get value", "May be yes");
        System.out.println(mp);

        System.out.println("TREEMAP"); // it sorts and print

        Map mpo = new TreeMap(); // in prints in array in order
        mpo.put("Cs enabled" , "Crue");
        mpo.put("Aan access" , "Arue");
        mpo.put("Ban get value", "Bay be yes");
        System.out.println(mpo);
    }
}
