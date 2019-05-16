package com.example.mvpmessageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainMVP.view{
    Button btnToast;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        btnToast = findViewById(R.id.toastClick);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              presenter.clickedToastButton();
            }
        });

    }

    @Override
    public void displayToastMessage() {
        Toast.makeText(this, "You clicked me", Toast.LENGTH_SHORT).show();

    }
}
