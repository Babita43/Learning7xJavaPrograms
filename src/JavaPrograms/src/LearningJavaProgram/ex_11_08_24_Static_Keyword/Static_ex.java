package JavaPrograms.src.LearningJavaProgram.ex_11_08_24_Static_Keyword;

public class Static_ex {
    public static void main(String[] args) {
        //static data and method called without creating object because it is common and created in class loader
        System.out.println("The course taken by students : " + coachingCenter.courseName);
        coachingCenter.doAssignment();
        coachingCenter cc = new coachingCenter("Amandeep");
// contructor is called when object is created
        System.out.println(cc.getStudentName());
      coachingCenter cc1 =  new coachingCenter("Mehak ", 6);
        System.out.println(cc1.getStudentName());
        coachingCenter cc2 = new coachingCenter();
    }
}

   class coachingCenter {
    //static - data member, methods, block and class( it is used as static when something is in common)
    //to call static data member and methods we do not need to create object, we can call it directly from classname
    // it is not common data type so we can not make it common

       //Encapsulation is used for this private data type
       //=================================================
static {
    //staic initialization block -SIB
           System.out.println("static block executed when the classname loads, only one time");
       }
       {
           //Instance initialization block
           System.out.println("This block is executed when every time new object is created");
       }
    private String studentName;
    int n;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
///////////////////////////////
       // constructor created
       coachingCenter()
       {
           System.out.println("to check when will it execute");
       }
       coachingCenter(String name) {
           this.studentName = name;
       }
       coachingCenter(String name, int no) {
           this.studentName = name;
           this.n = no;
       }
       ////////////////////////////
    static String courseName = "Banking"; // Course for banking common for all so we make it static

    static void doAssignment() {
        System.out.println("All students will do the given assignment");


    }
}