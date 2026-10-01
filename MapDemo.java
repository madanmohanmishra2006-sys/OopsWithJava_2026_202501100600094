
package OopsWithJava_2026_202501100600094;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Comparable: sort by roll number
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollno, o.rollno);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name;
    }
}

// Comparator: sort by roll number
class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.rollno, o2.rollno);
    }
}

// Comparator: sort by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class MapDemo {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(3, "Ravi"));
        students.add(new Student(1, "Karan"));
        students.add(new Student(2, "Aman"));
        students.add(new Student(5, "Priya"));
        students.add(new Student(4, "Rahul"));

        System.out.println("Original List:");
        System.out.println(students);

        // 1. Comparable: sort by roll number
        Collections.sort(students);

        System.out.println("\nSorted by Roll Number (Comparable):");
        System.out.println(students);

        // 2. Comparator: sort by name
        Collections.sort(students, new NameComparator());

        System.out.println("\nSorted by Name (Comparator):");
        System.out.println(students);

        // 3. Comparator: sort by roll number
        Collections.sort(students, new RollNoComparator());

        System.out.println("\nSorted by Roll Number (Comparator):");
        System.out.println(students);
    }
}
