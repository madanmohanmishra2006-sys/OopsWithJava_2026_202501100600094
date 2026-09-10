import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int first = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int second = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int third = sc.nextInt();

        int total = first + second + third;
        double average = total / 3.0;

        System.out.println("\nTotal marks = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}