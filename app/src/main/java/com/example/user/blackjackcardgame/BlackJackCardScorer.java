package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackCardScorer {


    public int handScore(ArrayList<Card> cardsToScore) {
        //set new variable score to zero
        int score = 0;
        //loop over the cardToScore and add their value to the score
        for (Card card: cardsToScore){
            score += card.cardValue();
        }
        //return the score value
        return score;

    }
}
