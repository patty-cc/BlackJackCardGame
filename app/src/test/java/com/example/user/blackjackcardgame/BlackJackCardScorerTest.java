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

    @Test
    public void fiveIsFivePoints() {
        Card card = new Card( Suit.CLUBS, Value.FIVE);
        cardsToScore.add(card);
        assertEquals( 5 , scorer.handScore(cardsToScore));
    }

    @Test
    public void isCombinedScoreOfMultipleCards() {
        Card card1 = new Card( Suit.CLUBS, Value.THREE);
        Card card2 = new Card( Suit.CLUBS, Value.FIVE);
        cardsToScore.add(card1);
        cardsToScore.add(card2);
        assertEquals( 8 , scorer.handScore(cardsToScore));
    }

    @Test
    public void considersFaceCardsAsTen() {
        Card card1 = new Card( Suit.CLUBS, Value.KING);
        cardsToScore.add(card1);
        assertEquals( 10 , scorer.handScore(cardsToScore));
    }

    @Test
    public void considersJackCardsAsTen() {
        Card card1 = new Card( Suit.CLUBS, Value.JACK);
        cardsToScore.add(card1);
        assertEquals( 10 , scorer.handScore(cardsToScore));
    }

    @Test
    public void considersAceAs11() {
        Card card1 = new Card( Suit.CLUBS, Value.ACE);
        cardsToScore.add(card1);
        assertEquals( 11 , scorer.handScore(cardsToScore));
    }

    @Test
    public void scoresABlackJack() {
        Card card1 = new Card( Suit.CLUBS, Value.ACE);
        Card card2 = new Card( Suit.CLUBS, Value.KING);

        cardsToScore.add(card1);
        cardsToScore.add(card2);

        assertEquals( 21 , scorer.handScore(cardsToScore));
    }



}
