package com.example.user.blackjackcardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BlackJackGameActivity extends AppCompatActivity {

    TextView playerOneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_black_jack_game );

        playerOneText = ( TextView ) findViewById( R.id.player_one_name_text );

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerOneName = extras.getString( "playerOneName" );

        playerOneText.setText( playerOneName );
    }
}
