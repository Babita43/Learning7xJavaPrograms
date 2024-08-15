package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

public class StringBufferBuilder {
    public static void main(String[] args) {
        String name = "Amit";
        name = "Sharma"; // as string, it immutable, so  it does not change the name but create new one ,
        // so stringbulder and buffer is its solution
        System.out.println(name);
        StringBuffer name1 = new StringBuffer("Sky");
        name1.append("Akash");
        name1.append("Prabhjeet");
        System.out.println(name1);
// String buffer is slow becuase it is synchronized, it use thread safety means process one by one
        // so we use fast option where no thread safety is used that is "stringBuilder


        //*** one more strong reason to use builder because of more options like it can reverse in one line***
        StringBuilder name2 = new StringBuilder("Sodhi");
        name2.append("Suri");
        name2.append("SSS");
        name2.append("Abs");

        System.out.println(name2);
        System.out.println(name2.reverse().toString());
    }
}


