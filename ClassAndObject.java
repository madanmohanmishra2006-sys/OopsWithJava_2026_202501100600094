class Student {

    String name;
    int rollNumber;

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Madan";
        student1.rollNumber = 101;

        student1.introduce();
    }
}