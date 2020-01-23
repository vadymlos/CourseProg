package HW3;

public class Main {
    public static void main(String[] args) {
        Human john = new Human("Jack", "Smith", 35);
        john.aboutHuman();
        Student f1 = new Student("Forula1", john);
        f1.aboutHuman();
        Student f2 = new Student("Rusya", "Mongol", 29, "Formula 2");
        f2.aboutHuman();

    }
}
