package HW3;

public class Group {
    public  Student [] gr = new Student[10];
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
}
