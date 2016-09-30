package org.udemy.java.course;
// Sec 4, Lec 21
public class DataTypesStringCharBoolean {
        public static void main(String[] args) {
	// char can store single Char, or unicode 'unicode-table.com - http://unicode-table.com/en/
        // width of 16 (2 bytes)
        char myChar = 'D';
        char myCharUniCode = '\u00A9';
        System.out.println("Unicode output was: " + myCharUniCode);

        boolean myBoolean = true; //true or false
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char & assign to the unicode value for that symbol.
        // 3. Display it on screen

        char myCharUniProb = '\u00AE';
        System.out.println("Unicode output for Registered Trademark Symbol was: " + myCharUniProb);
    }
}