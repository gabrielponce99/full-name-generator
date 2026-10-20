package com.pluralsight;

import java.util.*;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine().trim();

        String[] names = fullName.split(" ");
        boolean hasMiddleInitial = names.length == 3;
        String firstName = names[0];
        String middleInitial = "";
        String lastName = "";

        if (hasMiddleInitial) {
            middleInitial = names[1];
            lastName = names[2];
        } else {
            lastName = names[1];
        }

        System.out.println("First Name: " + firstName);

        if (!middleInitial.isBlank()){
            System.out.println("Middle Initial: " + middleInitial);
        } else {
            System.out.println("Middle Initial:[None]");
        }

        System.out.println("Last Name: " + lastName);

    }
}
