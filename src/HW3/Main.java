package HW3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws NegativeCountExeption {
        Human john = new Human("Jack", "Smith", 35);
        //  john.aboutHuman();
        Student f1 = new Student("Forula1", john);
        //  f1.aboutHuman();
        Student f2 = new Student("Rusya", "Mongol", 29, "Formula 2");
        Student f3 = new Student("Yan", "Ban", 29, "Formula 3");
        Student f4 = new Student("Igor", "Kachok", 29, "Formula 4");
        Student f5 = new Student("Tem", "Ka", 29, "Formula 4");
        Student f6 = new Student("Eug", "Kach1", 29, "Formula 4");
        Student f7 = new Student("Igo", "Kachok2", 29, "Formula 4");
        Student f8 = new Student("Serg", "Kachok3", 29, "Formula 4");
        Student f9 = new Student("Gor", "Kachok4", 29, "Formula 4");
        Student f10 = new Student("Wine", "Kachok5", 29, "Formula 4");
        Student f11 = new Student("Den", "Kachok6", 29, "Formula 4");
        Student f12 = new Student("Denchik", "Kachok7", 29, "Formula 4");


        Group group = new Group();
        group.addGr(f1);
        group.addGr(f2);
        group.addGr(f3);
        group.addGr(f4);
        group.addGr(f5);
        group.addGr(f6);
        group.addGr(f7);
        group.addGr(f8);
        group.addGr(f9);
        group.addGr(f10);
        group.addGr(f11);
        group.addGr(f12);

        group.removeFromGroup(f3);
        group.findStud("Mongol");

        group.viewAllStudentsNames();


    }
}

