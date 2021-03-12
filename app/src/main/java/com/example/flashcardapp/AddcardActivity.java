package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddcardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcard);

        findViewById(R.id.myBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }


        });

        findViewById(R.id.mysave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                // Do something here
                String string1 = ((EditText) findViewById(R.id.editText)).getText().toString();
                String string2 = ((EditText) findViewById(R.id.editText2)).getText().toString();
                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("string1", string1); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("string2", string2); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity
            }
        });

    }

}
