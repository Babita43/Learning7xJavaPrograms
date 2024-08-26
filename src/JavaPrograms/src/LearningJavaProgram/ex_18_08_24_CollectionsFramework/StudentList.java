package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student(2,"Aman");
        Student s2 = new Student(4,"Daman");
        Student s3 = new Student(3,"Pawan");
        Student s4 = new Student(1,"Amit");
        List li = new ArrayList();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
    }
}

//Drawback of comparable -it can sort one data at time like if I sorted by id I can not sort by name, so its solution is Comparator
class Student implements Comparable<Student>{
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }

    private   Integer id;
    private  String name;

    Student( Integer id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }
}
