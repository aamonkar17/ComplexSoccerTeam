package com.company;

public class SoccerTeam {
    private int wins;
    private int loss;
    private int tie;
    private static int scoreOfTeam = 0;
    private static int numGames = 0;

    public SoccerTeam(){
        wins = 0;
        loss = 0;
        tie = 0;
    }
    public void played(SoccerTeam other,  int  myScore, int otherScore){
        if(myScore>otherScore){
            this.wins++;
            other.loss++;
            scoreOfTeam = scoreOfTeam + 4;
        }
        else if(myScore == otherScore){
            this.tie++;
            other.tie++;
            scoreOfTeam = scoreOfTeam + 2;
        }
        else{
            this.loss++;
            other.wins++;
            scoreOfTeam = scoreOfTeam + 4;
            }
        numGames++;
    }
    public int numberPts(SoccerTeam a){
        int score = wins*3 + tie*1;
        return score;
    }
    public int reset(SoccerTeam a){
        int score = 0;
        return score;
    }
    private static void startTournament(){
        numGames = 0;
        scoreOfTeam = 0;
    }
}
