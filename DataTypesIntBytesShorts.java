package org.udemy.java.course;

// Sec 4, Lec 19

public class DataTypesIntBytesShorts {
    
        public static void main(String[] args) {
     // 4 data types based on whole #'s, int, short, byte, long

	    // int has width of 32
        // smallest & largest # that can fit into an int
        // fixed # to right of variable = literal, can use _ to make # more readable
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2147483647;
        //arithmetic
        int myMinIntTotal = (myMinIntValue/2);
        int myMaxIntTotal = (myMaxIntValue/2);
        System.out.println("My Min Int Total = " + myMinIntTotal);
        System.out.println("My Max Int Total = " + myMaxIntTotal);

        // short has width of 16
        // short, half or 50% size of int
        // smallest & largest # that can fit into a short,
        // only needs 1/2 memory allocation then int,
        // twice amount of space as
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        //arithmetic
        // (casting) of short to tell compiler to read & display as byte rather than default of integer
        short myMinShortTotal = (short)(myMinShortValue/2);
        short myMaxShortTotal = (short)(myMaxShortValue/2);

        System.out.println("My Min Short Total = " + myMinShortTotal);
        System.out.println("My Max Short Total = " + myMaxShortTotal);

        // byte has width of 8
        // byte, half or 50% size of short
        // smallest & largest # that can fit into a byte,
        // only needs 1/4 memory allocation then int
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        //arithmetic
        // (casting) of byte to tell compiler to read & display as byte rather than default of integer
        byte myMinByteTotal = (byte)(myMinByteValue/2);
        byte myMaxByteTotal = (byte)(myMaxByteValue/2);

        System.out.println("My Min Byte Total = " + myMinByteTotal);
        System.out.println("My Max Byte Total = " + myMaxByteTotal);

        // long has width of 64
        // # larger than Max Int value
        // long, double or 2 times size of int
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        //arithmetic
        long myMinLongTotal = (myMinLongValue/2);
        long myMaxLongTotal = (myMaxLongValue/2);

        System.out.println("My Min Long Total = " + myMinLongTotal);
        System.out.println("My Max Long Total = " + myMaxLongTotal);

        //Exercise 1 - 4
        /**1. Create a byte variable & set it to any valid byte #.
         * 2. Create a short variable & set it to any valid short #.
         * 3. Create an int variable & set it to any valid int #.
         * 4. Create a variable of type long, &
         * make it equal to 50000 + 10 times the sum of the byte,
         * plus the short plus the int
         */
        //1. Create a byte variable & set it to any valid byte #
        byte byteVarSec4Lec19 = -45;
            System.out.println("byte is = " + byteVarSec4Lec19);

        //2. Create a short variable & set it to any valid short #
        short shortVarSec4Lec19 = 1250;
            System.out.println("Short is = " + shortVarSec4Lec19);

        //3. Create an int variable & set it to any valid int #
        int intVarSec4Lec19 = 125000;
            System.out.println("Int is = " + intVarSec4Lec19);

        //4. Create a variable of type long, make it equal to 50000 +  plus the short plus the int
        //casting not needed
        long longVarSec4Lec19 = 50000L + 10L * (byteVarSec4Lec19 + shortVarSec4Lec19 + intVarSec4Lec19);
            System.out.println("Long is = " + longVarSec4Lec19);

        short shortTotal = (short) (1000 + 10 * (byteVarSec4Lec19 + shortVarSec4Lec19 + intVarSec4Lec19));
        System.out.println("Short is = " + shortTotal);
    }
}