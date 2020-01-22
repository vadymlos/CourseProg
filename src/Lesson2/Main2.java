package Lesson2;

public class Main2 {
    public static void main(String[] args) {
        Cat1 cat = new Cat1 (6, 8, true, "Milk", "Vaska", "Home cat", "leopard");
        System.out.println(cat.getAge());
        System.out.println(cat.hashCode());

        cat.getVoice();

        System.out.println(cat);

        Animal an = cat;

        an.getVoice();
        System.out.println();
    }
}
