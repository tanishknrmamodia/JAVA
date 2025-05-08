class UniversityMember {
    String Name;
    String Gender;

    UniversityMember(String n, String g) {
        Name = n;
        Gender = g;
    }

    void display_name() {
        System.out.println("Name: " + Name);
    }

    void display_gender() {
        System.out.println("Gender: " + Gender);
    }
}

class Student extends UniversityMember {
    String Course;
    String Branch;

    Student(String n, String g, String c, String b) {
        super(n, g);
        Course = c;
        Branch = b;
    }

    void display_course() {
        System.out.println("Course: " + Course);
    }

    void display_branch() {
        System.out.println("Branch: " + Branch);
    }
}

class Year extends Student {
    String YearId;
    String SemId;
    double SGPA;
    int roll_number;

    Year(String n, String g, String c, String b, String yi, String si, double s, int r) {
        super(n, g, c, b);
        YearId = yi;
        SemId = si;
        SGPA = s;
        roll_number = r;
    }

    void display_year() {
        System.out.println("YearId: " + YearId);
    }

    void display_sem() {
        System.out.println("SemId: " + SemId);
    }

    void display_SGPA() {
        System.out.println("SGPA: " + SGPA);
    }

    void display_roll() {
        System.out.println("Roll Number: " + roll_number);
    }

}

class Employee extends UniversityMember {
    String EmployeeId;

    Employee(String n, String g, String ei) {
        super(n, g);
        EmployeeId = ei;
    }

    void display_employee() {
        System.out.println("Employee Id: " + EmployeeId);
    }
}

class teaching extends Employee {
    String designation;

    teaching(String n, String g, String ei, String desi) {
        super(n, g, ei);
        designation = desi;
    }

    void display_designation() {
        System.out.println("Designation: " + designation);
    }
}

class non_teaching extends Employee {
    String designat;

    non_teaching(String n, String g, String ei, String des) {
        super(n, g, ei);
        designat = des;
    }

    void display_designat() {
        System.out.println("Designation: " + designat);
    }
}

public class Inheritance8 {
    public static void main(String[] args) {
        Year y = new Year("TANISHK", "MALE", "B.TECH.", "ECS", "2nd Year", "4th Sem", 8.3, 2330349);
        y.display_name();
        y.display_gender();
        y.display_course();
        y.display_branch();
        y.display_year();
        y.display_sem();
        y.display_SGPA();
        y.display_roll();
        System.out.println("\n");

        teaching t = new teaching("Mr. RAJIB ", "MALE", "4569IYUOP", "MATHS");
        t.display_name();
        t.display_gender();
        t.display_employee();
        t.display_designation();
        System.out.println("\n");

        non_teaching nt = new non_teaching("Mr. KAMLESH", "MALE", "342378MNBV", "GARDNER");
        nt.display_name();
        nt.display_gender();
        nt.display_employee();
        nt.display_designat();
    }
}
