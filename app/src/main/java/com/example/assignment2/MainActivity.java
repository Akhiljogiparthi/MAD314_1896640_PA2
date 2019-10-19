package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView login=(TextView)findViewById(R.id.login);
        final EditText userid=(EditText)findViewById(R.id.userid);

        final EditText password=(EditText)findViewById(R.id.password);
        Button submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("1896640".equals(userid.getText().toString())&&"Password".equals(password.getText().toString()))
                {
                    Intent i=new Intent(MainActivity.this,secondactivity.class);
                    startActivity(i);
                }
            }
        });

    }
}
