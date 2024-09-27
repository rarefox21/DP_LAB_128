package LAB1;

public class Rider {
    private String id;
    private String name;
    private String location;
    private double rating;
    private PaymentMethods preferredPaymentMethod;

    public Rider(String id, String name, String location, PaymentMethods paymentMethod) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.preferredPaymentMethod = paymentMethod;
    }

    public void requestRide(String pickupLocation, String dropOffLocation, RideType rideType) {
        System.out.println(name + " requested a " + rideType.getType() + " ride.");
    }

    public void rateDriver(Driver driver, double rating) {
        driver.setRating(rating);
    }

public void rateRider(Rider rider,double rating){
    this.rating=rating;
}

public void setRating(double rating) {
    this.rating = rating;
}

    public void makePayment(double fare) {
        preferredPaymentMethod.processPayment(fare);
    }
}