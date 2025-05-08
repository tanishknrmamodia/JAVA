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
    System.out.println (" 1st year ... " );
    } }

class FirstSem extends FirstYear{
    void subjects(){
        System.out.println("6 theory courses and 2 lab courses");
    }
}

public class Inheritance3 {
    public static void main ( String args []) {
        FirstSem stud = new FirstSem();
    
        stud.year ();
        stud.roll ();
        stud.name ();
        stud.subjects();
    
}}
