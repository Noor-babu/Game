package com.example.game;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7;
    private Button button,  button2, button3, button4, button5, button6, button7;
    private CountDownTimer countDownTimer;
    private TextView timer;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        timer = findViewById(R.id.timer);


        countDownTimer = new CountDownTimer(20000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(count ==5){
                    onFinish();
                }
                timer.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                countDownTimer.cancel();
                timer.setText("0");
            showDialog();
            }
        };

        countDownTimer.start();

//        Please prese contral + spease of OnClickListener

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setBackgroundColor(Color.GREEN);
                imageView.setVisibility(View.GONE);
                count++;


            }


        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setBackgroundColor(Color.YELLOW);
                imageView2.setVisibility(View.GONE);
                count++;
            }
        });


        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setBackgroundColor(Color.RED);
                imageView3.setVisibility(View.GONE);
                count++;
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setBackgroundColor(Color.BLUE);
                imageView4.setVisibility(View.GONE);
                count++;
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setBackgroundColor(Color.GRAY);
                imageView5.setVisibility(imageView.GONE);
                count++;
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setBackgroundColor(Color.WHITE);
                imageView6.setVisibility(View.GONE);
                count++;
            }
        });

    }
    private void showDialog(){
        new AlertDialog.Builder(this).setTitle(" Game is over ")
                .setMessage(""+count).show();
    }



}
