package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QualificationTest {

    @Test
    public void roundtrip() {
        Qualification q = new Qualification();
        q.setQualId(2);
        q.setInstituteName("Uni");
        q.setQualificationName("MBBS");
        q.setDegree("MD");

        assertEquals(Integer.valueOf(2), q.getQualId());
        assertEquals("Uni", q.getInstituteName());
        assertEquals("MBBS", q.getQualificationName());
        assertEquals("MD", q.getDegree());
    }

}
