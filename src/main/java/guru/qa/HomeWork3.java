package guru.qa;

public class HomeWork3 {

    public static void main(String[] args) {

        Human human = new Human();
        Student student = new Student();
        InfirmationOfStudent info = new InfirmationOfStudent();

        human.SetName("Алексей");
        human.SetSurname("Васильев");
        human.SetAge(39);
        student.SetCourse(1);
        student.SetGroup("QAGuru 9");

        info.aboutStudent(human.GetName(), human.GetSurname(), human.GetAge(),
                student.GetCourse(), student.GetGroup());

        human.HumanWalk();
        student.StudentLearn();
    }
}
