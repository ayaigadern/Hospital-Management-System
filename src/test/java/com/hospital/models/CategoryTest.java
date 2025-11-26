package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void nameAndId() {
        Category c = new Category();
        c.setCategoryId(3);
        c.setCategoryName("Nursing");

        assertEquals(Integer.valueOf(3), c.getCategoryId());
        assertEquals("Nursing", c.getCategoryName());
    }

}
