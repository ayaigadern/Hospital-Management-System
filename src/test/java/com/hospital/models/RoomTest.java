package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    public void roomFields() {
        Room r = new Room();
        r.setRoomId(12);
        r.setNumberOfBeds(3);
        r.setNumberOfAvailableBeds(2);
        r.setRoomNumber(101);

        RoomType rt = new RoomType();
        rt.setRoomTypeId(1);
        rt.setTypeOfroom("Single");
        r.setRoomType(rt);

        assertEquals(Integer.valueOf(12), r.getRoomId());
        assertEquals(3, r.getNumberOfBeds());
        assertEquals(2, r.getNumberOfAvailableBeds());
        assertEquals(101, r.getRoomNumber());
        assertNotNull(r.getRoomType());
    }

}
