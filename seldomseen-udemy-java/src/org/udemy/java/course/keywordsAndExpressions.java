package org.udemy.java.course;
//Expressions & Statements - Sec 5 | Lec 26
//keywords https://en.wikipedia.org/wiki/List_of_Java_keywords

public class keywordsAndExpressions {
    public static void main(String[] args){
        /*expression - building blocks of java programming
        ex: a mile is equal to 1.609344 kilometers
        expression ex: kilometers = (100 * 1.609344); not inclduing the datatype
        contains variables, values, operators
        double is datatype
        */
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression");
            
        /* Challenge: identify the expression from following statements
        write down what parts of code are expressions.
        score = 100 | score > 99 | You got the high score | score = 0
        */
       int score = 100;
       if (score > 99) {
           System.out.println("You got the high score");
           score = 0;
       }
        }
    }
}