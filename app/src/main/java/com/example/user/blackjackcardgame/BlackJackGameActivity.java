package com.example.user.blackjackcardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BlackJackGameActivity extends AppCompatActivity {

    TextView playerOneText;
    TextView playerTwoText;

    TextView player1card1;
    TextView player1card2;
    TextView player1card3;
    TextView player1card4;

    TextView player2card1;
    TextView player2card2;
    TextView player2card3;
    TextView player2card4;

    TextView winnerText;

    Button player1TwistButton;
    Button player2TwistButton;

    BlackJackGameClass blackJack;
    BlackJackCardScorer scorer;
    Player player1;
    Player player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_black_jack_game );

        playerOneText = ( TextView ) findViewById( R.id.player_one_name_text );
        playerTwoText = ( TextView ) findViewById( R.id.player_two_name_text );

        player1card1 = ( TextView ) findViewById( R.id.player1card1);
        player1card2 = ( TextView ) findViewById( R.id.player1card2);
        player1card3 = ( TextView ) findViewById( R.id.player1card3);
        player1card4 = ( TextView ) findViewById( R.id.player1card4);

        player2card1 = ( TextView ) findViewById( R.id.player2card1);
        player2card2 = ( TextView ) findViewById( R.id.player2card2);
        player2card3 = ( TextView ) findViewById( R.id.player2card3);
        player2card4 = ( TextView ) findViewById( R.id.player2card4);

        winnerText = ( TextView ) findViewById( R.id.game_info_text);

        player1TwistButton = ( Button ) findViewById( R.id.player1_twist_button);
        player2TwistButton = ( Button ) findViewById( R.id.player2_twist_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerOneName = extras.getString( "playerOneName" );
        String playerTwoName = extras.getString( "playerTwoName" );

        player1 = new Player( playerOneName );
        player2 = new Player( playerTwoName );

        Deck deck = new Deck();
        deck.makeDeck();
        deck.shuffleDeck();

        scorer = new BlackJackCardScorer();
        blackJack = new BlackJackGameClass( deck, scorer );


        blackJack.addPlayer( player1 );
        blackJack.addPlayer( player2 );

        blackJack.dealFirstRound();

        playerOneText.setText( playerOneName );
        playerTwoText.setText( playerTwoName );

        player1card1.setText(player1.getPlayerHand().get(0).cardOutputName());
        player1card2.setText(player1.getPlayerHand().get(1).cardOutputName());
        player2card1.setText(player2.getPlayerHand().get(0).cardOutputName());
        player2card2.setText(player2.getPlayerHand().get(1).cardOutputName());

//        winnerText.setText(blackJack.winner() ) ;
//        .getName() + " " + "is the winner"
    }

    public void onPlayer1HitButtonClicked(View view) {
        blackJack.dealCard( player1 );
        player1card3.setText(player1.getPlayerHand().get(2).cardOutputName());

        if( player1.getPlayerHand().size() > 3) {
            player1card4.setText(player1.getPlayerHand().get(3).cardOutputName());
        }

    }

    public void onPlayer2HitButtonClicked(View view) {
        blackJack.dealCard( player2 );
        player2card3.setText(player2.getPlayerHand().get(2).cardOutputName());

        if( player2.getPlayerHand().size() > 3) {
            player2card4.setText(player2.getPlayerHand().get(3).cardOutputName());
        }
    }


}
