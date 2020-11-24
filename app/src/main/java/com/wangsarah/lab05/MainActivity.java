package com.wangsarah.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView onCreate, onStart, onResume, onPause, onStop, onRestart, onDestroy;
    TextView onCreate0, onStart0, onResume0, onPause0, onStop0, onRestart0, onDestroy0;
    TextView onCreate1, onStart1, onResume1, onPause1, onStop1, onRestart1, onDestroy1;
    Button button, button2;

    Counter counter = new Counter();
    Counter allCounter = new Counter();
//    final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
//    SharedPreferences.Editor editor = sharedPreferences.edit();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreate0=findViewById(R.id.onCreate0);
        onStart0=findViewById(R.id.onStart0);
        onResume0=findViewById(R.id.onResume0);
        onPause0=findViewById(R.id.onPause0);
        onStop0=findViewById(R.id.onStop0);
        onRestart0=findViewById(R.id.onRestart0);
        onDestroy0=findViewById(R.id.onDestroy0);

        onCreate1=findViewById(R.id.onCreate1);
        onStart1=findViewById(R.id.onStart1);
        onResume1=findViewById(R.id.onResume1);
        onPause1=findViewById(R.id.onPause1);
        onStop1=findViewById(R.id.onStop1);
        onRestart1=findViewById(R.id.onRestart1);
        onDestroy1=findViewById(R.id.onDestroy1);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);


        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("OnCreate0", 0);
        int temp2 = sharedPreferences.getInt("OnCreate1",0);
        int a = temp+1;
        int b = temp2+1;
        onCreate0.setText(a+"");
        onCreate1.setText(b+"");

        temp = sharedPreferences.getInt("onStart0", 0);
        temp2 = sharedPreferences.getInt("onStart1",0);
        onStart0.setText(temp+"");
        onStart1.setText(temp2+"");

        temp = sharedPreferences.getInt("onResume0", 0);
        temp2 = sharedPreferences.getInt("onResume1",0);
        onResume0.setText(temp+"");
        onResume1.setText(temp2+"");

        temp = sharedPreferences.getInt("onPause0", 0);
        temp2 = sharedPreferences.getInt("onPause1",0);
        onPause0.setText(temp+"");
        onPause1.setText(temp2+"");

        temp = sharedPreferences.getInt("onStop0", 0);
        temp2 = sharedPreferences.getInt("onStop1",0);
        onStop0.setText(temp+"");
        onStop1.setText(temp2+"");

        temp = sharedPreferences.getInt("onRestart0", 0);
        temp2 = sharedPreferences.getInt("onRestart1",0);
        onRestart0.setText(temp+"");
        onRestart1.setText(temp2+"");

        temp = sharedPreferences.getInt("onDestroy0", 0);
        temp2 = sharedPreferences.getInt("onDestroy1",0);
        onDestroy0.setText(temp+"");
        onDestroy1.setText(temp2+"");

        editor.putInt("OnCreate", a);
        editor.putInt("OnCreate1",b);
        editor.commit();
    }
    protected void onStart() {
        super.onStart();
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("onStart0", 0);
        int temp2 = sharedPreferences.getInt("onStart1",0);
        int a = temp+1;
        int b = temp2+1;
        onStart0.setText(a+"");
        onStart1.setText(b+"");

        editor.putInt("onStart0", a);
        editor.putInt("onStart1",b);
        editor.commit();
    }
    protected void onResume() {

        super.onResume();
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("onResume0", 0);
        int temp2 = sharedPreferences.getInt("onResume1",0);
        int a = temp+1;
        int b = temp2+1;
        onResume0.setText(a+"");
        onResume1.setText(b+"");


        editor.putInt("onResume0", a);
        editor.putInt("onResume1",b);
        editor.commit();
    }
    protected void onPause() {
        super.onPause();
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("onPause0", 0);
        int temp2 = sharedPreferences.getInt("onPause1",0);
        int a = temp+1;
        int b = temp2+1;
        onPause0.setText(a+"");
        onPause1.setText(b+"");

        editor.putInt("onPause0", a);
        editor.putInt("onPause1",b);
        editor.commit();
    }
    protected void onStop() {
        super.onStop();
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("onStop0", 0);
        int temp2 = sharedPreferences.getInt("onStop1",0);
        int a = temp+1;
        int b = temp2+1;
        onStop0.setText(a+"");
        onStop1.setText(b+"");

        editor.putInt("onStop0", a);
        editor.putInt("onStop1",b);
        editor.commit();
    }
    protected void onRestart() {
        super.onRestart();
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("onRestart0", 0);
        int temp2 = sharedPreferences.getInt("onRestart1",0);
        int a = temp+1;
        int b = temp2+1;
        onRestart0.setText(a+"");
        onRestart1.setText(b+"");

        editor.putInt("onRestart0", a);
        editor.putInt("onRestart1",b);
        editor.commit();

        onCreate0.setText("0");
        onStart0.setText("0");
        onResume0.setText("0");
        onPause0.setText("0");
        onStop0.setText("0");
        onRestart0.setText("0");
        onDestroy0.setText("0");

        editor.putInt("onCreate0", 0);
        editor.putInt("onStart0", 0);
        editor.putInt("onResume0", 0);
        editor.putInt("onPause0", 0);
        editor.putInt("onStop0", 0);
        editor.putInt("onRestart0", 0);
        editor.putInt("onDestroy0", 0);
    }

    protected void onDestroy() {
        super.onDestroy();
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int temp = sharedPreferences.getInt("onDestroy0", 0);
        int temp2 = sharedPreferences.getInt("onDestroy1",0);
        int a = temp+1;
        int b = temp2+1;
        onDestroy0.setText(a+"");
        onDestroy1.setText(b+"");

        editor.putInt("onDestroy0", a);
        editor.putInt("onDestroy1",b);
        editor.commit();
    }

    public void clearCol2(View view) {
        onCreate1.setText("0");
        onStart1.setText("0");
        onResume1.setText("0");
        onPause1.setText("0");
        onStop1.setText("0");
        onRestart1.setText("0");
        onDestroy1.setText("0");
    }

    public void clearCol1(View view) {
        onCreate0.setText("0");
        onStart0.setText("0");
        onResume0.setText("0");
        onPause0.setText("0");
        onStop0.setText("0");
        onRestart0.setText("0");
        onDestroy0.setText("0");
    }
}
class Counter{
    public int onCreate;
    public int onStart;
    public int onResume;
    public int onPause;
    public int onStop;
    public int onRestart;
    public int onDestroy;

    public int getOnCreate()
    {
        return onCreate;
    }

    public int getOnStart() {
        return onStart;
    }

    public int getOnResume() {
        return onResume;
    }

    public int getOnPause() {
        return onPause;
    }

    public int getOnStop() {
        return onStop;
    }

    public int getOnRestart() {
        return onRestart;
    }

    public int getOnDestroy() {
        return onDestroy;
    }

    public void setOnCreate(int onCreate) {
        this.onCreate = onCreate;
    }

    public void setOnStart(int onStart) {
        this.onStart = onStart;
    }

    public void setOnPause(int onPause) {
        this.onPause = onPause;
    }

    public void setOnDestroy(int onDestroy) {
        this.onDestroy = onDestroy;
    }

    public void setOnRestart(int onRestart) {
        this.onRestart = onRestart;
    }

    public void setOnResume(int onResume) {
        this.onResume = onResume;
    }

    public void setOnStop(int onStop) {
        this.onStop = onStop;
    }

}