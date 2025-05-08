
class Student {

    private int age;
    private String name;
    private String gender;

    public Student() { 
        age = 0;
        name = gender = "null";
    }

    void showData() {

        System.out.println(" Name : " + name);
        System.out.println(" Gender : " + gender);
        System.out.println(" Age : " + age);
        System.out.println(" ----------------");

    }

    void showData(String name) {

        System.out.println(" Name : " + name);
        System.out.println(" ----------------");

    }

    void showData(String name, String gender) {
        System.out.println(" Name : " + name);
        System.out.println(" Gender : " + gender);
        System.out.println(" ----------------");

    }

    void showData(String name, String gender, int age) {

        System.out.println(" Name : " + name);
        System.out.println(" Gender : " + gender);
        System.out.println(" Age : " + age);
        System.out.println(" ----------------");

    }
}

public class Polymorphism3 {

    public static void main(String args[]) {
        Student s = new Student();
        s.showData();
        s.showData(" ABC ");
        s.showData(" ABC ", " MALE ");
        s.showData(" ABC ", " MALE ", 21);

    }
}
