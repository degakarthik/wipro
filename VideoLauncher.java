import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore store = new VideoStore();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nMAIN MENU\n=========");
            System.out.println("1. Add Videos :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6) : ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter the name of the video you want to add: ");
                        String addName = scanner.nextLine();
                        store.addVideo(addName);
                        break;
                    case 2:
                        System.out.print("Enter the name of the video you want to check out: ");
                        String checkoutName = scanner.nextLine();
                        store.doCheckout(checkoutName);
                        break;
                    case 3:
                        System.out.print("Enter the name of the video you want to return: ");
                        String returnName = scanner.nextLine();
                        store.doReturn(returnName);
                        break;
                    case 4:
                        System.out.print("Enter the name of the video you want to Rate: ");
                        String rateName = scanner.nextLine();
                        System.out.print("Enter the rating for this video: ");
                        int rating = scanner.nextInt();
                        store.receiveRating(rateName, rating);
                        break;
                    case 5:
                        store.listInventory();
                        break;
                    case 6:
                        System.out.println("Exiting... Thank you!");
                        break;
                    default:
                        System.out.println("Invalid selection. Please choose options between 1 and 6.");
                }
            } else {
                System.out.println("Please enter a valid integer choice.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
}