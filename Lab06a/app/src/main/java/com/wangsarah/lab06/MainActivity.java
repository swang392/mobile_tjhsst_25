package com.wangsarah.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView viewDice;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewDice = findViewById(R.id.diceImage);
        viewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }

        });
    }
    private void rollDice(){
        int randNum = rand.nextInt(6)+1;
        switch(randNum)
        {
            case 1:
                viewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                viewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                viewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                viewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                viewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                viewDice.setImageResource(R.drawable.dice6);
                break;
        }


    }
}
