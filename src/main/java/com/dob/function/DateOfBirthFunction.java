package com.dob.function;

import java.time.LocalDate;
import java.time.Period;

public class DateOfBirthFunction {

    public int dateOfBirth(LocalDate dob) {
        int minAge = 18;

        LocalDate currentDate = LocalDate.now();

        int currentAge = Period.between(dob, currentDate).getYears();

        if(currentAge >= minAge) {
            System.out.printf("Your age is %s. You can get an access.%n", currentAge);
        } else {
            System.out.printf("Your age is %s. You must be at least %s years old.", currentAge, minAge);
        }

        return currentAge;
    }
}
