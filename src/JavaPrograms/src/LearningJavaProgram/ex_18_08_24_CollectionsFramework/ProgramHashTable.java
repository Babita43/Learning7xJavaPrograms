package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.Hashtable;
import java.util.Map;

public class ProgramHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hs = new Hashtable<>();
        //1. It is old type similar like map
        //2. it does not accept nnull either key or value
        //3. it is synchronized
        //4.it is slow
        hs.put("id", 1);
        hs.put("id1", 2);
        hs.put("id2", 1);
        System.out.println(hs);


    }


}
