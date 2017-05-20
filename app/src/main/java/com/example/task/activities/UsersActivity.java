package com.example.task.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.example.task.R;

public class UsersActivity extends AppCompatActivity implements OnClickListener{

    private TextView textViewName;
    private AppCompatButton ButtonLinkLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        ButtonLinkLogin = (AppCompatButton) findViewById(R.id.ButtonLinkLogin);
        ButtonLinkLogin.setOnClickListener(this);

        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText(nameFromIntent);
    }
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }
