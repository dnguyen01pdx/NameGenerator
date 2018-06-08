package com.example.dnguyen6265.namegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        textView = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //generates string with 6 random symbols
                textView.setText(generateString(10));
            }
        });

    }

    private String generateString(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] charsNum = "1234567890".toCharArray();
        char[] charsSpec = "!@#$%^&*".toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int counter = 0; counter < length/3; counter++) {
            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
            char cNum = charsNum[random.nextInt(charsNum.length)];
            stringBuilder.append(cNum);
            char cSpec = charsSpec[random.nextInt(charsSpec.length)];
            stringBuilder.append(cSpec);
        }
        return stringBuilder.toString();

    }


}
