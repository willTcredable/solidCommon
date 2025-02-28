package com.solidmetal.constants;

import org.bouncycastle.crypto.digests.Blake2bDigest;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Utils {

    public static final String SOLID_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";


    public static String hashCustomerId(String customerId) {

        Blake2bDigest digest = new Blake2bDigest(128); // 128-bit BLAKE2b
        byte[] inputBytes = customerId.getBytes(StandardCharsets.UTF_8);
        byte[] hashBytes = new byte[digest.getDigestSize()];

        digest.update(inputBytes, 0, inputBytes.length);
        digest.doFinal(hashBytes, 0);

        return Base64.getEncoder().encodeToString(hashBytes); // Convert to Base64
    }

}
