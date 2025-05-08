class person{
    void name(){
        System.out.println("name is ...");
    }
}
class student extends person {
    void roll(){
        System.out.println("roll is ...");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        student stud = new student();
        stud.roll();
        stud.name();
    }
    
}
