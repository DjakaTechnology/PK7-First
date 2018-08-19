package com.example.root.djakaxiirpl24;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    public void Login(View v){
        if(username.getEditText().getText().toString().equals("") || password.getEditText().getText().toString().equals("")) {
            new AlertDialog.Builder(this, R.style.Theme_MaterialComponents_Dialog_Alert).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).setTitle("Please input username and password").setMessage("You must insert your username and password").show();
            return;
        }


        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("USER", username.getEditText().getText().toString());
        startActivity(i);
    }

}
