//Ankit Amonkar
//3B AP Computer Science
//SoccerTeam Class
package com.company;

public class SoccerTeam {
    private int wins;
    private int loss;
    private int tie;
    public static int scoreOfTeam = 0;
    public static int numGames = 0;

    public SoccerTeam(){
        wins = 0;
        loss = 0;
        tie = 0;
    }
    public void played(SoccerTeam other,  int  myScore, int otherScore){
        if(myScore>otherScore){
            this.wins++;
            other.loss++;
            scoreOfTeam = scoreOfTeam + 3;
        }
        else if(myScore == otherScore){
            this.tie++;
            other.tie++;
            scoreOfTeam = scoreOfTeam + 2;
        }
        else{
            this.loss++;
            other.wins++;
            scoreOfTeam = scoreOfTeam + 3;
            }
        numGames++;
    }
    public int numberPts(){
        int score = wins*3 + tie;
        return score;
    }
    public int reset(){
        int score = 0;
        wins = 0;
        tie = 0;
        loss = 0;
        return score;
    }
    public static int getScoreOfTeam(){
        return scoreOfTeam;
    }
    public static int getNumGames(){
        return numGames;
    }
    public static void startTournament(){
        numGames = 0;
        scoreOfTeam = 0;
    }
}
