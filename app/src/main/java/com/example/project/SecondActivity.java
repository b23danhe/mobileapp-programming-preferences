package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    private EditText textInput;
    private Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        saveButton = findViewById(R.id.saveButton);
        textInput = findViewById(R.id.inputView);

        myPreferenceRef = getSharedPreferences("prefText", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPreferenceEditor.putString("MyAppPreferenceString", textInput.getText().toString());
                myPreferenceEditor.apply();
            }
        });

    }


}