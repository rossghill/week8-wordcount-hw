package com.example.rosshill.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText editText;
    Button countButton;
    TextView resultCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        countButton = findViewById(R.id.button);
        resultCount = findViewById(R.id.textView4);
    }

    public void onCountButtonClicked(View button){
        String edit_text = editText.getText().toString();
        Log.d(getClass().toString(), "Button clicked:");
    }
}
