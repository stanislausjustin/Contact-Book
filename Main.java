import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("****************************");
            System.out.print("Please enter a command: ");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'A':
                case 'a':
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    contactBook.addContact(name, phone, email);
                    break;
                case 'D':
                case 'd':
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.next();
                    contactBook.deleteContact(deleteName);
                    break;
                case 'E':
                case 'e':
                    System.out.print("Enter email to search: ");
                    String searchEmail = scanner.next();
                    contactBook.emailSearch(searchEmail);
                    break;
                case 'P':
                case 'p':
                    contactBook.printList();
                    break;
                case 'S':
                case 's':
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.next();
                    contactBook.searchContact(searchName);
                    break;
                case 'Q':
                case 'q':
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
