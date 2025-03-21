import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args )
        {
            List<Product> products = new ArrayList<>();

            System.out.println( "Welcome to the E-commerce platform setup." );
            while ( true )
                {
                    System.out.println( "1. Add Simple Product" );
                    System.out.println( "2. Add Bundle" );
                    System.out.println( "3. Display and Calculate Total Price" );
                    System.out.println( "4. Exit" );
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch ( choice )
                        {
                            case 1 -> products.add( createSimpleProduct() );
                            case 2 -> products.add( createBundle( products ) );
                            case 3 ->
                                {
                                    if ( !products.isEmpty() )
                                        {
                                            for ( Product product : products )
                                                {
                                                    displayAllAndCalculatePrice( product );
                                                }
                                        }
                                    else
                                        {
                                            System.out.println( "No products or bundles available." );
                                        }
                                }
                            case 4 ->
                                {
                                    System.out.println( "Exiting..." );
                                    return;
                                }
                            default -> System.out.println( "Invalid choice, please try again." );
                        }
                }
        }

    public static Product createSimpleProduct()
        {
            System.out.println( "Enter product name:" );
            String name = scanner.nextLine();

            System.out.println( "Enter product price:" );
            double price = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            System.out.println( "Enter product description:" );
            String description = scanner.nextLine();

            return new SimpleProduct( name, price, description );
        }

    public static Bundle createBundle( List<Product> availableProducts )
        {
            System.out.println( "Enter bundle name:" );
            String name = scanner.nextLine();

            System.out.println( "Enter discount for the bundle:" );
            double discount = scanner.nextDouble();
            scanner.nextLine();

            Bundle bundle = new Bundle( name, discount );

            while ( true )
                {
                    System.out.println( "Add items to the bundle (choose from the available products):" );

                    for ( int i = 0; i < availableProducts.size(); i++ )
                        {
                            System.out.print( i + 1 + ". " );
                            availableProducts.get( i ).display( 0 );
                        }

                    System.out.println( "Enter the number of the product to add (0 to stop adding):" );
                    int index = scanner.nextInt() - 1;
                    if ( index == -1 ) break;

                    if ( index >= 0 && index < availableProducts.size() )
                        {
                            bundle.addItem( availableProducts.get( index ) );
                        }
                    else
                        {
                            System.out.println( "Invalid choice, please try again." );
                        }
                }
            return bundle;
        }

    public static void displayAllAndCalculatePrice( Product product )
        {
            product.display( 0 );
            double totalPrice = product.getPrice();
            System.out.println( "Total Price: " + totalPrice );
        }
}