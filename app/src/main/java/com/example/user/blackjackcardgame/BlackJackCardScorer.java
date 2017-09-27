package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackCardScorer {


    public int handScore(ArrayList<Card> cardsToScore) {

        int score = 0;

        for (Card card: cardsToScore){
            score += card.cardNumberValue();
        }

        return score;

    }




}
