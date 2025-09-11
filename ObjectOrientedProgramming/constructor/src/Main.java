public class Main {
    public static void main(String[] args){

        //constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial value

        Student student = new Student("Patrick", 30, 3.2);
        Student student1 = new Student("Sponge", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        System.out.println(student.isEnrolled);
        student.study();

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
