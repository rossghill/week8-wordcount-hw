package com.example.rosshill.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class WordCountActivity extends AppCompatActivity {

    EditText editText;
    Button countButton;
    TextView resultCount;
    Button occurrencesButton;
    TextView occurrencesResult;
    String words;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        countButton = findViewById(R.id.button);
        resultCount = findViewById(R.id.textView4);
        occurrencesButton = findViewById(R.id.button2);
        occurrencesResult = findViewById(R.id.result2);
    }

    public int getCount() {
        String[] wordArray = words.trim().split("\\s+");
        int wordCount = wordArray.length;
        return wordCount;
    }

    public void onCountButtonClicked(View button){
        String edit_text = editText.getText().toString();
        String[] wordArray = edit_text.trim().split("\\s+");
        int wordCount = wordArray.length;
        resultCount.setText(String.valueOf(wordCount));
    }

    public void onOccurrencesButtonClicked(View button2){
        int count = 1;
        HashMap countOfOccurences = new HashMap<String, Integer>();
        String edit_text = editText.getText().toString();
        String[] wordArray = edit_text.trim().split("\\s+");

        for (String word : wordArray) {
            if (word != null) {
            countOfOccurences.put(word, count);}
             else {
                countOfOccurences.put(word, count + 1);
                }
        }
        occurrencesResult.setText(countOfOccurences.toString());
    }
}
