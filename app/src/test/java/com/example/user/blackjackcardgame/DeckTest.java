package com.example.user.blackjackcardgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/09/2017.
 */

public class DeckTest {

    Deck cardDeck;


    @Before
    public void before() {
        cardDeck = new Deck();
    }


    @Test
    public void checkCardDeckIsEmpty() {
        assertEquals( 0, cardDeck.getSize());
    }


    @Test
    public void checkCardDeckOnceMade() {
        cardDeck.makeDeck();
        assertEquals( 52, cardDeck.getSize());
    }

    @Test
    public void removesCardWhenDealt() {
        cardDeck.makeDeck();
        cardDeck.deal();
        cardDeck.deal();
        assertEquals( 50, cardDeck.getSize());
    }

    @Test
    public void givesTopCardWhenDelt() {
        cardDeck.makeDeck();
        Card card = cardDeck.deal();
        Card card2 = cardDeck.deal();
        assertEquals( Value.ACE, card.getValue());
        assertEquals( Value.TWO, card2.getValue());

    }




}
