package com.pluralsight;

import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name initial: ");
        String middleInitial = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your suffix: ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if (!middleInitial.isBlank()) {
            fullName = fullName +  " " + middleInitial + ".";
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isBlank()) {
            fullName = fullName + ", " + suffix;
        }

        System.out.println(fullName);



    }
}
