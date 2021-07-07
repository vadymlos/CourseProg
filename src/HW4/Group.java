package HW4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Group implements Voenkom{
    public  Student[] gr = new Student[10];
    public  int count = 0;

    public void addGr(Student student) {
            if(count >= 10) {
                try {
                    throw new NegativeCountExeption(10);
                }catch (NegativeCountExeption e){
                    System.out.println(student.getName() + ": Can`t be add cause group is already full");
                }

            }else {
                gr[count] = student;
                count++;
            }
    }

    public void addGr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name = reader.readLine();

        System.out.println("Enter secondname");
        String secondname = reader.readLine();

        System.out.println("Enter age");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Enter group");
        String group = reader.readLine();


        Student student = new Student(name, secondname, age, group);
        if(count >= 10) {
            try {
                throw new NegativeCountExeption(10);
            }catch (NegativeCountExeption e){
                System.out.println(student.getName() + ": Can`t be add cause group is already full");
            }

        }else {
            gr[count] = student;
            count++;
        }
    }

    public void removeFromGroup(Student student) {
        for (int i = 0; i < gr.length; i++) {
            try {
                if(gr[i].equals(student)) {
                    gr[i] = null;
                }
            }catch (NullPointerException e){
               // System.out.println("test");
            }

        }
    }

    public void findStud(String lastname) {
        for (int i = 0; i < gr.length; i++) {
            try {
                if(gr[i].getSecondname().equals(lastname)) {
                    gr[i].aboutHuman();
                }
            }catch (Exception e){

            }

        }


    }


    public void viewAllStudentsNames(){
        for (int i = 0; i < this.gr.length; i++) {
            try {
                System.out.println(this.gr[i].getName());
            }catch (NullPointerException e){
                System.out.println("Student was removed from group");
            }

        }
    }

    @Override
    public Student[] moreThan18Year() {
        Student [] adult;
        int count = 0;
        int count2 = 0;
        for (Student student : this.gr) {
            if (student != null && student.getAge() >= 18) {
              //  adult[count] = student;
                count2++;
            }
        }
        adult = new Student[count2];
        for (Student student : this.gr) {
            if (student != null && student.getAge() >= 18) {
                  adult[count] = student;
                count++;
            }
        }
        return adult;
    }
}
