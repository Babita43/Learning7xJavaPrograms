package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction;

public class NestedClass {
    public static void main(String[] args) {
        School sc = new School();
        sc.cla();
//To call the nested class
        School.Students st = sc.new Students();
        st.books();
    }
}
class School{
    int a = 10;
    void cla(){
        System.out.println("from 1st class to higher school");
    }
    class Students{
        void books(){
            System.out.println("Physics books given to them");
        }
    }
}