package com.example.mitchell.my1application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {
    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public String b1s = "start";
    public String b2s = "closet";
    public String b3s = "window";
    public String b4s = "urnnokey";
    //strings that determine what button does what at time
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    public void button1func(View view) {

        TextView text = (TextView) findViewById(R.id.textView);
        //door,closet,window, urn

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        if (b1s.equals("r3door")) {
            if (b2s.equals("rb1")&&b3s.equals("bb1")&&b4s.equals("gb0")){
                text.setText(getString(R.string.r3doorpass));
            }
            else
                text.setText(getString(R.string.r3doorfail));
        }

        if (b1s.equals("hall")) {
            text.setText(getString(R.string.room3));
            //update buttons and strings
            b1.setText("door");
            b2.setText("red");
            b3.setText("blue");
            b4.setText("green");
            b1s ="r3door";
            b2s ="rb0";
            b1s ="bb0";
            b1s ="gb0";
            return;
        }

        if (b1s.equals("doorkey")) {
            text.setText(getString(R.string.doorkey)+ "\n" + getString(R.string.room2));
            //put new buttons here
            b1s = "hall";
            b2s = "window";
            b3s = "button";
            b4s = "painting";
            b1.setText(R.string.r2b1);
            b2.setText(R.string.r2b2);
            b3.setText(R.string.r2b3);
            b4.setText(R.string.r2b4);
            return;
        }
        if (b1s.equals("doornokey")) {
            text.setText(getString(R.string.doornokey));
        }
        if (b1s.equals("start")){
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
            b4.setVisibility(View.VISIBLE);
            b1.setText(getString(R.string.door));
            text.setText(getString(R.string.room1));
            b1s = "doornokey";
            return;
        }
        //door no key
    }

    public void button2func(View view) {

        TextView text = (TextView) findViewById(R.id.textView);
        //door,closet,window, urn

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        if (b2s.equals("rb0")) {
            text.setText(getString(R.string.r3r0));
            b2s="rb1";
            return;
        }
        if (b2s.equals("rb1")) {
            text.setText(getString(R.string.r3r1));
            b2s="rb0";
            return;
        }


        if (b2s.equals("window")) {
            text.setText(getString(R.string.r2window));
        }
        if (b2s.equals("closet")) {
            text.setText(getString(R.string.closetb));
        }

    }

    public void button3func(View view) {

        TextView text = (TextView) findViewById(R.id.textView);
        //door,closet,window, urn

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        if (b3s.equals("bb0")) {
            text.setText(getString(R.string.r3b0));
            b3s="bb1";
            return;
        }
        if (b3s.equals("bb1")) {
            text.setText(getString(R.string.r3b1));
            b3s="bb0";
            return;
        }

        if (b3s.equals("button")) {
            text.setText(getString(R.string.r2button));
        }

        if (b3s.equals("window")) {
            text.setText(getString(R.string.windowb));
        }

    }

    public void button4func(View view) {

        TextView text = (TextView) findViewById(R.id.textView);
        //door,closet,window, urn

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        if (b4s.equals("gb0")) {
            text.setText(getString(R.string.r3g0));
            b4s="gb1";
            return;
        }
        if (b4s.equals("gb1")) {
            text.setText(getString(R.string.r3g1));
            b4s="gb0";
            return;
        }


        if (b4s.equals("painting")) {
            text.setText(getString(R.string.r2painting));
        }


        if (b4s.equals("urnnokey")) {
            text.setText(getString(R.string.urnnokey));
            b4s = "urnkey";
            b1s = "doorkey";
            return;
        }
        if(b4s.equals("urnkey")){
            text.setText(getString(R.string.urnkey));
        }

    }


        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);



        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);







}
