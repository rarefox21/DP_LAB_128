public class CaesarCipherEncryption implements EncryptionStrategy {
    private int shift;

    public CaesarCipherEncryption(int shift) {
        this.shift = shift;
    }

    public String encrypt(String plaintext) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (Character.isUpperCase(c)) {
                encrypted.append((char) (((c - 'A' + shift) % 26) + 'A'));
            } else if (Character.isLowerCase(c)) {
                encrypted.append((char) (((c - 'a' + shift) % 26) + 'a'));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public String decrypt(String ciphertext) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : ciphertext.toCharArray()) {
            if (Character.isUpperCase(c)) {
                decrypted.append((char) (((c - 'A' - shift + 26) % 26) + 'A'));
            } else if (Character.isLowerCase(c)) {
                decrypted.append((char) (((c - 'a' - shift + 26) % 26) + 'a'));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
