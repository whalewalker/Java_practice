package com.learning.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        //    String constructor
//        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
//        String s = new String("hello");
//
//        String s1 = "";
//        String s2 = new String(s);
//        String s3 = new String(charArray);
//        String s4 = new String(charArray, 6, 3);
//        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n",s1, s2, s3, s4);


//        String s1 = "hello there";
//        char[] charArray = new char[10];
//        System.out.printf("s1: %s", s1);
//        // test length method
//        System.out.printf("%nLength of s1: %d", s1.length() );

//        for (int count = s1.length() - 1; count >= 0; count--)
//            System.out.printf("%c ", s1.charAt(count) );

//        s1.getChars(0, 10, charArray, 0);
//        System.out.println(Arrays.toString(charArray));

//        for (char character : charArray){
//            System.out.print(character);
//        }


        String s1 = new String("hello"); // s1 is a copy of "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        // test compareTo
//        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
//        if(s3.regionMatches(true,0, s4, 0, 5)){
//            System.out.println("Wowo");
//        }else {
//            System.out.println("Wawa");
//        }

//        StringBuilder builder = new StringBuilder("Hello How Are You?");
//        System.out.println(builder.length());
//        System.out.println(builder.capacity());

//        System.out.println(builder.charAt(0));
//        System.out.println(builder.charAt(4));
//
//        char[] charArr = new char[builder.length()];
//        builder.getChars(0, builder.length(), charArr, 0);
//
//        for(char character : charArr)
//            System.out.print(character);
//
//            Object objectRef = "hello";
//            String string = "goodbye";
//            char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
//            boolean booleanValue = true;
//            char characterValue = 'Z';
//            int integerValue = 7;
//            long longValue = 10000000000L;
//            String[] stringArr = {"Hello", "I Love you"};
//
//        builder.append(objectRef).append(Arrays.toString(stringArr));
//        System.out.println(builder);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a sentence and press enter: ");
//        String sentence = scanner.nextLine();
//        String[] tokens = sentence.split(" ");
//        System.out.printf("Number of elements: %d%n The tokens are:%n", tokens.length);
//
//        for (String token : tokens){
//            System.out.println(token);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();
// validate user input and display error message
        System.out.println("%nValidate Result:");
        if (!validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if (!validateLastName(lastName))
            System.out.println("Invalid last name");
        else if (!validateAddress(address))
            System.out.println("Invalid address");


        else if (validateCity(city))
            System.out.println("Invalid city");
        else if (!validateState(state))
            System.out.println("Invalid state");
        else if (!validateZip(zip))
            System.out.println("Invalid zip code");
        else if (!validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid input. Thank you.");
    }


    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
    }

    public static boolean validateAddress(String address){
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z])");
    }

    public static  boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateZip(String zip){
        return zip.matches("\\d{5}");
    }

    public static boolean validatePhone(String phoneNumber){
        return phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }

}
