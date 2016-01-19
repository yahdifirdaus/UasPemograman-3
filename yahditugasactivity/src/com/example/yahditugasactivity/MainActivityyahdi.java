package com.example.yahditugasactivity;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivityyahdi extends Activity {
	String pasw ;
    String nama;
    String namaku ="Yahdi";
    String pswd ="Firdaus";
    EditText name;
    EditText pass,tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityyahdi);
        
        name = (EditText)findViewById(R.id.txtuser);
        pass = (EditText)findViewById(R.id.txtpassword);
        Button submit = (Button)findViewById(R.id.btnExit);
        submit.setOnClickListener(new click());
        }
        @SuppressLint("ShowToast")
        class click implements Button.OnClickListener{
        @SuppressLint("ShowToast")
        public void onClick(View v){
        nama = name.getText().toString();
        pasw = pass.getText().toString();
        if((pasw.equals(pswd))&&(nama.equals(namaku))){
               Toast.makeText(getApplicationContext(),"Welcome Login Succes" ,31).show();
               Intent i = new Intent(MainActivityyahdi.this, MainActivity.class);
               startActivity(i);
        }else
               Toast.makeText(getApplicationContext(),"Username and Password failed",23).show();
               name.setText("");
               pass.setText("");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activityyahdi, menu);
        return true;
    }
    
}
