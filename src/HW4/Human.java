package HW4;

public class Human {
    private String name;
    private String secondname;
    private int age;

    public Human(String name, String secondname, int age) {
        this.name = name;
        this.secondname = secondname;
        this.age = age;
    }

    public Human(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void aboutHuman(){
        System.out.println(name + " " + secondname + " " + age + ": " + this.getClass().getName());
    }
}
