class Student {

    private int rollno;
    private int year;
    private double cgpa;
    private String branch;

    // Parameterized constructor
    Student(int r, int y, double cg, String b) {
        rollno = r;
        year = y;
        cgpa = cg;
        branch = b;
    }

    // Setters
    void setroll(int r) {
        this.rollno = r;
    }

    void setyear(int y) {
        this.year = y;
    }

    void setcgpa(double c) {
        this.cgpa = c;
    }

    void setbranch(String s) {
        this.branch = s;
    }

    // Getters
    int getroll() {
        return rollno;
    }

    int getyear() {
        return year;
    }

    double getcgpa() {
        return cgpa;
    }

    String getbranch() {
        return branch;
    }
}

// Main class
class main {

    public static void main(String[] args) {

        Student s1 = new Student(1, 21, 9.0, "IT");

        System.out.println("Roll Number: " + s1.getroll());
        System.out.println("Year: " + s1.getyear());
        System.out.println("CGPA: " + s1.getcgpa());
        System.out.println("Branch: " + s1.getbranch());
    }
}