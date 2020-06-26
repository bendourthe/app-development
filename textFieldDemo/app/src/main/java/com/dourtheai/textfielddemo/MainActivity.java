package com.dourtheai.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view){
        EditText textUsername = (EditText) findViewById(R.id.textUsername);
        EditText textPassword = (EditText) findViewById(R.id.textPassword);

        Toast.makeText(MainActivity.this, "Hi " + textUsername.getText().toString(), Toast.LENGTH_LONG).show();

        Log.i("Username", textUsername.getText().toString());
        Log.i("Password", textPassword.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
