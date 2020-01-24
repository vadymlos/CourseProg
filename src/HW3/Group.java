package HW3;

public class Group {
    public  Student [] gr = new Student[10];
    public  int count = 0;

    public void addGr(Student student) {
        try {
            gr[count] = student;
            count++;
        }catch (Exception e){
            System.out.println("Array error");
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


}
