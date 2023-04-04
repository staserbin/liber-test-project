package com.dob.program;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateOfBirthProgram {

    private static final Integer minAge = 18;

    public static void main(String[] args) {
        Scanner scnnr = new Scanner(System.in);

        System.out.print("Enter your Date of Birth in format 'yyyy-MM-dd': ");
        String dob = enterAndValidate(scnnr);

        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();

        int age = calculateAge(birthDate, currentDate);

        checkAge(age, minAge);
    }

    public static String enterAndValidate(Scanner scnnr) {
        String input = scnnr.next();
        if (input == null) {
            throw new IllegalArgumentException("input shouldn't be null");
        }
        return input;
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate){
        return Period.between(birthDate, currentDate).getYears();
    }

    public static void checkAge(int currentAge, int minAge) {
        if(currentAge >= minAge) {
            System.out.println("Your age is " + currentAge + ". You can get an access.");
        } else {
            System.out.println("Your age is " + currentAge + ". You must be at least " + minAge + " years old.");
        }
    }
}
