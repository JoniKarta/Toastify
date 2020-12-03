package com.example.mycustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.toastify.Toastify;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickView(View view) {
        if(view.getId() == R.id.toastify_custom_button){
            Toastify toastify = new Toastify
                    .Builder(this)
                    .setHeader("Warning!!!!")
                    .setContent("You should be in private mode")
                    .setImageResource(R.drawable.warning)
                    .setGravity(Gravity.BOTTOM, 0,0)
                    .setDuration(Toast.LENGTH_SHORT)
                    .build();

            toastify.show();
        }else if(view.getId() == R.id.toastify_err_button){

            Toastify toastify = new Toastify.Builder(this)
                    .setHeader("Error")
                    .setHeaderTextColor(Color.WHITE)
                    .setContentTextColor(Color.WHITE)
                    .setContent("Something went wrong with your application!")
                    .setBackground(R.drawable.toastify_err_background)
                    .setImageResource(R.drawable.error)
                    .setGravity(Gravity.BOTTOM, 10, 10)
                    .setDuration(Toast.LENGTH_LONG)

                    .build();

            toastify.show();
        }



    }
}