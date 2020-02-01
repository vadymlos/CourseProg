package HW4;

import Lesson4.Cat;
import Lesson4.CatNameComparator;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NegativeCountExeption, IOException {
        Human john = new Human("Jack", "Smith", 35);
        //  john.aboutHuman();
        Student f1 = new Student("Forula1", john);
        //  f1.aboutHuman();
        Student f2 = new Student("Rusya", "Mongol", 29, "Formula 2");
        Student f3 = new Student("Yan", "Ban", 29, "Formula 3");
        Student f4 = new Student("Igor", "Kachok", 9, "Formula 4");
        Student f5 = new Student("Tem", "Ka", 19, "Formula 4");
        Student f6 = new Student("Eug", "Kach1", 18, "Formula 4");
        Student f7 = new Student("Igo", "Kachok2", 17, "Formula 4");
        Student f8 = new Student("Serg", "Kachok3", 0, "Formula 4");
        Student f9 = new Student("Gor", "Kachok4", -1, "Formula 4");
        Student f10 = new Student("Wine", "Kachok5", 20, "Formula 4");
        Student f11 = new Student("Den", "Kachok6", 15, "Formula 4");
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

        group.addGr();

        group.removeFromGroup(f3);
        group.findStud("Mongol");

        group.viewAllStudentsNames();

//        for (Student student : group.gr) {
//            System.out.println(student);
//        }
        System.out.println();

        Arrays.sort(group.gr, new StudentSecondnameComparator());
        group.viewAllStudentsNames();

//        Arrays.sort(group.gr, new StudentSecondnameComparator());
//        group.viewAllStudentsNames();
        System.out.println("Go to Armiaaaa");

        Student [] gotoarmia = group.moreThan18Year();
        for (Student student : gotoarmia) {
            System.out.println(student.getName() + " " + student.getAge());
        }

    }



}

