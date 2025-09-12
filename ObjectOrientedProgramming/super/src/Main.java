public class Main {
    public static void main(String[] args){
        //super = Refers to the parent class (subclass <- superclass)
        //        Used in constructors and method overriding
        //        Calls the parent constructor to initialize attributes
        Person person = new Person("Gordon", "Freeman");
        person.showName();

        Student student = new Student("Alyx", "Vance", 4.5);
        student.showName();
        System.out.println(student.gpa);
        student.showGPA();

        System.out.println();
        Employee employee = new Employee("Sam", "Fisher", 50000);
        employee.showSalary();
    }
}
