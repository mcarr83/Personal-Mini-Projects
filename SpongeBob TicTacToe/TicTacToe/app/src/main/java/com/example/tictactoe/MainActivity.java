package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    //boolean isPlayerOne = true;
    //using to keep track of where the player has gone. 1 will be player one,
    //2 will be player two, -1 is unused space.
    int [] gameState = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
    int player = 1;
    String pat = "Patrick";
    String bob = "Sponge Bob";
    boolean winner = false;

    public void dropIn(View view){
        String playerStr = player == 1 ? bob : pat;
        ImageView counter = (ImageView) view;
        //Log.i("Tag: ", counter.getTag().toString());
        int tag = Integer.parseInt(counter.getTag().toString());
        //makes sure the game space is able to go to
        if (gameState[tag] == -1){
            //puts the right player in the right spot and does a little animation.
            if (player == 1){
                gameState[tag] = 1;
                counter.setTranslationY(-1500);
                counter.setImageResource(R.drawable.sponge);
                counter.animate().translationYBy(1500).setDuration(300);
                checkGame();
                Log.i("Winner: ", String.valueOf(winner));
                player = 2;

            }else{
                gameState[tag] = 2;
                counter.setTranslationY(-1500);
                counter.setImageResource(R.drawable.pat);
                counter.animate().translationYBy(1500).setDuration(300);
                checkGame();
                Log.i("Winner: ", String.valueOf(winner));
                player = 1;
            }
        }  else
            Toast.makeText(this, "Try again "+playerStr, Toast.LENGTH_SHORT).show();
    }

    public void Tie(){
        //If there is no more valid spaces set the button to visible and restart the match
        Button playAgain = (Button)findViewById(R.id.button);
        Toast.makeText(this, "Tie Game!", Toast.LENGTH_SHORT).show();
        playAgain.setVisibility(View.VISIBLE);
    }

    public boolean validSpaces(){
        //checks to see if there are any valid spaces to move to
        for (int i = 0; i < gameState.length; i++) {
            if (gameState[i] == -1) {
                return true;
            }
        }
        Tie();
        return false;
    }

    public void checkGame(){
        //Checks to see if anyone has won
        if (gameState[0] == player && gameState[1] == player && gameState[2] == player){
            winner = true;
            celebrate();
        }else if(gameState[3] == player && gameState[4] == player && gameState[5] == player){
            winner = true;
            celebrate();
        }else if(gameState[6] == player && gameState[7] == player && gameState[8] == player){
            winner = true;
            celebrate();
        }else if(gameState[0] == player && gameState[3] == player && gameState[6] == player){
            winner = true;
            celebrate();
        }else if(gameState[1] == player && gameState[4] == player && gameState[7] == player){
            winner = true;
            celebrate();
        }else if(gameState[2] == player && gameState[5] == player && gameState[8] == player){
            winner = true;
            celebrate();
        }else if(gameState[0] == player && gameState[4] == player && gameState[8] == player){
            winner = true;
            celebrate();
        }else if(gameState[2] == player && gameState[4] == player && gameState[6] == player){
            winner = true;
            celebrate();
        }else {
            boolean val = validSpaces();
            winner = false;
        }
    }

    public void celebrate(){
        //Displays a winners screen.
        String playerStr = player == 1 ? bob : pat;
        if (player == 1){
            ImageView bob = (ImageView)findViewById(R.id.bobcel);
            ImageView back = (ImageView)findViewById(R.id.background);
            Button playAgain = (Button)findViewById(R.id.button);
            //Worst cast ever
            androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.grid);
            back.animate().alpha(0);
            gridLayout.animate().alpha(0);
            bob.animate().alpha(1);
            Toast.makeText(this, playerStr+" wins", Toast.LENGTH_SHORT).show();
            playAgain.setVisibility(View.VISIBLE);
        }else{
            ImageView pat = (ImageView)findViewById(R.id.patcel);
            ImageView back = (ImageView)findViewById(R.id.background);
            Button playAgain = (Button)findViewById(R.id.button);
            //Worst cast ever
            androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.grid);
            gridLayout.animate().alpha(0);
            back.animate().alpha(0);
            pat.animate().alpha(1);
            Toast.makeText(this, playerStr+" wins", Toast.LENGTH_SHORT).show();
            playAgain.setVisibility(View.VISIBLE);
        }

    }

    public void playAgain(View view){
        //A few objects
        ImageView pat = (ImageView)findViewById(R.id.patcel);
        ImageView back = (ImageView)findViewById(R.id.background);
        ImageView bob = (ImageView)findViewById(R.id.bobcel);
        Button playAgain = (Button)findViewById(R.id.button);
        //Reseting all the alpha values for the game to be seen again
        back.animate().alpha(1);
        pat.animate().alpha(0);
        bob.animate().alpha(0);
        playAgain.setVisibility(View.INVISIBLE);
        //Worst casting ever!!!
        androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.grid);
        int count = gridLayout.getChildCount();
        Log.i("Count is: ", String.valueOf(count));
        for (int i = 0; i < gridLayout.getChildCount(); i++){
            ImageView counter = (ImageView) gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }
        gridLayout.animate().alpha(1);
        /*for (int i = 0; i < gameState.length; i++){
            gameState[i] = -1;
        }*/
        //Resetting initial values
        Arrays.fill(gameState, -1);
        player = 1;
        winner = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
