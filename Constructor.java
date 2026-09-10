class Student {

    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Constructor {

    public static void main(String[] args) {

        Student student1 = new Student("Madan", 101);
        Student student2 = new Student("Rahul", 102);

        student1.display();
        student2.display();
    }
}