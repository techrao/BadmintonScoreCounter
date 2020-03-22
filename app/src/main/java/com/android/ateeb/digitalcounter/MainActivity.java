package com.android.ateeb.digitalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button countbtn1;
    TextView countTv1;
    int count1=0;

    Button countbtn2;
    TextView countTv2;
    int count2=0;

    Button resetbtn;

    TextView winTv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countbtn1=findViewById(R.id.countbtn1);
        resetbtn=findViewById(R.id.resetbtn);
        countTv1=findViewById(R.id.count1);

        countbtn2=findViewById(R.id.countbtn2);
        countTv2=findViewById(R.id.count2);

        winTv3=findViewById(R.id.winTv3);


        countbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count1 == 21){
                    winTv3.setText(String.valueOf("Team 1 Wins"));
                }
                else {
                    if (count2 == 21) {
                        Toast.makeText(getApplicationContext(),"Team 2 wins, Please reset",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        count1++;
                        countTv1.setText(String.valueOf(count1));
                    }
                }
            }
        });

        countbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count2 == 21){
                    winTv3.setText(String.valueOf("Team 2 Wins"));
                }
                else {
                    if (count1 == 21) {
                        Toast.makeText(getApplicationContext(),"Team 1 wins, Please reset",Toast.LENGTH_SHORT).show();

                    }
                    else{
                        count2++;
                        countTv2.setText(String.valueOf(count2));
                    }
                }
            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    count1 = 0;
                    count2 = 0;
                    countTv1.setText("0");
                    countTv2.setText("0");

                }
            }
        );
    }
}
