package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView)findViewById(R.id.image_eightBall);
        Button myButton = (Button)findViewById(R.id.buttonAsk);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code goes here:

                Random myRandomNumber = new Random();
                int myNumber = myRandomNumber.nextInt(5);
                //Toast.makeText(MainActivity.this, "My Number is: " + myNumber, Toast.LENGTH_SHORT).show();
                ballDisplay.setImageResource(ballArray[myNumber]);
            }
        });

    }
}
