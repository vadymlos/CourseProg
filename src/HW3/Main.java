package HW3;

public class Main {
    public static void main(String[] args) {
        Human john = new Human("Jack", "Smith", 35);
      //  john.aboutHuman();
        Student f1 = new Student("Forula1", john);
      //  f1.aboutHuman();
        Student f2 = new Student("Rusya", "Mongol", 29, "Formula 2");
        Student f3 = new Student("Yan", "Ban", 29, "Formula 3");
        Student f4 = new Student("Igor", "Kachok", 29, "Formula 4");
       // f2.aboutHuman();

        Group group = new Group();
        group.addGr(f1);
        group.addGr(f2);
        group.addGr(f3);
        group.addGr(f4);

        group.removeFromGroup(f3);
        group.findStud("Mongol");

        for (int i = 0; i < group.gr.length; i++) {
            try {
                System.out.println(group.gr[i].getName());
            }catch (Exception e){

            }

        }
    }
}
