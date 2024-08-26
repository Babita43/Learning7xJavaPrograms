package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;
import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args) {
        List arr = new ArrayList();  // we do not mention here size because size is not fixed as array
        //Display dispatch to fetch the functions of  list class
        // Or  ArrayList arr1 = new ArrayList(); this is also correct
        arr.add("allen");
        arr.add(123);
        arr.add(true);
        arr.add("John");
        arr.add("Alex");
        arr.add(123); // add to add array
        System.out.println(arr);  // this prints the array list

        // to print the list we used loop
        for (Object o : arr) {   // ArrayList<Object> allows you to store different types of objects in the same list.
            System.out.println(o);
        }
        System.out.println("++");

        Iterator<Object> str = arr.iterator();
        while (str.hasNext()) {
            System.out.println(str.next());
        }
            System.out.println("=================");
// to add data type of particular type we use wrapper class in bracket
            List<Character> ch = new ArrayList<Character>();  // as now we can only enter here charcaters
            ch.add('a');
            ch.add('e');
            ch.add('i');
            ch.add('o');
            ch.add('u');
            ch.add('a');
            System.out.println(ch);
            ch.remove(5); // it is used to remove element of paeticular index
            System.out.println(ch);
            System.out.println("=================");
            List<Integer> num = new ArrayList<Integer>();
            num.add(23);
            num.add(86);
            num.add(24);
            num.add(59);
            num.add(59);
            System.out.println(num);
            num.sort(Comparator.reverseOrder());
            System.out.println(num);
            num.addFirst(12);
            num.addLast(0);
            num.add(3, 2);
            System.out.println(num);
            System.out.println("=================");


            //only difference between arraylist and vector is- Vector is synchronized that is thread safe so it is time consuming
            Vector<Integer> v = new Vector<Integer>();
            v.add(5);
            v.add(3);
            v.add(2);
            System.out.println(v);
        }
    }
