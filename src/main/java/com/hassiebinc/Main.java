
package com.hassiebinc;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int correctPin = 6767;
    public static void main(String[] args) {

//        // ==========================================
//        // WELCOME TO THE REMIND YOU APP
//        // ==========================================
//
//        System.out.println("================================");
//        System.out.println("      REMIND YOU APP");
//        System.out.println("================================");
//
//        System.out.println("Don't forget to track your distance!");
//        System.out.println("Reminder: Call your mom!");
//        System.out.println();
//
//
//        // ==========================================
//        // PART 1: VARIABLES & DATA TYPES
//        // ==========================================
//
//        // A variable stores information.
//        // Every variable has a data type and a name.
//        //
//        // Syntax:
//        // dataType variableName = value;
//
//
//        // String: Stores text
//        String appName = "Remind You";
//
//        // int: Stores whole numbers
//        int numberOfReminders = 30;
//
//        // double: Stores decimal numbers
//        double weight = 80.5;
//
//        // boolean: Stores true or false
//        boolean isHappy = true;
//
//        // float: Stores decimal numbers (requires f)
//        float salary = 2394.95f;
//
//        // char: Stores a single character
//        char firstLetter = 'R';
//
//
//        // ==========================================
//        // PART 2: PRINT VARIABLES
//        // ==========================================
//
//        System.out.println("=== My Variables ===");
//
//        System.out.println("App: " + appName);
//        System.out.println("Reminders: " + numberOfReminders);
//        System.out.println("Weight: " + weight + " kg");
//        System.out.println("Happy: " + isHappy);
//        System.out.println("Salary: " + salary);
//        System.out.println("First Letter: " + firstLetter);
//
//
//        // ==========================================
//        // PART 3: MINI CHALLENGE - ABOUT ME
//        // ==========================================
//
//        // YOUR TURN!
//        //
//        // Create variables to store:
//        //
//        // 1. Your name
//        String name = "Remsey Mailjard";
//        // 2. Your age
//        int age = 37;
//        // 3. Your weight
//        float myweight = 90.00f;
//        // 4. Your dream salary per month
//        double dreamSalaryPerMonth  = 9999f;
//        // 5. First letter of your last name
//        char firstLetterLastName = 'M';
//        // 6. Do you love gaming? (true/false)
//        boolean isGamer = true;
//        // Choose the correct data types:
//        // String, int, double, float, char, boolean
//
//
//        // ==========================================
//        // BONUS CHALLENGE
//        // ==========================================
//
//        // Print your information using
//        System.out.println("Name: " + name);
//
//        // Example output:
//        // camelCasing --- vs PascalCasing
//        // === ABOUT ME ===
//        // Name: Alex
//        // Age: 22
//        // Weight: 75.5 kg
//        // Dream Salary: 5000 per month
//        // First Letter: J
//        // Loves Gaming: true
//// PascalCasing = Classnames (FirstLetter Uppercase)









                System.out.println("Welcome to Java ATM!");

                System.out.print("Enter your PIN: ");
                int pin = scanner.nextInt();

                if (pin == correctPin) {
                    showMenu();
                } else {
                    System.out.println("Incorrect PIN. Access denied.");
                }
            }

            // Display ATM menu
            public static void showMenu() {

                System.out.println("\n=== ATM MENU ===");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.print("Choose an option: ");


                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Withdraw selected.");
                        break;
                    case 2:
                        deposit();
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }

            // Deposit money
            public static void deposit() {

                System.out.println("\nChoose your account:");
                System.out.println("1. Savings");
                System.out.println("2. Checking");

                int account = scanner.nextInt();

                if (account != 1 && account != 2) {
                    System.out.println("Invalid account.");
                    return;
                }

                System.out.print("How much do you want to deposit? $");
                int expectedAmount = scanner.nextInt();

                System.out.println("\nInsert your bills...");
                System.out.println("ATM is counting your money...");

                // Simulate the bills inserted into the ATM
                int[] bills = {100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 20};

                int total = 0;

                for (int bill : bills) {
                    System.out.println("Reading bill: $" + bill);
                    total += bill;
                }

                System.out.println("\nTotal counted: $" + total);

                System.out.print("Is this the correct amount? (yes/no): ");
                String answer = scanner.next();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Deposit successful!");
                    System.out.println("Deposited: $" + total);
                } else {
                    System.out.print("What is the correct amount? $");
                    int correctAmount = scanner.nextInt();

                    System.out.println("You entered: $" + correctAmount);
                    System.out.println("Returning all bills...");
                    System.out.println("Please take your money.");
                    System.out.println("Deposit cancelled.");
                }
            }
        }
        //camelCasing = Variables
