package com.example.flashcard2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancelCard).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            finish();
            }
        });
        findViewById(R.id.saveBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String somestring =((EditText)findViewById(R.id.newQuestion)).getText().toString();
                String anotherstring = ((EditText)findViewById(R.id.newAnswer)).getText().toString();
                Intent data = new Intent();
                data.putExtra("question", somestring);
                data.putExtra("answer", anotherstring);
                setResult(RESULT_OK, data);
                finish();

            }
        });

    }
}
