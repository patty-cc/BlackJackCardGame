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


    public Player winner() {
        //set the winner to be the first player
        //loop through all the players, if their hand score is better than
        //... the current winner set them to be winner. (this.scorer.handscore)
        // return winner
        int winningScore = 0;
        Player currentWinner = null;

        for ( Player player: players ) {
            int playerScore = this.scorer.handScore(player.getPlayerHand());
           if( playerScore > winningScore  && playerScore <= 21 ){
               currentWinner = player;
               winningScore = playerScore;
           }
        }
        return currentWinner;
    }




}
