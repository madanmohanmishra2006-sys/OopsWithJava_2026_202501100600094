import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("You selected Java.");
                break;

            case 2:
                System.out.println("You selected C.");
                break;

            case 3:
                System.out.println("You selected C++.");
                break;

            case 4:
                System.out.println("You selected Python.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}