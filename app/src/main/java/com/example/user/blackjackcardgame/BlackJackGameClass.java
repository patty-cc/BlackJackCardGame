package com.example.user.blackjackcardgame;

import java.util.ArrayList;

/**
 * Created by user on 25/09/2017.
 */

public class BlackJackGameClass extends Game {

    BlackJackCardScorer scorer;


    public BlackJackGameClass(Deck deck, BlackJackCardScorer scorer) {
        super(deck);
        this.scorer = scorer;
    }


    public void dealFirstRound() {
        dealRound();
        dealRound();
    }


    public void dealRound() {
        for (Player player : players) {
            Card card = deck.deal();
            player.addCard(card);
        }
    }

    public void dealCard(Player player) {

        int playerScore = this.scorer.handScore(player.getPlayerHand());
        if ( playerScore < 21 ) {
            Card card = deck.deal();
            player.addCard(card);
        }
    }


    public String winner() {

        int winningScore = 0;
        Player currentWinner = null;

        for (Player player : players) {

            int playerScore = this.scorer.handScore(player.getPlayerHand());

            if (playerScore > winningScore && playerScore <= 21) {
                currentWinner = player;
                winningScore = playerScore;

            } else if ((playerScore == winningScore) && (player != currentWinner)) {
                return "Game is a tie";

            } else if (playerScore > 21) {
                return "You're Bust";
            }
        }

        return currentWinner.getName() + " is the winner";
    }

    public String playerWinsWithBlackJack() {
        for (Player player : players) {
            if (playerHasBlackJack(player)) {
                return player.getName() + " has BlackJack you win";
            }
        }
        return "";
    }



    public boolean playerHasBlackJack(Player player) {

        Boolean playerHasAce = false;
        Boolean playerHasCardOfValueTen = false;

        for (Card card: player.getPlayerHand()) {
            if (card.getCardValue() == Value.ACE) {
                playerHasAce =  true;
            }
            if (card.cardNumberValue() == 10) {
                playerHasCardOfValueTen = true;
            }
        }
        if (playerHasAce.equals(true) && playerHasCardOfValueTen.equals(true)){
            return true;
        } else {
            return false;
        }
    }
}