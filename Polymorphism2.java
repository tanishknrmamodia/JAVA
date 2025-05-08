// overload constructor 

   class Student {
   private  int age;  // private means i cant acess this varibale outside the class 
   private  String name;
   private  String gender;

    Student() {
        age = 0;
        name = gender = "null";
    }

    Student(int a) {
        age = a;
        name = gender = "null";
    }

    Student(int a, String n) {
        age = a;
        name = n;
        gender = "null";
    }

    Student(int a, String n, String g) {
        age = a;
        name = n;
        gender = g;
    }

    void displayData() {
        System.out.println(" Name : " + name);
        System.out.println(" Gender : " + gender);
        System.out.println(" Age : " + age);
        System.out.println(" ----------------");
    }
}

public class Polymorphism2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student(21);
        Student s3 = new Student(21, " XYZ ");
        Student s4 = new Student(21, " XYZ ", " Male ");
        s1.displayData();
        s2.displayData();
        s3.displayData();
        s4.displayData();


    }
}