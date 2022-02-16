package com.capgemini;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Constraints constraints = new Constraints();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Password: ");
        String password = scanner.nextLine();

        constraints.minLength(password);

        constraints.checkDigit(password);

        constraints.upperLetter(password);

        constraints.lowerLetter(password);

        constraints.specialFeature(password);

        if (constraints.getErrors().size() > 0){
            System.out.println();
            System.out.println("weak password, improve your password:");
            System.out.println("===============================================");
            constraints.getErrors().forEach(System.out::println);
            System.out.println("===============================================");
        }else {
            System.out.println("Password, Accepted!");
        }

    }
}
