package com.dob.tests;

import com.dob.function.DateOfBirthFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDateOfBirthFunction {
    @Test
    @DisplayName("Check when age is over 18")
    public void testDOBisOver18() {
        int expectedAge = 37;
        LocalDate dateOfBirth = LocalDate.now().minusYears(expectedAge);

        assertEquals(actualAge(dateOfBirth), expectedAge);
    }

    @Test
    @DisplayName("Check when age is under 18")
    public void testDOBisUnder18() {
        int expectedAge = 15;
        LocalDate dateOfBirth = LocalDate.now().minusYears(expectedAge);

        assertEquals(actualAge(dateOfBirth), expectedAge);
    }

    private int actualAge(LocalDate dateOfBirth) {
        DateOfBirthFunction dob = new DateOfBirthFunction();
        return dob.dateOfBirth(dateOfBirth);
    }
}
