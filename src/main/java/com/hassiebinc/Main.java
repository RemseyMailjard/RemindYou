
package com.hassiebinc;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // WELCOME TO THE REMIND YOU APP
        // ==========================================

        System.out.println("================================");
        System.out.println("      REMIND YOU APP");
        System.out.println("================================");

        System.out.println("Don't forget to track your distance!");
        System.out.println("Reminder: Call your mom!");
        System.out.println();


        // ==========================================
        // PART 1: VARIABLES & DATA TYPES
        // ==========================================

        // A variable stores information.
        // Every variable has a data type and a name.
        //
        // Syntax:
        // dataType variableName = value;


        // String: Stores text
        String appName = "Remind You";

        // int: Stores whole numbers
        int numberOfReminders = 30;

        // double: Stores decimal numbers
        double weight = 80.5;

        // boolean: Stores true or false
        boolean isHappy = true;

        // float: Stores decimal numbers (requires f)
        float salary = 2394.95f;

        // char: Stores a single character
        char firstLetter = 'R';


        // ==========================================
        // PART 2: PRINT VARIABLES
        // ==========================================

        System.out.println("=== My Variables ===");

        System.out.println("App: " + appName);
        System.out.println("Reminders: " + numberOfReminders);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Happy: " + isHappy);
        System.out.println("Salary: " + salary);
        System.out.println("First Letter: " + firstLetter);


        // ==========================================
        // PART 3: MINI CHALLENGE - ABOUT ME
        // ==========================================

        // YOUR TURN!
        //
        // Create variables to store:
        //
        // 1. Your name
        String name = "Remsey Mailjard";
        // 2. Your age
        int age = 37;
        // 3. Your weight
        float myweight = 90.00f;
        // 4. Your dream salary per month
        double dreamSalaryPerMonth  = 9999f;
        // 5. First letter of your last name
        char firstLetterLastName = 'M';
        // 6. Do you love gaming? (true/false)
        boolean isGamer = true;
        // Choose the correct data types:
        // String, int, double, float, char, boolean


        // ==========================================
        // BONUS CHALLENGE
        // ==========================================

        // Print your information using
        System.out.println("Name: " + name);

        // Example output:
        // camelCasing --- vs PascalCasing
        // === ABOUT ME ===
        // Name: Alex
        // Age: 22
        // Weight: 75.5 kg
        // Dream Salary: 5000 per month
        // First Letter: J
        // Loves Gaming: true
// PascalCasing = Classnames (FirstLetter Uppercase)


        //camelCasing = Variables
    }
}
