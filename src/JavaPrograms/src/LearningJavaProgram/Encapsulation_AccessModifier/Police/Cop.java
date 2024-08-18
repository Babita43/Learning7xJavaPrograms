package JavaPrograms.src.LearningJavaProgram.Encapsulation_AccessModifier.Police;

public class Cop {

    /*
    Encapsulation helps in protecting the
    data from outside interference and misuse by restricting direct access to some of the object's components.
    Public - used by all clases, folders, packages
    Private - not access to others
    Protected - will access by same fodler but not access by subclass means inhertance
    default

    Father is Suerclass
    Son is subclass
    without inheritnace class it is non sub class
    */
    public String unifform = "Hat";
    private String name = "Sam";
    private int bullets = 10;

    public Cop(String namegiven) {
        this.name = namegiven;
    }

    // if we do not use protected then it is default it cana ccess by same folder class only but not subclass(inheritance)
    protected void canArrest() {
        System.out.println("cop can arrest the thief and its secret lcoation is abc");
    }

}

