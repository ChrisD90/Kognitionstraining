package com.example.christoph.kognitionstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button liga3 = (Button) findViewById(R.id.btn3liga);
        liga3.setOnClickListener(new View.OnClickListener() {
            public void onClick( View v) {
                Intent intent = new Intent(MainActivity.this, Liga3.class);
                startActivity(intent);
            }
        });
//ich bin ein Testkommentar
    }
}
