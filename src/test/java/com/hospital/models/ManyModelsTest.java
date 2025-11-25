package com.hospital.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class ManyModelsTest {

    @Test
    public void exerciseCommonPojos() {
        BloodGroup bg = new BloodGroup();
        bg.setBloodGroupId(1);
        bg.setBloodGroupName("O-");
        assertEquals("O-", bg.getBloodGroupName());

        NextOfKin kin = new NextOfKin();
        kin.setFullName("Kin Name");
        kin.setPhone("999999999");
        assertEquals("Kin Name", kin.getFullName());

        Message msg = new Message();
        msg.setMessageId(11);
        msg.setMessageBody("hello");
        msg.setSubject("sub");
        assertEquals("hello", msg.getMessageBody());

        NurseServiceTime nst = new NurseServiceTime();
        nst.setDepartment("ER");
        nst.setServiceDate(new Date());
        assertEquals("ER", nst.getDepartment());

        Room r = new Room();
        r.setRoomId(2);
        r.setNumberOfBeds(5);
        r.setRoomNumber(101);
        assertEquals(5, r.getNumberOfBeds());

        RoomType rt = new RoomType();
        rt.setRoomTypeId(3);
        rt.setTypeOfroom("Private");
        assertEquals("Private", rt.getTypeOfroom());

        ShiftTime st = new ShiftTime();
        st.setShiftTimeID(7);
        st.setFromTime("22:00");
        st.setToTime("06:00");
        assertEquals("22:00", st.getFromTime());

        Xray x = new Xray();
        x.setFirstName("XrayTech");
        assertEquals("XrayTech", x.getFirstName());

        PatientDrugInvoice pdi = new PatientDrugInvoice();
        pdi.setDrugId(21);
        pdi.setQuantity(2);
        assertEquals(2, pdi.getQuantity());

        Accountant acc = new Accountant();
        acc.setFirstName("Acc");
        assertEquals("Acc", acc.getFirstName());

        Receptioniest rec = new Receptioniest();
        rec.setFirstName("Rec");
        assertEquals("Rec", rec.getFirstName());

        Pharmatiest ph = new Pharmatiest();
        ph.setFirstName("Ph");
        assertEquals("Ph", ph.getFirstName());

        Doctor doc = new Doctor();
        doc.setFirstName("Doc");
        assertEquals("Doc", doc.getFirstName());

        BookBed bb = new BookBed();
        bb.setBedId(88);
        bb.setDepartement("ward1");
        bb.setStatus(true);
        assertTrue(bb.isStatus());
    }

}
