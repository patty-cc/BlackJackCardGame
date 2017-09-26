package com.example.user.blackjackcardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BlackJackPlayerActivity extends AppCompatActivity {

    Button startGameButton;
    EditText playerOneText;
    EditText playerTwoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack_player);

        startGameButton = ( Button ) findViewById(R.id.start_game_button);
        playerOneText = ( EditText ) findViewById(R.id.player_one_name);
        playerTwoText = ( EditText ) findViewById(R.id.player_two_name);
    }

    public void onStartGameButtonClicked(View Button) {
        Intent intent = new Intent(this, BlackJackGameActivity.class);

        String playerOneName = playerOneText.getText().toString();
        intent.putExtra( "playerOneName", playerOneName);
        String playerTwoName = playerTwoText.getText().toString();
        intent.putExtra( "playerTwoName", playerTwoName );
        startActivity( intent );
    }
}
