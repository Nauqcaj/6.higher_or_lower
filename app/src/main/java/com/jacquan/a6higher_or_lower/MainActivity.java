package com.jacquan.a6higher_or_lower;

import java.util.Random;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void checkGuess(View view) {

        EditText guessedNumber = (EditText) findViewById(R.id.numberGuessed);

        String guessedNummberString = guessedNumber.getText().toString();

        int guessedNumberInt = Integer.parseInt(guessedNummberString);

        String message;

        if (guessedNumberInt > randomNumber) {
            message = "Too high!";

        } else if (guessedNumberInt < randomNumber) {
            message = "Too low!";

        } else {
            message = "Correct!";
        }

            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

        System.out.println(guessedNumberInt);
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }
}
