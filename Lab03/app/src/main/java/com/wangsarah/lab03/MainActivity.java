package com.wangsarah.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView greentext;
    TextView bluetext;
    TextView pinktext;
    TextView purpletext;
    SeekBar fontSizeSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greentext = findViewById(R.id.greentext);
        //greentext.setTextScaleX(textSize);

        bluetext = findViewById(R.id.bluetext);
        //bluetext.setTextScaleX(textSize);

        pinktext = findViewById(R.id.pinktext);
        //pinktext.setTextScaleX(textSize);

        purpletext = findViewById(R.id.purpletext);
        //purpletext.setTextScaleX(textSize);

        fontSizeSlider = findViewById(R.id.fontSizeSlider);
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);



        fontSizeSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bluetext.setTextSize(progress);
                greentext.setTextSize(progress);
                pinktext.setTextSize(progress);
                purpletext.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        View.OnClickListener textClick = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                TextView clicked = (TextView) v;
                String stringClicked = clicked.getText().toString();
                int numclicks = sharedPreferences.getInt(stringClicked, 0);

                Context context = getApplicationContext();

                CharSequence text = "You clicked " + stringClicked + " button " + numclicks + " times.";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                int newnumclicks = numclicks+1;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt(stringClicked, newnumclicks);
                editor.commit();
            }
        };

        bluetext.setOnClickListener(textClick);
        greentext.setOnClickListener(textClick);
        pinktext.setOnClickListener(textClick);
        purpletext.setOnClickListener(textClick);
    }

}
