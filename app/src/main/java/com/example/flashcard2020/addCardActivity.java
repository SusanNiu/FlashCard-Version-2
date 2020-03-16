package com.example.flashcard2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class addCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancelCard).setOnClickListener(new View.OnClickListener() {
        @Override
    public void onClick(View v) {
        Intent intent = new Intent(addCardActivity.this, MainActivity.class);
        addCardActivity.this.startActivity(intent);
    }
});
        }
        }
