package com.hospital.DbConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class HibernateIntegrationTest {

    @Test
    public void canBuildSessionFactory_andOpenSession() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        assertNotNull(sf, "SessionFactory should not be null");

        Session session = null;
        try {
            session = sf.openSession();
            assertNotNull(session, "Session should not be null");
            // basic sanity: session is either open or can report connection status
            assertTrue(session.isOpen() || !session.isOpen() == false);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}

