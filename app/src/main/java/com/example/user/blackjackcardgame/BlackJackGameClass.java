package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackGameClass extends Game {

    public BlackJackGameClass( Deck deck) {
        super( deck );
    }

    public void dealFirstRound(){
        dealRound();
        dealRound();
    }

    public void dealRound() {
        for (Player player: players) {
            Card card = deck.deal();
            player.addCard( card );
        }
    }

}
