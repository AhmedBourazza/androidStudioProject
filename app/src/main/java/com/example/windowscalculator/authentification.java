package com.example.windowscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class authentification extends AppCompatActivity {
    EditText emailEditText,passwordEditText ;
    Button loginBtn ;
    TextView messageView;
    ImageButton register,plus;
    boolean hidden=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        loginBtn =findViewById(R.id.btnLogin);
        emailEditText=findViewById(R.id.emailEditView);
        passwordEditText =findViewById(R.id.passwordEditView);
        messageView = findViewById(R.id.messageView);
        messageView.setVisibility(View.GONE);
        register=findViewById(R.id.register);
        plus=findViewById(R.id.plus);
        Intent intent =new Intent(this,MainActivity.class);



        DbHandler db=new DbHandler(this);

        boolean b= db.addUser();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            User u =new User();
            u.email=emailEditText.getText().toString();
            u.password=passwordEditText.getText().toString();
                ArrayList<Boolean> testers = db.loginTest(u);
                if(testers.get(0))
                {
                    messageView.setVisibility(View.GONE);

                    Toast.makeText(authentification.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    startActivity(intent);

                }
                else {
                    messageView.setVisibility(View.VISIBLE);
                }

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!hidden)
                {
                    register.setVisibility(View.VISIBLE);
                    hidden=!hidden;
                }
                else {
                    register.setVisibility(View.GONE);
                    hidden=!hidden;
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}