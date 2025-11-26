package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class MessageTest {

    @Test
    public void messageProperties() {
        Message m = new Message();
        m.setMessageId(77);
        m.setSubject("Hello");
        m.setMessageBody("Body");
        m.setMessageStatus(true);
        m.setMessageDate(new Date());

        assertEquals(Integer.valueOf(77), m.getMessageId());
        assertEquals("Hello", m.getSubject());
        assertEquals("Body", m.getMessageBody());
        assertNotNull(m.getMessageDate());
    }

}
