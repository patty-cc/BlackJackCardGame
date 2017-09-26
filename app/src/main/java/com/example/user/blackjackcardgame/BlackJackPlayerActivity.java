package com.example.user.blackjackcardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BlackJackPlayerActivity extends AppCompatActivity {

    Button startGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack_player);

        startGameButton = (Button) findViewById(R.id.start_game_button);
    }

    public void onStartGameButtonClicked(View Button) {
        Intent intent = new Intent(this, BlackJackGameActivity.class);
        startActivity( intent );
    }
}
