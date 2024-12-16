package com.example.employee_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    String getUname,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.login);
        t1=(EditText) findViewById(R.id.uname);
        t2=(EditText) findViewById(R.id.pass);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=t1.getText().toString();
                getPass=t2.getText().toString();
                if((getUname.equals("admin"))&& (getPass.equals("12345")))
                {
                    Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_LONG).show();
                    Intent o=new Intent(getApplicationContext(), menu.class);
                    startActivity(o);
                }
                else{
                    Toast.makeText(getApplicationContext(),"INVALID USER NAME OR PASSWORD",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}