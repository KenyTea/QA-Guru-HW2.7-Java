package guru.qa;

public class InfirmationOfStudent {

    Human human = new Human();
    Human.Body body = new Human.Body();
    Student student = new Student();

    public void aboutStudent(String name, String surname, int age, int course, String group) {
        System.out.println("\n    Information about student   \n ");
        System.out.println("Student name: " + name);
        System.out.println("Student surname: " + surname);
        System.out.println("Student age: " + age);
        System.out.println("Student course number: " + course);
        System.out.println("Student group name: " + group + "\n");
        System.out.println("commonName: " +Human.commonName);
        body.outputBodyParameters();
    }
}

