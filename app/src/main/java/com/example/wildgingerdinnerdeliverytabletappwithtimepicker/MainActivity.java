package com.example.wildgingerdinnerdeliverytabletappwithtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView delivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        delivery = (TextView) findViewById(R.id.txtDelivery);
        Button button = (Button) findViewById(R.id.btnDate);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
        }
    }};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
