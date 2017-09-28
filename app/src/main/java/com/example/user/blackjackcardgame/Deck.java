package com.example.user.blackjackcardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by user on 22/09/2017.
 */

public class Deck implements Dealing {

    private ArrayList<Card> cardDeck;


    public Deck() {
        this.cardDeck = new ArrayList<Card>();
    }


    public void makeDeck() {
        for (Suit suit: Suit.values()) {
            for ( Value value: Value.values()){
                cardDeck.add( new Card( suit, value ));
            }
        }
    }


    public int getSize() {
        return cardDeck.size();
    }

    public void shuffleDeck() {
        Collections.shuffle( cardDeck );
    }


    public Card deal() {
        return this.cardDeck.remove(0);
    }


}
