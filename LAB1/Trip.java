package LAB1;

public class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private Driver driver;
    private Rider rider;
    private double fare;

    public Trip(String id, String pickupLocation, String dropOffLocation, RideType rideType, Rider rider) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.rider = rider;
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

    public double calculateFare(double distance) {
        return rideType.calculateFare(distance);
    }

    public void completeTrip() {
        driver.completeTrip();
        rider.makePayment(fare);
        System.out.println("Trip completed and payment processed.");
    }
}

