package com.solidmetal.constants;

import org.bouncycastle.crypto.digests.Blake2bDigest;

import java.nio.charset.StandardCharsets;

public class Utils {

    public static final String SOLID_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";


    public static String hashCustomerId(String customerId) {

        try {

            Blake2bDigest digest = new Blake2bDigest(128); // 128-bit digest

            byte[] inputBytes = customerId.getBytes(StandardCharsets.UTF_8);
            digest.update(inputBytes, 0, inputBytes.length);

            byte[] hashBytes = new byte[digest.getDigestSize()];
            digest.doFinal(hashBytes, 0);

            // Convert to hex
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (Exception e) {
            return customerId;
        }
    }
}
