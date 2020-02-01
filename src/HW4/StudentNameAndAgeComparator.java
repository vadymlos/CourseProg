package HW4;
import java.util.Comparator;

public class StudentNameAndAgeComparator implements Comparator {

    public int compare (Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        if (student1 == null && student2 != null) {
            return -1;
        }
        if (student1 != null && student2 == null) {
            return 1;
        }
        if (student1 == null && student2 == null) {
            return 0;
        }


        if (student1.getName().compareTo(student2.getName())>0 && student1.getAge() < student2.getAge()) {
            return 1;
        }
        if (student1.getName().compareTo(student2.getName())<0 && student1.getAge() < student2.getAge()) {
            return 1;
        }
        if (student1.getName().compareTo(student2.getName())<0 && student1.getAge() > student2.getAge()) {
            return -1;
        }
        if (student1.getName().compareTo(student2.getName())==0 && student1.getAge() == student2.getAge()) {
            return 0;
        }
        if (student1.getName().compareTo(student2.getName())>0 && student1.getAge() == student2.getAge()) {
            return 1;
        }
        if (student1.getName().compareTo(student2.getName())<0 && student1.getAge() == student2.getAge()) {
            return -1;
        }
        if (student1.getName().compareTo(student2.getName())>0 && student1.getAge() > student2.getAge()) {
            return 1;
        }
        return 0;

    }
}
