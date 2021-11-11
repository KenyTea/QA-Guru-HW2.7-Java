package guru.qa;

public class HomeWork7 {

    /*
   Добавить конструкторы, геттеры, сеттеры.

   Добавить статические данные к классам.

   Попробовать поработать со статическими вложенными классами
    * */

    public static void main(String[] args) {

        Human human = new Human();
        Student student = new Student();
        InfirmationOfStudent info = new InfirmationOfStudent();

        human.setName("Алексей");
        human.setSurname("Васильев");
        human.setAge(39);
        student.setCourse(1);
        student.setGroup("QAGuru 9");

        info.aboutStudent(human.getName(), human.getSurname(), human.getAge(),
                student.getCourse(), student.getGroup());

        human.humanWalk();
        student.studentLearn();
    }
}
