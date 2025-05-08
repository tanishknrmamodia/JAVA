class person{
    void name(){
        System.out.println("name is ...");
    }
    void gender(){
        System.out.println("gender is ...");
    }
}
class student extends person {
    void roll(){
        System.out.println("roll is ...");
    }
    void branch(){
        System.out.println("Branch is ECSC");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        student stud = new student();
        stud.roll();
        stud.name();
        stud.branch();
        stud.gender();

        
    }
}
