package HW3;

public class Student extends Human{
    private String group;

    public Student(String name, String secondname, int age, String group) {
        super(name, secondname, age);
        this.group = group;
    }

    public Student(String group) {
        this.group = group;
    }

    public Student(String group, Human human) {
        super(human.getName(), human.getSecondname(), human.getAge());
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void aboutHuman() {
       // super.aboutHuman();
        System.out.println(super.getName() + " " + super.getSecondname() + " " + super.getAge() + " " + group + ": " + this.getClass().getName());
    }
}
