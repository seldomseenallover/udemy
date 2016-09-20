package org.udemy.java.course;
//sec 4, Lec 22
public class DataTypeString {
        public static void main(String[] args) {
	/** 8 Data Types thusfar - Primitive Types in Java
     * Built into language
     * building data types = objects
     * bytes
     * short
     * int
     * long
     * float
     * double
     * char - contain only 1 character
     * boolean
     * 9th data type
     * String - sequence of characters - unlimited
     **/
	    String myString = "This is a string"; //use " for String, ' for Char
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }
}