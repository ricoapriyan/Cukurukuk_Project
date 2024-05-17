package GUI;
import java.util.HashSet;
import java.util.Set;
import java.security.SecureRandom;

public class KodePesanan {

    static final String kode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static final int len_code = 10;

    public static String kodePesanan() {
        StringBuilder sb = new StringBuilder(len_code);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < len_code; i++) {
            int randomIndex = random.nextInt(kode.length());
            char randomChar = kode.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
