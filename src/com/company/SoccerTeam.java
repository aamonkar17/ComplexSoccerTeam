package com.company;

public class SoccerTeam {
    int wins;
    int loss;
    int tie;
    public SoccerTeam(w, l, t){
        wins = w;
        loss = l;
        tie = t;
    }
    public void played(SoccerTeam other,  int  myScore, int otherScore){
        if(myScore>otherScore){
            this.wins++;
            other.loss++;
        }
        else if(myScore == otherScore){
            this.tie++;
            other.tie++;
        }
        else{
            this.loss++;
            other.wins++;
            }
    }
    public int numberPts(SoccerTeam a){
        int score = wins*3 + tie*1;
        return score;
    }
    public int reset(SoccerTeam a){
        int score = 0;
        return score;
    }
}
