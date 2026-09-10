import java.security.MessageDigest;
import java.security.KeyPairGenerator;

public class CryptoDemo {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");

        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);

        System.out.println(md);
    }
}
