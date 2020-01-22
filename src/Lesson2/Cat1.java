package Lesson2;

public class Cat1 extends Animal {


    private String name;
    private String type;
    private String home;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Cat1(int age,double weight,  boolean sex, String ration,String name, String home, String type) {
        super(age, weight, sex, ration);
        this.name = name;
        this.type = type;
        this.home = home;
    }


    @Override
    public  void getVoice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return " Lesson1.Cat [name=" + name+ ", type=" + type + super.toString();
    }
}
