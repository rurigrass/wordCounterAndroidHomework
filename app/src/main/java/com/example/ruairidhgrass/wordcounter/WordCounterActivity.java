package com.example.ruairidhgrass.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText enterText;
    TextView word_Counter;
    Button shakeButton;
    Button letterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        enterText = findViewById(R.id.enter_text);
        word_Counter = findViewById(R.id.word_counter);
        letterButton = findViewById(R.id.letter_button);
        shakeButton = findViewById(R.id.shake_button);
    }

    public void onShakeButtonClick(View button) {
        WordCounter wordCounter = new WordCounter();
        int answer = wordCounter.getWordCount(enterText.getText().toString());
        this.word_Counter.setText(Integer.toString(answer));
    }

    public void onLetterButtonClick(View button) {
        WordCounter wordCounter = new WordCounter();
        int answer = wordCounter.getLetterCount(enterText.getText().toString());
        this.word_Counter.setText(Integer.toString(answer));
    }

}
