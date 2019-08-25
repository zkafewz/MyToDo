package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(LoginActivity.this,"Welcome to My ToDo Application",Toast.LENGTH_SHORT);
        t.show();
    }
}
