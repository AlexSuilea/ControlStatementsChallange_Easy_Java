package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculate(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculate(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Alex", calculateHighScorePosition(1500));
        displayHighScorePosition("Cata", calculateHighScorePosition(900));
        displayHighScorePosition("Ion", calculateHighScorePosition(400));
        displayHighScorePosition("George", calculateHighScorePosition(50));
        displayHighScorePosition("Alina", calculateHighScorePosition(1000));
        displayHighScorePosition("Andreea", calculateHighScorePosition(500));
        displayHighScorePosition("Dana", calculateHighScorePosition(100));

    }

    public static int calculate(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            return score + (levelCompleted * bonus);
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        /*if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500){
            return 2;
        } else if(playerScore >= 100){
            return 3;
        }
        return 4;*/

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
