package LAB1;

public class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
