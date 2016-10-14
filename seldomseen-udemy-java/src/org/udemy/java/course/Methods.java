package org.udemy.java.course;
//Sec 5, Lec 29
public class Methods {
    
    public static void main(String[] args) {
        /* what is a method?
          What is it used for?
          how do you construct?
          way to reduce code duplication
          operators - 
                https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
                https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        from boolean to the last if, all is a method...
        method contains 'main' and everything after
        can pass info, values to a method in form of (parameters arguments)
        arguments = values to be passed
        parameters = data types
        */
       //no longer needed
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        // use in conjunction with calculateScore() method block
        calculateScore(gameOver, score, levelCompleted, bonus);
        
      /* comment if using in calculateScore()
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final scoree was " + finalScore);
        }
        */
     //passing directly in 2nd calculateScore above
        score = 10000;        
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);
    /*
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        */
    }
    /* 
     * new method
     * when defining new method must use: public static void
     * are all keywords
     * void = don't send any value back (return) to the method
     * if want to return data back to the method, don't use void
     * everything between {} is executable statements
     * 
     */
    
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {        
        /* do not need if passing arguments in method directly
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        */
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final scoree was " + finalScore);
            return finalScore; // sends data back to method
            // Challenge - return a negative one
        } /* else {
            return -1; //2 options or
            */
        return -1;
    }
}