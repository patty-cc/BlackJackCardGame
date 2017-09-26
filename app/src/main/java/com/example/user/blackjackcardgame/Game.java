package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 24/09/2017.
 */

public abstract class Game {

     Deck deck;
     ArrayList<Player> players;


    public Game( Deck deck ) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
    }


    public ArrayList<Player> getPlayers() {
        return players;
    }


    public int getNumberOfPlayers() {
        return players.size();
    }


    public void addPlayer( Player player) {
        players.add( player );
    }


}
