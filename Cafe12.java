import java.util.Scanner;

public class Cafe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Are you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean();

        System.out.print("Enter the hour of your visit (0-23): ");
        int visitHour = scanner.nextInt();

        Menu(customerName, isMember, visitHour);
    }

        public static void Menu(String customerName, boolean isMember, int visitHour){ //inside the bracket is parameter
        System.out.println("Welcome to our Cafe Restaurant, " + customerName + "!");
        if(visitHour >= 14 && visitHour <= 16 ){
            System.out.println("Happy Hour! Enjoy a 20% discount on all drinks.");
        }
        if (isMember) {
            System.out.println("You are a member, enjoy 10% off every purchase!");
            System.out.println();
        }

        System.out.println("===== CAFE RESTAURANT MENU =====");
        System.out.println("1. Black Coffee - Rp. 15,000");
        System.out.println("2. Cappucino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Toast - Rp. 10,000");
        System.out.println("6. Fried Noodles - Rp. 18,000");
        System.out.println("=====================================");
        System.out.println("Please choose the menu you would like to order (1-6):");
    }
}