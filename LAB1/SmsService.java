package LAB1;

public class SmsService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
