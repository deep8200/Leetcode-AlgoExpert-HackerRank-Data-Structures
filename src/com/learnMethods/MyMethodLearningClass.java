package com.learnMethods;

public class MyMethodLearningClass {


    public static void main(String[] args) {

        String player1 = "Deep", player2 = "Deepa", player3 = "Deepu", player4 = "Deepi";
        int score1 = 1500, score2 = 90, score3 = 400, score4 = 1000;
        MyMethodLearningClass myMethodLearningClass = new MyMethodLearningClass();
        myMethodLearningClass.displayHighScorePosition(player1, myMethodLearningClass.calculateHighScorePosition(score1));
        myMethodLearningClass.displayHighScorePosition(player2, myMethodLearningClass.calculateHighScorePosition(score2));
        myMethodLearningClass.displayHighScorePosition(player3, myMethodLearningClass.calculateHighScorePosition(score3));
        myMethodLearningClass.displayHighScorePosition(player4, myMethodLearningClass.calculateHighScorePosition(score4));

    }

    public void displayHighScorePosition(String playerName, int positionInTable) {
        System.out.println(playerName + "- managed to get into the position : " + positionInTable + " on the high score table");
    }

    public int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        }else if (playerScore >= 100) {
                return 3;
            }

            return 4;
        }

}

