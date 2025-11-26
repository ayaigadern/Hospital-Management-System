package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class NurseServiceTimeTest {

    @Test
    public void basicFieldsAndAssociations() {
        NurseServiceTime nst = new NurseServiceTime();
        nst.setNurseServiceTimeID(2);
        Date now = new Date();
        nst.setServiceDate(now);
        nst.setDepartment("ER");

        ShiftTime st = new ShiftTime();
        st.setFromTime("09:00");
        nst.setShiftTime(st);

        Nurse nurse = new Nurse();
        nst.setNurse(nurse);

        assertEquals(2, nst.getNurseServiceTimeID());
        assertNotNull(nst.getServiceDate());
        assertEquals("ER", nst.getDepartment());
        assertNotNull(nst.getShiftTime());
        assertNotNull(nst.getNurse());
    }

}
