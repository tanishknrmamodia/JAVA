class Person {
    String name;
    Person(String n){
        name=n;
    }
    void name (){
    System.out.println ("Name is " +name);
    } }


class Student extends Person {
    int roll;
    Student(String n , int r){
        super(n);
        roll = r;
    }
    void roll (){
    System.out.println ("Roll is "+roll );
    } }


class FirstYear extends Student {
    int first_year;
    FirstYear(String n,int r,int y1){
        super(n, r);
        first_year=y1;
    }
    void year (){
    System.out.println ("first year "+first_year+"\n");
    } }


class SecondYear extends Student{
    int second_year;
    SecondYear(String n , int r , int y2){
        super(n, r);
        second_year=y2;
    }
    void year2(){
        System.out.println("second year "+second_year+"\n");
    }
}
class ThirdYear extends Student{
   int third_year;
   ThirdYear(String n , int r , int y3){
    super(n, r);
    third_year=y3;
   }
   void year3(){
        System.out.println("third year "+third_year+"\n");
    }
}

class FourthYear extends Student{
    int fourth_year;

    FourthYear(String n , int r,int y4){
        super(n, r);
        fourth_year=y4;
    }
    void year4(){
        System.out.println("fourth year"+fourth_year+"\n");
    }
}


public class Inheritance6 {
    public static void main ( String args []) {
    FirstYear stu = new FirstYear("tanishk",2330349,1);
    stu.name();
    stu.roll();
    stu.year ();   

    SecondYear sy = new SecondYear("prashankh",2330352,2);
    sy.name();
    sy.roll();
    sy.year2();

    ThirdYear ty = new ThirdYear("shivam",2330351,3);
    ty.name();
    ty.roll();
    ty.year3();

    FourthYear fy = new FourthYear("angad",2330350,4);
    fy.name();
    fy.roll();
    fy.year4();
    
    }
}