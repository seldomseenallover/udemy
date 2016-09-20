package org.udemy.java.course;
// Sec 4, Lec 20

/** Floating point #'s
 * #'s that have decimal points.
 * width of int = 32 (4 bytes)
 * width of float = 32 (4 bytes)
 * width of double = 64 (8 bytes) [faster performance, inbuilt func in java usually use, more precise]
 * 2 Data Types - Float (#f, optional) [single precision - up to 7 digits] | Double (#d or #.##, optional) [double precision - up to 16 digits]
 * sec 4 | lec 20
 **/

public class DataTypeIntFloatDouble {
        public static void main(String[] args) {
        //compare int & float
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        //float myFloatValue = 5.4f; //f designates # as a float
        //float myFloatValue = (float) 5.4; ''casting''
        //defining literal values - double pi = 3_000_00.141592d; or double pi = 3.141592d
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        /**Challenge - Convert a given # of pounds - lbs to kilograms kg
         * 1. Create a variable to store the # of lbs
         * 2. Calculate the # of kg's for the # above & store in a variable.
         * 3. Print out the results.
         * Notes: 1 lb = 0.45359237 kg
          */
        double myValueLbs = 145.5d; //variable to store lbs
        double myValueKgs = 0.45359237d;
        double myKgsConverted = myValueLbs * myValueKgs;
        System.out.println("Weight is myWeightValue " + myKgsConverted);
    }
}