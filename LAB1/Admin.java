package LAB1;

public class Admin {
    private String id;
    private String name;
    private String role;

    public Admin(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver) {
        System.out.println(name + " is managing driver: " + driver);
    }

    public void viewTripHistory(Trip trip) {
        System.out.println("Viewing trip history for trip: " + trip);
    }

    public void handleDispute(Rider rider, Driver driver) {
        System.out.println("Handling dispute between rider and driver.");
    }
}