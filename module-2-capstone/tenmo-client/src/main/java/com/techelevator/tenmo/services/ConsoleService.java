package com.techelevator.tenmo.services;


import com.techelevator.tenmo.model.UserCredentials;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printGreeting() {
        System.out.println("*********************");
        System.out.println("πΈWelcome to TEnmo!πΈ");
        System.out.println("*********************");
    }

    public void printLoginMenu() {
        System.out.println();
        System.out.println("1: Register");
        System.out.println("2: Login");
        System.out.println("0: Exit");
        System.out.println();
    }

    public void printWelcome(){
        System.out.println("\n***************************");
        System.out.println("πΈ Welcome back to TEnmo! πΈ");
        System.out.println("***************************\n");
    }

    public void printMainMenu() {
        System.out.println("1: View your current balance π°");
        System.out.println("2: View your past transfers π΅");
        System.out.println("3: View your pending requests π«");
        System.out.println("4: Send TE bucks π΅ π€");
        System.out.println("5: Request TE bucks π΅ π₯");
        System.out.println("0: Exit πͺ");
        System.out.println();
    }

    public UserCredentials promptForCredentials() {
        String username = promptForString("\nUsername: ");
        String password = promptForString("Password: ");
        return new UserCredentials(username, password);
    }

    public String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int promptForInt(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }

    public BigDecimal promptForBigDecimal(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return new BigDecimal(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a decimal number.");
            }
        }
    }

    public void loginPause() {
        System.out.println("\nPress Enter to return to the main menu...");
        scanner.nextLine();
    }

    public void pause() {
        System.out.println("\nPress Enter to return to the main menu...");
        scanner.nextLine();
    }

    public void printErrorMessage() {
        System.out.println("\nAn error occurred. Check the log for details.");
    }

    public void registrationError(){
        System.out.println("\nThere was an error when registering the account, please try again");
    }

    public void loginError(){
        System.out.println("\nUsername/Password is incorrect");
    }

    public void nextUpdate(){
        System.out.println("\nComing soon in the next update!");
    }

}
