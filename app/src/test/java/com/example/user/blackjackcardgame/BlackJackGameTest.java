package com.example.user.blackjackcardgame;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
/**
 * Created by user on 25/09/2017.
 */

public class BlackJackGameTest {

    BlackJackGameClass blackJack;
    Player player;
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        deck.makeDeck();
        blackJack = new BlackJackGameClass( deck );
    }

    @Test
    public void testGameHasDealtCard() {
        Player player1 = new Player( "Iain" );
        Player player2 = new Player( "Heather" );

        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );

        blackJack.dealRound();

        assertEquals( 1, player1.getSize());
        assertEquals( 1, player2.getSize());
        assertEquals( 50, deck.getSize());

    }

    @Test
    public void gameDealsInitialSetOfCards() {
        Player player1 = new Player( "Iain" );
        Player player2 = new Player( "Heather" );

        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );

        blackJack.dealFirstRound();

        assertEquals( 48, deck.getSize());
    }
}
