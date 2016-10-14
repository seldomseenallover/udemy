package org.udemy.java.course;

public class MethodOverloadingSec5Lec31 {
    
    public static void main(String[] args) {
        //System.out.println("This is Section 5, Lecture 31, Method Overloading deals with using same Method name, with different parameters");
        //http://www.metric-conversions.org/length/feet-to-centimeters.htm
        //order of logic
        //#2
        //calculateScore("Seldom", 500); //methodName(parameter)
        //#3 [comment out #2 when active]
        int newScore = calculateScore("Seldom", 500); //methodName(parameter)
        System.out.println("New Score is " + newScore);  //returned as result of return
        //#5 [overloaded method]
        calculateScore(75);
        //#7 [overloaded method, no parameters]
        calculateScore();
        
    }
    //order of logic:
    //#1
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000; //sends value back to method
    }
    //order of logic: Section Overloading The Method 'calculateScore'
    //#4
    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " points");
        return score * 1000; //sends value back to method    
    }
    //order of logic: Section Overloading The Method 'calculateScore'
    //#5
    public static int calculateScore() {
        System.out.println("No Player Name, no Player Score");
        return 0; //sends value back to method    
    }
    //Challenge @ 9:40 time name class - calcFeetAndInchesToCentimeters
}