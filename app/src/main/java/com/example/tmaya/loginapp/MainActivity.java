package com.example.tmaya.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextUserName,editTextPassword;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUserName=findViewById(R.id.editTextuserId);
        editTextPassword=findViewById(R.id.editTextPassword);
        buttonLogin=findViewById(R.id.btnlogin);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=editTextUserName.getText().toString();
                String userpassword=editTextPassword.getText().toString();

                if (username.equals("Demo")&&userpassword.equals("demo123")){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Invalid Combo", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
