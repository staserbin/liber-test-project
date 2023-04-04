package com.dob.function;

import java.time.LocalDate;
import java.time.Period;

public class DateOfBirthFunction {

    public int dateOfBirth(LocalDate dob) {
        int minAge = 18;

        LocalDate currentDate = LocalDate.now();

        int currentAge = Period.between(dob, currentDate).getYears();

        if(currentAge >= minAge) {
            System.out.println("Your age is " + currentAge + ". You can get an access.");
        } else {
            System.out.println("Your age is " + currentAge + ". You must be at least " + minAge + " years old.");
        }

        return currentAge;
    }
}
