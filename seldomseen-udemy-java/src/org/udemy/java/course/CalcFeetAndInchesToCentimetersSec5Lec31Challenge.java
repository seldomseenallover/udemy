/* 
 * Challenge @ 9:40 time name class - calcFeetAndInchesToCentimeters
 *      Method Overloading
 *      Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.
        
        //use MethodOverloadingSec5Lec31 for starting code: commented code
     //http://www.metric-conversions.org/length/feet-to-centimeters.htm
     //calling one overloaded method from another overloaded method use correct # of parameters
 */

package org.udemy.java.course;

public class CalcFeetAndInchesToCentimetersSec5Lec31Challenge {

      public static void main(String[] args) {
          calcFeetAndInchesToCentimeters(13, 8);
          calcFeetAndInchesToCentimeters(105);
}
        public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
                // comment || = 'or', && = 'and'
             if((feet <0) || ((inches <0) || (inches >12))) {
                 System.out.println("Invalid feet or inches parameter");
                 return -1;
             }
             double centimeters = (feet * 12) * 2.54;
             centimeters += inches * 2.54;
             System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
             return centimeters;
            }
        
        public static double calcFeetAndInchesToCentimeters(double inches) {
            
            if(inches < 0) {
                return -1;
            }
            double feet  = (int) inches / 12;
            double remainingInches = (int) inches % 12; // % - remainder operator
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);            
    }
 }