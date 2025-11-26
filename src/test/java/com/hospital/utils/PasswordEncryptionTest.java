package com.hospital.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import org.junit.jupiter.api.Test;

public class PasswordEncryptionTest {

    @Test
    public void encryptProducesDifferentAndDeterministic() throws Exception {
        String a = PasswordEncryption.encrypt("secret");
        String b = PasswordEncryption.encrypt("secret");
        assertNotNull(a);
        assertNotEquals("secret", a);
        assertEquals(a, b);
    }

    @Test
    public void encryptEmptyString() throws Exception {
        String e = PasswordEncryption.encrypt("");
        assertNotNull(e);
        assertNotEquals("", e);
    }

    @Test
    public void differentPasswordsProduceDifferentHashes() throws Exception {
        String p1 = PasswordEncryption.encrypt("one");
        String p2 = PasswordEncryption.encrypt("two");
        assertNotNull(p1);
        assertNotNull(p2);
        assertNotEquals(p1, p2);
    }

    @Test
    public void encryptReturnsBase64Digest() throws Exception {
        String clear = "123456";
        String encrypted = PasswordEncryption.encrypt(clear);
        assertNotNull(encrypted);
        assertTrue(encrypted.length() > 0);

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(clear.getBytes(StandardCharsets.UTF_8));
        String expected = java.util.Base64.getEncoder().encodeToString(digest);
        assertEquals(expected, encrypted);
    }

}
