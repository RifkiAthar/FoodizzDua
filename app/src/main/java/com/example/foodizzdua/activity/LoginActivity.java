package com.example.foodizzdua.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.foodizzdua.R;
import com.example.foodizzdua.helper.InputValidation;
import com.example.foodizzdua.sql.DatabaseHelper;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private final AppCompatActivity activity = LoginActivity.this;

    private ConstraintLayout constraintLayout;

    private TextInputLayout textInputLayoutName;
    private TextInputLayout textInputLayoutPassword;

    private TextInputEditText textInputEditTextName;
    private TextInputEditText textInputEditTextPassword;

    private AppCompatButton btnLogin;
    private AppCompatTextView tvLinkRegister;


    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        initViews();
        initListener();
        initObject();
    }

    private void initViews(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.constrain_layout);

        textInputLayoutName =(TextInputLayout) findViewById(R.id.textInputLayoutName);
        textInputLayoutPassword=(TextInputLayout) findViewById(R.id.textInputLayoutPassword);

        textInputEditTextName =(TextInputEditText) findViewById(R.id.textInputEditTextName);
        textInputEditTextPassword =(TextInputEditText) findViewById(R.id.textInputEditTextPassword);

        btnLogin = (AppCompatButton) findViewById(R.id.btn_login);
        tvLinkRegister = (AppCompatTextView) findViewById(R.id.register_now);

    }

    private void initListener(){
        btnLogin.setOnClickListener(this);
        tvLinkRegister.setOnClickListener(this);
    }

    private void initObject(){
        databaseHelper = new DatabaseHelper(activity);
        inputValidation = new InputValidation(activity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                verifyFromSQLite();
                break;
            case R.id.register_now:
                Intent intentRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intentRegister);
                break;
        }
    }

    private void verifyFromSQLite(){
        if(!inputValidation.isInputEditTextFilled(textInputEditTextName, textInputLayoutName, getString(R.string.error_message_email))){
            return;
        }
        if(!inputValidation.isInputEditTextEmail(textInputEditTextName, textInputLayoutName, getString(R.string.error_message_email))){
            return;
        }
        if(!inputValidation.isInputEditTextFilled(textInputEditTextPassword, textInputLayoutPassword, getString(R.string.error_message_password))){
            return;
        }

        if(databaseHelper.checkUser(textInputEditTextName.getText().toString().trim()
                , textInputEditTextPassword.getText().toString().trim())){
            Intent accountIntent = new Intent(activity, MainActivity.class);
            emptyInputEditText();
            startActivity(accountIntent);
        } else {
            Snackbar.make(constraintLayout, getString(R.string.error_valid_email_password), Snackbar.LENGTH_SHORT).show();
        }

    }

    private void emptyInputEditText(){
        textInputEditTextName.setText(null);
        textInputEditTextPassword.setText(null);
    }
}
