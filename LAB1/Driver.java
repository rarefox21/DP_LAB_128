package LAB1;

public class Driver {
    private String id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean available;

    public Driver(String id, String name, String vehicleType, String location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.available = true;
    }

    public void acceptRide() {
        System.out.println(name + " accepted the ride.");
    }

    public void startTrip() {
        System.out.println(name + " started the trip.");
    }

    public void completeTrip() {
        System.out.println(name + " completed the trip.");
    }

    public void rateRider(Rider rider, double rating) {
        this.rating = rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }
}
