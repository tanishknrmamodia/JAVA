class Person {
    void name (){
    System.out.println (" Name is ... " );
    } }

class Student extends Person {
    void roll (){
    System.out.println (" Roll is ... " );
    } }

class FirstYear extends Student {
    void year (){
    System.out.println ("first year" );
    } }


class SecondYear extends Student{
    void year2(){
        System.out.println("second year");
    }
}
class ThirdYear extends Student{
    void year3(){
        System.out.println("third year");
    }
}
class FourthYear extends Student{
    void year4(){
        System.out.println("fourth year");
    }
}


public class Inheritance4 {
    public static void main ( String args []) {
    FirstYear stu = new FirstYear();

    stu.year ();
    

    FourthYear fy = new FourthYear();
    fy.year4();

    ThirdYear ty = new ThirdYear();
    ty.year3();

    SecondYear sy = new SecondYear();
    sy.year2();

    }
}