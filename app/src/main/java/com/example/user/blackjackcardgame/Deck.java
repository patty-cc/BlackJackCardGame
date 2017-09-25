package com.example.user.blackjackcardgame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 22/09/2017.
 */

public class Deck implements Dealing {

    private ArrayList<Card> cardDeck;
    private Random random;


    public Deck() {
        this.cardDeck = new ArrayList<Card>();
        this.random = new Random();
    }


    public void makeDeck() {
        for (Suit suit: Suit.values()) {
            for ( Value value: Value.values()){
                cardDeck.add( new Card( suit, value));
            }
        }
    }


    public int getSize() {
        return cardDeck.size();
    }


    public Card deal() {
        int randomIndex = this.random.nextInt(this.cardDeck.size());
        Card randomCard = this.cardDeck.remove(randomIndex);
        return randomCard;
    }


}
