package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    int[][] twoDimensionalArray =
            {
                    {0,0,0}, // row ints
                    {0,0,0}, // row ints
            };

    int[] numbers = new int[4];
    // 0, 0.0, false, null
    int numRows = 4;
    int numColumns = 3;
    int[][] getTwoDimensionalArray = new int[numRows][numColumns];
    int myValue = getTwoDimensionalArray[2][0];
    // array[i][j]
    public void loopMethod() {
        for (int i = 0; i < getTwoDimensionalArray.length; i++) {
            // fori[TAB]
            for (int j = 0; j < getTwoDimensionalArray[i].length; j++) {
                System.out.println(getTwoDimensionalArray[i][j]);
            }
        }
        // iter[tab]
        for (int[] ints : twoDimensionalArray) {

        }
    }




    // DTO - Data Transfer Object

    // Design Patterns
    // Services
        // Exposed interface only
        // Processes can be shared by multiple machines
    // Singletons
        // ONLY ONE INSTANCE CAN EXIST


    // Concrete Code
    // Abstract Method // Interfaces ONLY have abstract methods

    // List<>
    // ArrayList<String>
    // Stack - Last one is first
    // Queue - First one is first
    // Set - Order doesn't matter (Can use a for-each loop)

    // Primitive Array - Uses less memory/can use with primitive data types; can't change size/hard to add/remove stuff
    // ArrayList - Easy to add/remove stuff, uses more memory, and it only works with Object types
    // Set - Great at storing unique data, but there's no way to index it
    // Map - Can lookup by label/name/key

    // Reference Types
    String[] myArray = { "hello" };

    public static void workingWithMaps() {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Burt", "202-555-0118");
        phoneBook.put("Kaycee", "202-555-0220");

        String burtsPhone = phoneBook.get("Burt");

        for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

//        for (String currentValue : phoneBook.values()) {
//            System.out.println(currentValue);
//        }
    }

    public static void buildingStrings() {
        StringBuilder jackString = new StringBuilder();
        jackString.append("My name is Jack");
        jackString.append(". ");
        jackString.append("I live in Huntington, WV.");
        System.out.println(jackString.toString());
    }

    public static String fancyPrint(String msg) {
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("Jack");
        myStringList.add("Huntington");

        System.out.println(myStringList);
        String newMessage = "***" + msg + "***";
        return newMessage;
    }

    public static int doCoolMath(int a, int b) {
        double result = Math.sqrt(16);
        System.out.println(result);
        // Separation of Concerns
            // Single Responsibility Principle
        int myNum = a + b;
        return myNum;
    }

    public static void myNotesMethod() {
        double result; // Declaration
        int a = 1;
        int b = 3;
        int c;
        result = a / b; // PEMDAS - Parentheses, Exponents, Multiplication, Division, Addition, Subtraction
        int myAge = 37;
        String fruit = "Apple";
        String testString = "apple";
        String anotherString = "I have two kids!\"";
        String myString = "This is a string! I am " + myAge + "! I said, \"Hello! " + anotherString; // Concatenation
        System.out.println(myString);
        System.out.println();

        // == is used to check an address in memory
        if (fruit.equals(testString)) {
            System.out.println("The strings are the same!");
        } else {
            System.out.println("The strings are not equal!");
        }

        if ((myAge != 37) && fruit.equals("Apple")) { // BANG! Exclamation point/ "Not" character / Negator
            // AND &&
            // OR ||
            // NOT !
            System.out.println("My age is not 37!");
        } else {
            System.out.println("My age is 37!");
        }

        // Initializing an Array
        String[] ingredients = new String[]{"milk", "eggs", "bread"};
        ArrayList<String> convertedIngredients = new ArrayList<>(Arrays.asList(ingredients));
        convertedIngredients.add("Sugar");
        convertedIngredients.add("Coffee");

        Object[] primitiveArray = convertedIngredients.toArray(new String[]{});

        for(int i = 0; i < primitiveArray.length; i++) {
            System.out.println(primitiveArray[i]);
        }

        String[] emptyJournal = new String[5]; // null is the default value for String
        ingredients[1] = "pear";
        int varIndex = 1;
        // Bracket Accessor
        try {
            System.out.println(ingredients.length);
            System.out.println("The ingredient is: " + ingredients[2]);
        } catch (Exception e) {
            System.out.println(e);
        }

        boolean imHungry = true;
        int myIndex = 10;
        // Index
        // Incrementor/Decrementor
        // End Condition
        // Infinite Loop

        while (imHungry == true) {
            System.out.println("Check the fridge");
            myIndex--; // Decrementor
            if (myIndex < 3) {
                imHungry = false;
            }
        }

//        System.out.printf("\n");
//        System.out.println("Book About Rabbits");
//        System.out.println();
//        // Start position/index, End condition, Incrementor
//        String[] bookPages = new String[]{"page about rabbits", "page about their habitiats", "page about their food", "page about what fur is made of"};
//        String newString = "hi bestie!";
//        for(int i = 0; i < newString.length(); i++) {
//            System.out.println(newString.charAt(i));
//        }
//
//        System.out.println(newString.toUpperCase());

        //ArrayIndexOutOfBoundsException


        // int, float, double default to 0
        // String, Object default to null
        // boolean defaults to false


        //        if (titansScore < opponentScore) {
        //            iCry();
        //        }
        // The order, from least accurate to most accurate, roughly goes
        // byte -> short -> int -> long -> float -> double.
        // Expression
        //(x + y)/ 2
        // Statement
        // Declaration Statements - Declare variable
        // Expression Statement - Update value or call method
        // Control Flow Statements - Skip or repeat a block
    }


    // 7 Engineering Skills
    /*
    Documentation
    Organization
    Efficiency
    Debugging
    Teamwork
    Communication
    Problem-Solving

    Java - 1991 - James Gosling
    Object Oriented Language
    Classes
    Programming - Writing instructions for a computer
    Compiled - Converting human code into bytecode
    JDK - Java Development Kit (SDK)
    JRE - Java Runtime Environment - Identifies class libraries "Runtime"
    JVM - Java Virtual Machine - Actually reads them to the computer
    Platform-Independent
    Libraries

    .java
    .class
     */

    /* OOP - Object Oriented Programming
    Abstraction - Only necessary info
    Encapsulation - Hides details about code works
    Inheritance - Sharing properties among related members/classes
    Polymorphism - Calling the same method but it does different things
     */


    /* Style Guidelines
    Whitespace
    while (true) {
        a = (a + b) / (c * d);
    }
    */

    /* Data Types
    boolean - true/false
    char - \u0000
    int - -2^31 - 2^31
    long - ^63
    float - 3.4e-038 - 3.4e+38
    double - 15 decimal digits
    byte - small whole -128 - 127
    short - -32,768 - 32,767


     */

    public static final String INPUT_FILE = "input.txt";
    public static final String OUTPUT_FILE = "output.txt";

    public static void readLines(String csvContent) {
        // Get the lines
        String[] csvLines = csvContent.split("\n");
        // Get the columns
        String[] headers = csvLines[0].split(",");

        for (int i = 1; i < csvLines.length ; i++) {
            String dataItem = csvLines[i];
            String[] dataArray = dataItem.split(",");
            for (int j = 0; j < headers.length; j++) {
                System.out.println(headers[j] + ": " + dataArray[j]);
            }
            System.out.println();
        }

    }


    // Access Modifier, Whether Static or Not, Return Type, Method Name ( Parameters ) { Scope Block }
    public static void main(String[] args) {
        String content = "Write some other stuff.";
        try {
            MyHttpClient myHttpClient = new MyHttpClient();
            System.out.println(myHttpClient.makeGETRequest("https://reqbin.com/echo/get/json"));

//            ObjectMapper objectMapper = new ObjectMapper();
//
//            StudentDTO student = objectMapper.readValue(jsonFile, StudentDTO.class);
//            System.out.println(student.getFirstname());


            //readLines(Files.readString(filePath));

//            FileWriter fileWriter = new FileWriter(OUTPUT_FILE, true);
//            BufferedWriter bWriter = new BufferedWriter(fileWriter);
//            bWriter.write(content);
//            bWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
//        try {
//            FileInputStream inputStream = new FileInputStream(INPUT_FILE);
//            InputStreamReader inputReader = new InputStreamReader(inputStream);
//            BufferedReader bReader = new BufferedReader(inputReader);
//
//            String line;
//            while ((line = bReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // ALWAYS CLOSE
//            inputStream.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }



////        Person dataRecord = new Person("Sam","Johnson","Seattle", 44856, "WA");
////        Person anotherDataRecord = new Person("Jack","Daniels","Huntington", 44857, "WV");
////        System.out.println(anotherDataRecord.getId());
////        //buildingStrings();
//        //workingWithMaps();
//
//        // Logical Equality
//        Penny penny = new Penny("Copper", 1965);
//        Penny newPenny = new Penny("Copper", 1965);
//
//        Penny samePenny = penny; // Address Reference
//        penny.metal = "Aluminum";
//        System.out.println(penny.equals(newPenny));
//
//        // null pointer exception
//        penny = null; // address of penny is going to point to nothing (can't be used for a non-reference Type (like int))

        //Vehicle pickup = new Truck(true, "Joe");

//        Apple one = new Apple();
//        Apple two = new Apple();
//        Apple three = new Apple();
//
//        Apple[] data = {one, two, three};
//
//        AppleDTO appleDto = new AppleDTO(data);
//
//        // Checked exceptions
//        // Unchecked exceptions - Errors thrown during program execution are called runtime errors
//        // Input Validation
//
//        try {
//            System.out.println(data[3]);
//        } catch (Exception exception) {
//            System.out.println(exception);
//            System.out.println(exception.getMessage());
//        }
//        finally {
//            System.out.println("This still runs!");
//        }

        // When to use DTO?
        // If client is asking for multiple pieces of related info
        // Improve performance by reducing number of calls
        // Improve memory performance by sending info in large batches

        // Serialization - Converting objects into data to transfer
        // Deserialization - Converting data into concrete objects

        // Exceptions
        // What caused the error
        // In which file or method the error occured
        // The line number where the error occured

        // 1. Java tracks the location of the error AND the cause
        // 2. An object is created that holds this error information
        // 3. The error is THROWN

        // NullPointerException - Tries to use an object that is null
        // IllegalArgumentException - Incorrect argument to a method
        // IOException - When a method that reads or sends information encounters an error
        // ClassNotFoundException - Class couldn't be found
        // FileNotFoundException - File path/name couldn't be found
        // ArrayIndexOutOfBoundsException - The index is out of bounds or outside the limits of the array
        // all these ^^^ extends Exception

        // Exception.getMessage()
        // Exception.toString() prints most of the Exception info
    }

}