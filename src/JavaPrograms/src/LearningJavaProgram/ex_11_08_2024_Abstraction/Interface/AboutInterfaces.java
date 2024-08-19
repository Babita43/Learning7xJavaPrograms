package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface;

public class AboutInterfaces {
    public static void main(String[] args) {
      //  I i = new I;  we can not make object of interface
    }
}
interface I{ }
class A{} // it is concrete class without abstarct keyword
abstract class A11{} // it is non concrete class
class B extends A{}  //OK single Inheritance
//class D extends A,B{}  NOT OKAY Multilevel inheritance not allowed in class
class A1 implements I{} //OK
class A2 extends B implements I{} //OKAY
interface I1{}
interface I2{}
class A3 implements I1, I2 {} // OKAY multiple inheritance with interface is possible
class A4 extends  A3 implements I1,I2{}//OKAY
//class A5 implements I1 extends A3 , it is not possible extend will use first
interface I3 extends I1,I2{} //OKAY
//interface I4 extends A3{} Not possible
//interface I5 implements A4{}
//initerface I6 implements A1,A2  not possible

