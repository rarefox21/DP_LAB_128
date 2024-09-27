package LAB1;

public class CarpoolRide extends RideType {
    @Override
    public double calculateFare(double distance) {
        return distance * 0.5;
    }

    @Override
    public String getType() {
        return "Carpool";
    }
}