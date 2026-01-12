
class Students {

    String name;
    int age;
    int rollno;

    public void info() {
        System.out.println("Student Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll No: " + rollno);
    }
}

class info {

}

public class Oops {

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s2.name = "ankush";
        s2.age = 21;
        s2.rollno = 102;
        s1.name = "John Doe";
        s1.age = 20;
        s1.rollno = 101;
        // System.out.println("Name: " + s1.name);
        // System.out.println("Age: " + s1.age);
        // System.out.println("Roll No: " + s1.rollno);
        // info i = new info();
        s1.info();
        s2.info();
    }
}
