package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text1 = (EditText) findViewById(R.id.txt1);
        EditText text2 = (EditText) findViewById(R.id.txt2);
        EditText text3 = (EditText) findViewById(R.id.txt3);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text1.getText().toString()+" tenhimiin "
                        +text2.getText().toString()+" id kodtoi "+text3.getText().toString()+" gedeg suragch"
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}