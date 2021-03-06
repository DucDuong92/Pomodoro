package com.example.ducduong.pomodoro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;
    private Button btRegister;
    private Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = (EditText)this.findViewById(R.id.et_username);
        etPassword = (EditText)this.findViewById(R.id.et_password);
        btLogin = (Button) this.findViewById(R.id.bt_login);
        btRegister = (Button) this.findViewById(R.id.bt_register);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptLogin();
            }
        });
        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptRegister();
            }
        });
    }

    private void attemptRegister() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if (username.equals("admin") && password.equals("admin")){
            // Notifications
            Toast.makeText(this, "Register success", Toast.LENGTH_SHORT).show();
        }
        if (!username.equals("admin") || !password.equals("admin")){
            // Notifications
            Toast.makeText(this, "Register fail", Toast.LENGTH_SHORT).show();
        }

    }

    private void attemptLogin() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if (username.equals("admin") && password.equals("admin")){
            // Notifications
            Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show();
        }
        if (!username.equals("admin") || !password.equals("admin")){
            // Notifications
            Toast.makeText(this, "Login fail", Toast.LENGTH_SHORT).show();
        }
    }


}
