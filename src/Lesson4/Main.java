package Lesson4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 6);
        Cat cat2 = new Cat("Umka", 12);
        Cat cat3 = new Cat("Luska", 3);
        Cat cat4 = new Cat("Barsik", 7);
        Cat cat5 = new Cat("Kuzia", 5);

        Cat [] cats = new Cat [] {cat1, cat2, cat3, cat4, cat5};

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();

        Arrays.sort(cats, new CatNameComparator());

//        Arrays.sort(cats, (a,b) -> a.getAge() - b.getAge());

        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
