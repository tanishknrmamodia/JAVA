class Student { 
    String name;
    int roll;
    public Student() {
    name = "TANISHK NR MAMODIA";  
    roll = 23300349;   
        }
    public void info() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + roll);
    }
    }
    class FirstSem extends Student {
    double SGPA;
    public FirstSem() {
    super();  
    this.SGPA = 8;  
    }
    public void info() {
    super.info();  
    System.out.println("SGPA (First Semester): " + SGPA);
    }
    }
    class SecondSem extends Student {
    double SGPA;
    public SecondSem() {
    super();  
    SGPA = 9;  
    }
    public void info() {
    super.info(); 
    System.out.println("SGPA (Second Semester): " + SGPA);
    }
    }
    class ThirdSem extends Student {
    double SGPA;
    public ThirdSem() {
    super();  
    SGPA = 8.5;  
    }
    public void info() {
    super.info();  
    System.out.println("SGPA (Third Semester): " + SGPA);
    }
    }
    public class Polymorphism7 {
    public static void main(String[] args) {
    FirstSem firstSem = new FirstSem();
    SecondSem secondSem = new SecondSem();
    ThirdSem thirdSem = new ThirdSem();
    System.out.println("First Semester :");
    firstSem.info();
    System.out.println(); 
    System.out.println("Second Semester:");
    secondSem.info();
    System.out.println(); 
    System.out.println("Third Semester:");
    thirdSem.info();
    }
    }
    