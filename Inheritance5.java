class Person {
    String name;
    Person(){
        name="null";
    }
    void name (){
    System.out.println (" Name is ... " );
    } }


class Student extends Person {
    int roll;
    Student(){
        roll = 0;
    }
    void roll (){
    System.out.println (" Roll is ... " );
    } }


class FirstYear extends Student {
    String first_year;
    FirstYear(){
        first_year="null";
    }
    void year (){
    System.out.println ("first year" );
    } }


class SecondYear extends Student{
    String second_year;
    SecondYear(){
        second_year="null";
    }
    void year2(){
        System.out.println("second year");
    }
}
class ThirdYear extends Student{
   String third_year;
   ThirdYear(){
    third_year="null";
   }
   void year3(){
        System.out.println("third year");
    }
}

class FourthYear extends Student{
    String fourth_year;
    FourthYear(){
        fourth_year="null";
    }
    void year4(){
        System.out.println("fourth year");
    }
}


public class Inheritance5 {
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