package com.linshengt.qq.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.linshengt.qq.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnRegister;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findView();
        initView();
    }

    private void findView(){
        btnRegister = (Button) findViewById(R.id.btn_Register);
        btnLogin = (Button) findViewById(R.id.btn_login);
    }
    private void initView(){
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.btn_Register:
                i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
                break;
            case R.id.btn_login:
                i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
