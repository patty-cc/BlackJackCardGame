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
        BlackJackCardScorer scorer = new BlackJackCardScorer();
        blackJack = new BlackJackGameClass( deck, scorer );
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

    @Test
    public void giveWinner() {
        Player player1 = new Player( "Iain" );
        Player player2 = new Player( "Heather" );

        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );
        Card two = new Card(Suit.CLUBS, Value.TWO);
        Card three = new Card(Suit.HEARTS, Value.THREE);
        player1.addCard(two);
        player2.addCard(three);

//        blackJack.dealRound();
        assertEquals( player2, blackJack.winner());
    }

    @Test
    public void playerGoesBustOtherPersonWins() {
        Player player1 = new Player( "Iain" );
        Player player2 = new Player( "Ben" );

        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );

        Card two = new Card(Suit.CLUBS, Value.TWO);
        Card ace = new Card(Suit.CLUBS, Value.ACE);
        Card jack = new Card(Suit.CLUBS, Value.JACK);

        player1.addCard(two);
        player1.addCard(ace);
        player1.addCard(jack);

        player2.addCard(jack);
        player2.addCard(two);

//        blackJack.dealRound();
        assertEquals( player2, blackJack.winner());
    }

    @Test
    public void checkIfGameCanBeDrawn() {
        Player player1 = new Player("Iain:");
        Player player2 = new Player( "Ben" );

        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );

        Card king = new Card(Suit.CLUBS, Value.KING);
        Card ten = new Card(Suit.CLUBS, Value.TEN);

        player1.addCard( king );
        player1.addCard( ten );
        player2.addCard( king );
        player2.addCard( ten );

        assertEquals( "Game is a tie", blackJack.gameIsDraw() );
    }





}
