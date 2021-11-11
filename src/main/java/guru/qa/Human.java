package guru.qa;

public class Human {

    public static String commonName = "Человек";
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void humanWalk() {
        System.out.println("\nЧеловек умеет ходить. Топ топ топ\n");
    }

    static class Body {
        static int head = 1;
        static int hands = 2;
        static int legs = 2;

        public void outputBodyParameters() {
            System.out.println("\n static class Body: ");
            System.out.println("Количество голов: " + head);
            System.out.println("Количество рук: " + hands);
            System.out.println("Количество ног: " + legs);
        }

    }

}
