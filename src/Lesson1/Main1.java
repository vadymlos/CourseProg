package Lesson1;

public class Main1 {
    public static void main(String[] args) {
        Cat Bob = new Cat("black", 1, 2);
        Cat Jay = new Cat("red", 5, 4);

        System.out.println("First cat" + Bob);
        System.out.println("Second Lesson1.Cat" + Jay);
        Bob.getVoice();

    }
}