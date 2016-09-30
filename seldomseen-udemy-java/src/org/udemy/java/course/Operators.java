package org.udemy.java.course;
// Sec 4, Lec 23 & 24
public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2; // =, + are operators, whatever to left or right of operator is operand (1 & 2)
        System.out.println("1 + 2 = " + result);
        //int result = 1; //1 is the literal, operator is =

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlienF = false; // = is assignment operator
        if (isAlienF == false) // == is evaluating the assignment
            System.out.println("It is not an Alien!");
        boolean isAlienT = true; // = is assignment operator
        if (isAlienT == true) // == is evaluating the assignment
            System.out.println("It is an Alien!");

        int topScore = 80;
        //if (topScore == 100); // = equal
        //if (topScore != 100); // != not equal
        //if (topScore >= 100);
        if (topScore <= 100);
        System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) // && - and with conditions can use brackets to clarify
            System.out.println("Greater than second top score & less than 100");
 
        //Sec 4 Lec 24 Part 2 - summay list of all operators
        if((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");
            
        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");
            
        boolean isCar = false;
        if(isCar == true) //equals test rather scenario test
            System.out.println("This is not supposed to happen");
            
        //turnery operator
        isCar = true;
        boolean wasCar = isCar ? true : false; //if iscar evaluated, is it true, if so return true & return results
        if(wasCar)
            System.out.println("wasCar is true");
            
            
        //http://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        //http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        
        /* CHALLENGE Sec 4 Lec 24
         * 1. Create a double variable w/ the value 20
         * 2. Create a second variable of type double w/ the value 80
         * 3. Add both numbers up & multiply by 25
         * 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
         * 5. Write an "if" statement that displays a message "Total was over the limit"
         * If the remaining total (#4) is equal to 20 or less
         */
        double myDbl1Sec4Lec24 = 20;
        double myDbl2Sec4Lec24 = 80;
        double myDblTotal = (myDbl1Sec4Lec24 + myDbl2Sec4Lec24) * 25; //operator precedence
        System.out.println("The sum total is " + myDblTotal);
        double myRemainder = myDblTotal % 40;
        if (myRemainder <=20);        
            System.out.println("Total was over the limit " +myRemainder);
            
    }
}