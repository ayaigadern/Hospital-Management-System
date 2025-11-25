package com.hospital.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void gettersAndSetters() {
        Category c = new Category();
        c.setCategoryId(10);
        c.setCategoryName("Nursing");

        assertEquals(Integer.valueOf(10), c.getCategoryId());
        assertEquals("Nursing", c.getCategoryName());
    }

}
