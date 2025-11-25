package com.hospital.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.security.MessageDigest;

import org.junit.jupiter.api.Test;

public class PasswordEncryptionTest {

    @Test
    public void encryptReturnsBase64Digest() throws Exception {
        String clear = "123456";
        String encrypted = PasswordEncryption.encrypt(clear);
        assertNotNull(encrypted);
        assertTrue(encrypted.length() > 0);

        // compute expected via MessageDigest to ensure deterministic check
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(clear.getBytes("UTF8"));
        String expected = java.util.Base64.getEncoder().encodeToString(digest);
        assertEquals(expected, encrypted);
    }

    @Test
    public void differentInputsProduceDifferentHashes() throws Exception {
        String a = PasswordEncryption.encrypt("password1");
        String b = PasswordEncryption.encrypt("password2");
        assertNotEquals(a, b);
    }

}
//test
