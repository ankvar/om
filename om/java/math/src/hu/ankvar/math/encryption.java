package hu.ankvar.math;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class encryption {

    public static void main(String[] args) throws Exception {
        String originalMessage = "Hello, World!";

        SecretKey secretKey = generateSecretKey();

        String encryptedMessage = encrypt(originalMessage, secretKey);

        System.out.println("eredeti üzenet: " + originalMessage);
        System.out.println("titkosított üzenet: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, secretKey);
        System.out.println("visszafejtett üzenet: " + decryptedMessage);
    }

    private static SecretKey generateSecretKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);  // kulcs
        return keyGenerator.generateKey();
    }

    private static String encrypt(String message, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedMessage, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
