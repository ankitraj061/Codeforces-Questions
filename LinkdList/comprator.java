
import java.util.*;

public class comprator {
    static class Student {
        String name;
        int rollno;
        int marks;

        public Student(String name, int rollno, int marks) {
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }

        public String getName() {
        return this.name;
        }

        public int getRollno() {
        return this.rollno;
        }

        public int getMarks() {
        return this.marks;
        }

        public String toString() {
            return this.name + " " + this.rollno + " " + this.marks;
        }

    }

    public static void main(String[] args) {

        Student s1 = new Student("s1", 31, 500);
        Student s2 = new Student("s2", 2, 200);
        Student s3 = new Student("s3", 6, 300);

        List<Student> list = new ArrayList<>();
        list.add(s3);
        list.add(s1);
        list.add(s2);
        System.out.println(list);

        Comparator<Student> com = (Student a, Student b) -> {
            if (a.getMarks() > b.getMarks()) {
                return 1;
            } else
                return -1;

        };

        Collections.sort(list, com);
        System.out.println(list);
    }
}