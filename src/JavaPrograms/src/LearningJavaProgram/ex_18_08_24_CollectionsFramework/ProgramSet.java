package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.*;

public class ProgramSet {
    public static void main(String[] args) {
        //List allows duplicate
        //set does not allow duplicate, in this duplicate entry clears by GC
        //In set we can not use For loop, we can use for each and iterator
        System.out.println("Hashset :");
        //Hashset does not print array in order
        Set s1 = new HashSet(); //use the hashing mechanism means using short name and it does not show in order
        s1.add("Mapple");
        s1.add("Apple");
        s1.add("Watermelon");
        s1.add("Mango");
        s1.add("Watermelon"); // this duplicate entry clear by gc
        System.out.println(s1);
        System.out.println(s1.equals("Orange"));
        System.out.println(s1.size());
        for (Object s : s1) {
            System.out.println(s);

        }
        System.out.println("LinkedSet :");
        Set lset = new LinkedHashSet(); // in this order is maintained and print array in same order
        lset.add("Maple");
        lset.add("Sample");
        lset.add("Apple");
        lset.add("Maple");
        System.out.println(lset);

        Iterator itr = lset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("TreeSet :");
        System.out.println("For sorting in sets , we can use Tree set");
        System.out.println("Drawback :  ");
        Set ts = new TreeSet();
        ts.add("Sky");
        ts.add("Tie");
        ts.add("Dye");
        ts.add(null);
        System.out.println(ts);

    }
}
