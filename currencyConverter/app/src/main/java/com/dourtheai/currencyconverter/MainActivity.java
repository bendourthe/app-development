package com.dourtheai.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertUSD(View view){
        EditText cadInput = (EditText) findViewById(R.id.cadInput);
        Double cadAmount = Double.parseDouble(cadInput.getText().toString());
        Double convertAmount = cadAmount * 0.75;
        Toast.makeText(MainActivity.this, String.format("%.2f", cadAmount) + " CAD = "
                + String.format("%.2f", convertAmount) + " USD", Toast.LENGTH_LONG).show();
    }
    public void convertEUR(View view){
        EditText cadInput = (EditText) findViewById(R.id.cadInput);
        Double cadAmount = Double.parseDouble(cadInput.getText().toString());
        Double convertAmount = cadAmount * 0.66;
        Toast.makeText(MainActivity.this, String.format("%.2f", cadAmount) + " CAD = "
                + String.format("%.2f", convertAmount) + " EUR", Toast.LENGTH_LONG).show();
    }
    public void convertGDP(View view){
        EditText cadInput = (EditText) findViewById(R.id.cadInput);
        Double cadAmount = Double.parseDouble(cadInput.getText().toString());
        Double convertAmount = cadAmount * 0.57;
        Toast.makeText(MainActivity.this, String.format("%.2f", cadAmount) + " CAD = "
                + String.format("%.2f", convertAmount) + " GDP", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
