package com.dourtheai.imageswitchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Boolean flag = false;

    public void clickFunction(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        if (flag == false) {
            imageView.setImageResource(R.drawable.puppy2);
            flag = true;
        }
        else {
            imageView.setImageResource(R.drawable.puppy1);
            flag = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
