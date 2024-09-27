package LAB1;

public class Urao {
    public static void main(String[] args) {
        PaymentMethods creditCard = new CreditCardPayment();
        PaymentMethods bkash = new BkashPayment();



        Rider rider1 = new Rider("1", "Abrar", "Dhaka", creditCard);
        Driver driver1 = new Driver("1", "mubeen", "axio", "IUT");



        RideType luxuryRide = new LuxuryRide();
        Trip trip = new Trip("1", "IUT", "Airport", luxuryRide, rider1);
        trip.assignDriver(driver1);



        rider1.requestRide("IUT", "Airport", luxuryRide);
        driver1.acceptRide();
        driver1.startTrip();
        double fare = trip.calculateFare(15);
        trip.completeTrip();
        
        rider1.rateDriver(driver1, 5.0);
        Admin admin = new Admin("1", "Navid", "Admin");
        admin.viewTripHistory(trip);
    }
}
