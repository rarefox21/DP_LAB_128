import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose encryption algorithm: ");
            System.out.println("1: AES");
            System.out.println("2: DES");
            System.out.println("3: Caesar Cipher");

            int choice = scanner.nextInt();
            scanner.nextLine();

            EncryptionStrategy strategy = null;

            if (choice == 1) {
                System.out.println("Enter a 16-byte key for AES: ");
                String key = scanner.nextLine();
                strategy = new AESEncryption(key);
            } else if (choice == 2) {
                System.out.println("Enter an 8-byte key for DES: ");
                String key = scanner.nextLine();
                strategy = new DESEncryption(key);
            } else if (choice == 3) {
                System.out.println("Enter the shift value for Caesar Cipher: ");
                int shift = scanner.nextInt();
                strategy = new CaesarCipherEncryption(shift);
            } else {
                System.out.println("Invalid choice");
                return;
            }

            EncryptionContext context = new EncryptionContext(strategy);

            System.out.println("Enter the input file path: ");
            String inputFile = scanner.next();
            System.out.println("Enter the output file path for encrypted content: ");
            String encryptedFile = scanner.next();

            context.encryptFile(inputFile, encryptedFile);

            System.out.println("Enter the output file path for decrypted content: ");
            String decryptedFile = scanner.next();

            context.decryptFile(encryptedFile, decryptedFile);

            System.out.println("Encryption and decryption completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}