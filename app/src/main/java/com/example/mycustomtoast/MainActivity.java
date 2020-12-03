package com.example.mycustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.toastify.Toastify;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickView(View view) {
        Toastify toastify = new Toastify
                .Builder(this)
                .setHeader("Warning!!!!")
                .setContent("You should be in private mode")
                .build();

        toastify.show();


    }
}