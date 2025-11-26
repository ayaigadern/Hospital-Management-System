package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WorkExperinceTest {

    @Test
    public void fieldsRoundtrip() {
        WorkExperince w = new WorkExperince();
        w.setWorkExperienceId(11);
        w.setNameOfOrganization("Org");
        w.setPosition("Dev");
        w.setStartDate("2010");
        w.setEndDate("2015");

        assertEquals(Integer.valueOf(11), w.getWorkExperienceId());
        assertEquals("Org", w.getNameOfOrganization());
        assertEquals("Dev", w.getPosition());
    }

}
