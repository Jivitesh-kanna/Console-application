import java.util.Scanner;
public class Main {
    private static final int MAX_VOTERS = 100;
    private static Voter[] voters = new Voter[MAX_VOTERS];
    private static int numVoters = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMotivationalQuote();
        int choice;
        do {
            System.out.println("\n--- Voter Management System ---");
            System.out.println("1. Add Voter");
            System.out.println("2. Display Voter Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addVoter(scanner);
                    break;
                case 2:
                    displayVoterDetails(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        scanner.close();
    }
    private static void addVoter(Scanner scanner) {
        if (numVoters == MAX_VOTERS) {
            System.out.println("Maximum number of voters reached.");
            return;
        }
        System.out.print("Enter voter name: ");
        String name = scanner.next();
        System.out.print("Enter voter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter voter address: ");
        String address = scanner.next();
        voters[numVoters] = new Voter(name, age, address);
        numVoters++;
        System.out.println("Voter added successfully.");
    }
    private static void displayVoterDetails(Scanner scanner) {
        System.out.print("Enter voter name: ");
        String name = scanner.next();
        for (int i = 0; i < numVoters; i++) {
            if (voters[i].getName().equals(name)) {
                System.out.println("Name: " + voters[i].getName() + "\nAddress: " + voters[i].getAddress() + "\nVoter ID: " + voters[i].getVoterID());
                return;
            }
        }
        System.out.println("Voter not found.");
    }
    private static void displayMotivationalQuote() {
        System.out.println("Get out and vote! Your voice matters.");
    }
}
