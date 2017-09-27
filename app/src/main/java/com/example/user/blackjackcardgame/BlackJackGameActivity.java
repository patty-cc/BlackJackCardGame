package com.example.user.blackjackcardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BlackJackGameActivity extends AppCompatActivity {

    TextView playerOneText;
    TextView playerTwoText;
    TextView player1card1;
    TextView player1card2;
    TextView player2card1;
    TextView player2card2;
    TextView winnerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_black_jack_game );

        playerOneText = ( TextView ) findViewById( R.id.player_one_name_text );
        playerTwoText = ( TextView ) findViewById( R.id.player_two_name_text );
        player1card1 = ( TextView ) findViewById( R.id.player1card1);
        player1card2 = ( TextView ) findViewById( R.id.player1card2);
        player2card1 = ( TextView ) findViewById( R.id.player2card1);
        player2card2 = ( TextView ) findViewById( R.id.player2card2);
        winnerText = ( TextView ) findViewById( R.id.game_info_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerOneName = extras.getString( "playerOneName" );
        String playerTwoName = extras.getString( "playerTwoName" );

        Player player1 = new Player( playerOneName );
        Player player2 = new Player( playerTwoName );

        Deck deck = new Deck();
        deck.makeDeck();
        deck.shuffleDeck();

        BlackJackCardScorer scorer = new BlackJackCardScorer();
        BlackJackGameClass blackJack = new BlackJackGameClass( deck, scorer );


        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );

        blackJack.dealFirstRound();

        playerOneText.setText( playerOneName );
        playerTwoText.setText( playerTwoName );

        player1card1.setText(player1.getPlayerHand().get(0).cardOutputName());
        player1card2.setText(player1.getPlayerHand().get(1).cardOutputName());
        player2card1.setText(player2.getPlayerHand().get(0).cardOutputName());
        player2card2.setText(player2.getPlayerHand().get(1).cardOutputName());

        winnerText.setText(blackJack.winner() ) ;
//        .getName() + " " + "is the winner"
    }
}
