package org.udemy.java.course;

/*VariablesSec4Lec18 */

public class Variables {
       public static void main(String[] args) {

       System.out.println("Hello Malik!");

       int myFirstNumber = (10 + 5) + (2 * 10);
       /**data type = int, variable name = myFirstNumber,
        assigned value 5, or mathematical expressions**/
       int mySecondNumber = 12;
       //int myThirdNumber = 6;
       int myThirdNumber = myFirstNumber * 2;
       int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
       int myVarChallengeSec4Lec18 = 1000 - myTotal;

       System.out.println(myFirstNumber);
       System.out.println("myFirstNumber");
       System.out.println(myThirdNumber);
       System.out.println(myTotal);
       System.out.println(myVarChallengeSec4Lec18);
   }
}
