package com.example.user.blackjackcardgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackCardScorerTest {
    BlackJackCardScorer scorer;
    ArrayList<Card> cardsToScore;


    @Before
    public void before(){
        scorer = new BlackJackCardScorer();
        cardsToScore = new ArrayList<Card>();
    }

    @Test
    public void threeIsThreePoints(){
        Card card = new Card(Suit.DIAMONDS, Value.THREE);
        cardsToScore.add(card);
        assertEquals(3, scorer.handScore(cardsToScore));
    }
}
