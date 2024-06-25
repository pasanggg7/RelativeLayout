package com.example.relativelayout;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;

    Button submitBtn;
    Spinner genderSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailInput=findViewById(R.id.email_input);
        passwordInput=findViewById(R.id.password_input);
        submitBtn=findViewById(R.id.submit_btn);
        genderSpinner=findViewById(R.id.gender_spinner);

        submitBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String email_input=String.valueOf(emailInput.getText());
                String password_input=String.valueOf(passwordInput.getText());
                Toast.makeText(MainActivity.this, "Email:"+email_input + "\n" + "Password:" + password_input, Toast.LENGTH_SHORT).show();
            }
        });



    }
}