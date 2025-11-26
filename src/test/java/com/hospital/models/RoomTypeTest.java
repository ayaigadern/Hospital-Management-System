package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTypeTest {

    @Test
    public void typeAndCost() {
        RoomType rt = new RoomType();
        rt.setRoomTypeId(2);
        rt.setTypeOfroom("Double");
        rt.setRoomCost(150.0);

        assertEquals(Integer.valueOf(2), rt.getRoomTypeId());
        assertEquals("Double", rt.getTypeOfroom());
        assertEquals(150.0, rt.getRoomCost());
    }

}
