package com.example.holiday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {
   private EditText Airport;
   private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Airport=(EditText)findViewById(R.id.airport_name);
        btn=(Button)findViewById(R.id.ret);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this,FlightActivity.class);
                String stringToPassBack = Airport.getText().toString();
                intent.putExtra("keyName", stringToPassBack);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
