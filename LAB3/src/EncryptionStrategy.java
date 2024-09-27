public interface EncryptionStrategy {
    String encrypt(String plaintext) throws Exception;
    String decrypt(String ciphertext) throws Exception;
}