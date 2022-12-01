package com.example.gccoffee.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Email("aaa");
        });
    }

    @Test
    public void testValidEmail() {
        Email email = new Email("hello@gmail.com");
        assertTrue(email.getAddress().equals("hello@gmail.com"));
    }

    @Test
    public void testEqEmail() {
        Email email = new Email("hello@gmail.com");
        Email email2 = new Email("hello@gmail.com");
        assertEquals(email, email2);
    }
}