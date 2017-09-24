package com.example.user.blackjackcardgame;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/09/2017.
 */

public class CardTest {

    Card card;


    @Test
    public void testCardHasSuit() {
        card = new Card( Suit.CLUBS, Value.JACK);
        assertEquals( Suit.CLUBS, card.getSuit());
    }


    @Test
    public void testCardHasValue() {
        card = new Card( Suit.DIAMONDS, Value.FIVE);
        assertEquals( Value.FIVE, card.getValue());
    }


    @Test
    public void testCardValue() {
        card = new Card( Suit.HEARTS, Value.ACE );
        assertEquals( 11, Value.ACE.getCardValue());
    }

}
