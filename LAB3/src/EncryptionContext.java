public class EncryptionContext {
    private EncryptionStrategy strategy;

    public EncryptionContext(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        String plaintext = FileUtils.readFile(inputFilePath);
        String ciphertext = strategy.encrypt(plaintext);
        FileUtils.writeFile(outputFilePath, ciphertext);
    }

    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        String ciphertext = FileUtils.readFile(inputFilePath);
        String plaintext = strategy.decrypt(ciphertext);
        FileUtils.writeFile(outputFilePath, plaintext);
    }
}
