package com.example.user.blackjackcardgame;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/09/2017.
 */

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;


    @Test
    public void testPlayerName() {
        player = new Player("Iain");
        assertEquals("Iain", player.getName());
    }


    @Test
    public void testPlayerHasEmptyHand() {
        player = new Player("Iain");
        assertEquals( 0, player.getSize());
    }


    @Test
    public void testCanAddCardToPlayerHand() {
        player = new Player("Iain");
        card1 = new Card( Suit.HEARTS, Value.ACE );
        card2 = new Card( Suit.DIAMONDS, Value.FOUR);
        player.addCard( card1 );
        player.addCard( card2 );
        assertEquals( 2, player.getSize() );
    }
    

}
