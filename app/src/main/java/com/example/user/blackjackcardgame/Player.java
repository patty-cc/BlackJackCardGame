package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 22/09/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> playerHand;

    public Player( String name ) {
        this.name = name;
        this.playerHand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return playerHand.size();
    }

    public void addCard( Card card) {
        playerHand.add(card);
    }

}
