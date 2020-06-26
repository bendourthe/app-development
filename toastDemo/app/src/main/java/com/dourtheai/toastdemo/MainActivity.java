package com.dourtheai.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText editName = (EditText) findViewById(R.id.editName);

        Toast.makeText(MainActivity.this, "Hi there, " + editName.getText().toString()
                + ", you look particularly gorgeous today! :)", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
