package org.udemy.java.course;
//Sec 5, Lec 30 Pt 1
public class Methods2 {
        public static void main(String[] args) {

		boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);        
		
	}
        
		public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } 
        return -1;
    }
}