package JavaPrograms.src.LearningJavaProgram.ex_28_07_2024_OopsConcept;

public class PersonObject {
    public static void main(String[] args) {
        PersonClassBluePrint human1 = new PersonClassBluePrint();
        // PersonClassBlueprint is ClassName , human1 is object refrence, new is keyword to create new object in heap memory
        //PersonClassBluePrint() is object
        human1.eyes = 2;
        human1.nose =1;
        human1.name = "Aman";

        human1.beathe();
        human1.hear();
        human1.see();

        PersonClassBluePrint human2 = new PersonClassBluePrint();
        human2.eyes = 2;
        human2.nose =1;
        human2.name = "Amandeep";

        human2.beathe();
        human2.hear();
        human2.see();
        System.out.println("Print the first human name : " + human1.name);
    }
}
