package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackCardScorer {


    public int handScore(ArrayList<Card> cardsToScore) {
        //set new variable score to zero
        //loop over the cardToScore and add their value to the score
        //return the score value
        int score = 0;

        for (Card card: cardsToScore){
            score += card.cardNumberValue();
        }

        return score;

    }




}
