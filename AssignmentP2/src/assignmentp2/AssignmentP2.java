
package assignmentp2;

import java.util.Scanner;


public class AssignmentP2 {

    
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner input = new Scanner(System.in);
        //Menu
        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Book Availability");
            System.out.println("4. Delete Book");
            System.out.println("5. Print Report");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(input.nextLine());

            //Sorce code
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter type (1=Fiction, 2=Non-Fiction): ");
                    int type = Integer.parseInt(input.nextLine());

                    Book book;
                    if (type == 1) {
                        book = new FictionBook(id, title, true);
                    } else {
                        book = new nonFictionBook(id, title, true);
                    }
                    manager.addBook(book);
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.print("Enter title to search: ");
                    String searchTitle = input.nextLine();
                    Book found = manager.searchBook(searchTitle);
                    System.out.println(found != null ? found : "Book not found.");
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = Integer.parseInt(input.nextLine());
                    System.out.print("Available (true/false): ");
                    boolean avail = Boolean.parseBoolean(input.nextLine());
                    boolean updated = manager.updateBookAvailability(updateId, avail);
                    System.out.println(updated ? "Updated!" : "Book not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = Integer.parseInt(input.nextLine());
                    boolean deleted = manager.deleteBook(deleteId);
                    System.out.println(deleted ? "Deleted!" : "Book not found.");
                    break;

                case 5:
                    manager.printReport();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
