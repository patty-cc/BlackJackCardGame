package com.example.user.blackjackcardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardGameActivity extends AppCompatActivity {

    Button playBlackJackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_game);

        playBlackJackButton = (Button) findViewById(R.id.play_blackjack_button);
    }

    public void onPlayBlackJackButtonClicked( View Button) {
        Intent intent = new Intent( this, BlackJackPlayerActivity.class);
        startActivity( intent );
    }
}
