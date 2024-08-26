package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapWithDataType {
    public static void main(String[] args) {
        //We can also add data type in map key value
        Map<String, Integer> kv = new HashMap() ;
        kv.put("id",123);
        kv.put("id2",1234);
        kv.put("id3",1235);
        kv.put("id4",null); // value null can allow multiple times
        kv.put("id5",null);
        kv.put("id6",null);
        kv.put(null,123);
        kv.put(null,1234);// key null allow one time and takes only last value

        System.out.println(kv);
        for (Map.Entry<String,Integer> item: kv.entrySet()){
            //for(Map.Entry<dt,dt> name : refrencename.entrySet())
            System.out.println(item.getKey() + " >" +item.getValue());
        }
    }
}
