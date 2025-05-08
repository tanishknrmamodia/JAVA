class UniversityMember{
String Name;
String Gender;
UniversityMember(String n , String g ){
    Name = n;
    Gender = g;
}

void display_name(){
System.out.println("Name:"+Name+"\n");
}

void display_gender(){
    System.out.println("Gender:"+Gender+"\n");
}
}

class Student extends UniversityMember{
String Course;
String Branch;
Student(String n, String g , String c , String b){
    super(n, g);
    Course=c;
    Branch=b;
}
void display_course(){
    System.out.println("Course:"+Course+"\n");
    }
void display_branch(){
        System.out.println("Branch:"+Branch+"\n");
    }
}

class Year extends Student{                                                                     
String YearId;
String SemId;
double SGPA;
Year(String n, String g , String c , String b, String yi, String si, double s) {
    super(n, g, c, b);
    YearId=yi;
    SemId=si;
    SGPA=s;
    }
    void display_year(){
        System.out.println("YearId:"+YearId+"\n");
        }
        
        void display_sem(){
            System.out.println("SemId:"+SemId+"\n");
        }
        void display_SGPA(){
            System.out.println("SGPA:"+SGPA+"\n");
            }
            

}

public class Inheritance7 {
    public static void main(String[] args) {

        Year y = new Year("TANISHK", "MALE", "B.TECH.", "ECS", "2nd Year", "4th Sem", 8.3);
        y.display_name();
        y.display_gender();
        y.display_course();
        y.display_sem();
        y.display_year();
        y.display_branch();
        y.display_SGPA();

    }
}
