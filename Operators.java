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
        if (topScore > secondTopScore && topScore < 100) // && - and
            System.out.println("Greater than second top score & less than 100");
    }
}