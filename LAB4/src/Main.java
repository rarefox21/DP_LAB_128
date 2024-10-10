import java.util.Scanner;

public class Main {
    public static void main( String[] args )
        {
            Scanner scanner = new Scanner(System.in);
            Beverage beverage = null;
            
            System.out.println("Welcome to the Coffee Shop!");
            System.out.println("Please select your beverage:");
            System.out.println("1. Espresso ($2.00)");
            System.out.println("2. Latte ($3.00)");
            System.out.println("3. Cappuccino ($3.50)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    beverage = new Espresso();
                    break;
                case 2:
                    beverage = new Latte();
                    break;
                case 3:
                    beverage = new Cappuccino();
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid beverage.");
                    return;
            }

            boolean addingCondiments = true;

            while (addingCondiments) {
                System.out.println("Select a condiment to add (or type 0 to finish):");
                System.out.println("1. Milk ($0.50)");
                System.out.println("2. Sugar ($0.20)");
                System.out.println("3. Whipped Cream ($0.70)");
                System.out.println("4. Chocolate Syrup ($0.90)");
                System.out.println("0. Finish order");

                int condimentChoice = scanner.nextInt();
                switch (condimentChoice) {
                    case 1:
                        beverage = new Milk(beverage);
                        break;
                    case 2:
                        beverage = new Sugar(beverage);
                        break;
                    case 3:
                        beverage = new WhippedCream(beverage);
                        break;
                    case 4:
                        beverage = new ChocolateSyrup(beverage);
                        break;
                    case 0:
                        addingCondiments = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please select a valid condiment.");
                }
            }

            System.out.println("Your order: " + beverage.getDescription());
            System.out.println("Total cost: $" + beverage.cost());
            scanner.close();
        }
}