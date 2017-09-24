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

}
