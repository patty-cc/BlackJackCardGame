package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackGameClass extends Game {
    BlackJackCardScorer scorer;

    public BlackJackGameClass( Deck deck, BlackJackCardScorer scorer) {
        super( deck );
        this.scorer = scorer;
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

    public Player winner(){
        //set the winner to be the first player
        Player currentHighScore = players.get(0);
        //loop through all the players, if their hand score is better than
        for (Player player: players) {
            
        }
        //... the current winner set them to be winner. (this.scorer.handscore)
        // return winner
        return null;
    }

}
