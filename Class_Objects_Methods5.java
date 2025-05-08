import java.util.Scanner;

class uniMember{
    String name;
    char gender;

    class Student{
        int rollNo;
        void setRollNo(int rollNo){
            this.rollNo=rollNo;
        }
        void displayRollNo(){
            System.out.println("Your ROLL Number is - "+rollNo);
        }
    }
    class Faculty{
        int employee_id;
        void setEmployeeId(int employee_id){
            this.employee_id=employee_id;
        }
        void employee_id(){
            System.out.println("Your employee_id is - "+employee_id);
        }
    }
   
}

public class Class_Objects_Methods5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student~Faculty : ");
        String str= sc.nextLine();
        uniMember uM = new uniMember();
        uM.name=str;
        if (uM.name.equals("Student")|| uM.name.equals("student")|| uM.name.equals("STUDENT")) {
            uniMember.Student std = uM.new Student();
            System.out.print("Enter your Roll No : ");
            std.rollNo = sc.nextInt();
            std.displayRollNo();
        }
        else if (uM.name.equals("Faculty")|| uM.name.equals("faculty")|| uM.name.equals("FACULTY")) {
            uniMember.Faculty fac = uM.new Faculty();
            System.out.print("Enter your Faculty Id : ");
            fac.employee_id = sc.nextInt();
            fac.employee_id();
        }
sc.close();
      
    }
}