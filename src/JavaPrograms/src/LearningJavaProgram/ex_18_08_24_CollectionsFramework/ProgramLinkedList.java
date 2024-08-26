package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("Node_1");
        link.add("Node_2");
        link.add("Node_3");
        link.add("Node_4");
        System.out.println(link);

        ArrayList arr = new ArrayList();
        arr.add("Node_1");
        arr.add("Node_2");
        arr.add("Node_3");
        arr.add("Node_4");
        System.out.println(arr);

        System.out.println("Both print the same result, only the difference is arr will store in continuous memory and linked will store in nodes");

        Stack  st= new Stack();
        System.out.println("it is based on last in first out , we use push to add. pop to remove and peep to see element on top");
        st.add("book1");
        st.add("book2");
        st.add("book3");
        st.add("book4");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.empty());

    }
}
