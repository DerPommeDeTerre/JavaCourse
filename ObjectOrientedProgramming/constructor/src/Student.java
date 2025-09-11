public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){//Parameters can take other names
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
        //this refers to the object
    }
    void study(){
        System.out.println(this.name + " is studying");
    }
}
