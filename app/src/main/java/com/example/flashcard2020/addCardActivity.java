package com.example.flashcard2020;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class addCardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        findViewById(R.id.cancelCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            Intent intent = new Intent(addCardActivity.this, MainActivity.class);
//            addCardActivity.this.startActivity(intent);
                finish();
            }
        });
        findViewById(R.id.saveBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String somestring =((EditText)findViewById(R.id.newQuestion)).getText().toString();
                String anotherstring = ((EditText)findViewById(R.id.newAnswer)).getText().toString();
                Intent data = new Intent();
//                data.putExtra("string1", somestring);
//                data.putExtra("string2", anotherstring);
                data.putExtra("question", somestring);
                data.putExtra("answer", anotherstring);
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}