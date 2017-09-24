package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 24/09/2017.
 */

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game( Deck Deck, ArrayList<Player> players ) {
        this.deck = deck;
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
