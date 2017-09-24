package com.example.user.blackjackcardgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/09/2017.
 */

public class GameTest {

    Game game;
    Deck deck;
    Player player;


    @Test
    public void gameStartsWithNoPlayers() {
        game = new Game( deck );
        assertEquals( 0 , game.getSizeOfArray());
    }

    @Test
    public void canAddPlayerToGame() {
        game = new Game( deck );
        game.addPlayer( new Player( "Iain"));
        game.addPlayer( new Player( "Tommy"));

        assertEquals( 2 , game.getSizeOfArray());
    }

    @Test
    public void canGetPlayerNames() {
        game = new Game( deck );
        game.addPlayer( new Player( "Jay" ));
        game.addPlayer( new Player( "Rick" ));

        assertEquals( "Jay", game.getPlayers().get(0).getName());
        assertEquals( "Rick", game.getPlayers().get(1).getName());
    }



}


