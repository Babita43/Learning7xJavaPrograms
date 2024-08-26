package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentProgComparator {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent("Sbhishek", 4);
        CollegeStudent cs1 = new CollegeStudent("Bbhi", 2);
        CollegeStudent cs2 = new CollegeStudent("Hbhinav", 1);
        CollegeStudent cs3 = new CollegeStudent("Abhirr", 3);
        ArrayList arr = new ArrayList();
        arr.add(cs);
        arr.add(cs1);
        arr.add(cs2);
        arr.add(cs3);
        System.out.println(arr);
        Collections.sort(arr, new sortId());
        System.out.println(arr);
        Collections.sort(arr, new sortName());
        System.out.println(arr);
        Collections.sort(arr,new sortIdBydesc());
        System.out.println(arr);
        Collections.sort(arr,new sortNameByDesc());
        System.out.println(arr);
    }
}
class sortName implements Comparator<CollegeStudent> {

    @Override
    public int compare( CollegeStudent o1, CollegeStudent o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class sortNameByDesc implements Comparator<CollegeStudent> {

    @Override
    public int compare( CollegeStudent o1, CollegeStudent o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class sortId implements Comparator<CollegeStudent>{

    @Override
    public int compare(CollegeStudent o1, CollegeStudent o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class sortIdBydesc implements Comparator<CollegeStudent>{

    @Override
    public int compare(CollegeStudent o1, CollegeStudent o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}
class CollegeStudent {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    CollegeStudent(String name, Integer id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}