package lambda;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class OTP {
    public static String generateOTP() {
        int randomPin   =(int) (Math.random()*99999)+100000;
        String otp  = String.valueOf(randomPin);
        return otp;
    }

    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        for (int i = 0; i < 15; i++) {
//            String otp= new DecimalFormat("000000").format(new Random().nextInt(999999));
//            System.out.println(RandomStringUtils.randomNumeric(6));

        }
        Instant instant2 = Instant.now();
        System.out.println(instant2);
        System.out.println(instant2.plus(5, ChronoUnit.MINUTES));
        System.out.println(instant1.compareTo(instant2));
    }
}
