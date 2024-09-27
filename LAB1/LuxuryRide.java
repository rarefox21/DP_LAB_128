package LAB1;

public class LuxuryRide extends RideType {
    @Override
    public double calculateFare(double distance) {
        return distance * 2.0;
    }

    @Override
    public String getType() {
        return "Luxury";
    }
}