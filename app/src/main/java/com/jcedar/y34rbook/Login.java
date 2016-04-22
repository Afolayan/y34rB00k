package com.jcedar.y34rbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by oluwafemi.bamisaye on 4/7/2016.
 */
public class Login extends AppCompatActivity {

    private EditText etEmail;
    private Button btSignIn;
    private TextInputLayout til;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initialize variables
        etEmail = (EditText) findViewById(R.id.et_verify_email);
        btSignIn = (Button) findViewById(R.id.btn_sign_in);
//        til = (TextInputLayout) findViewById(R.id.tilLogin);

        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submitForm();
            }
        });

    }

    private boolean validateEmail() {
        String tEmail = etEmail.getText().toString().trim();

        if (TextUtils.isEmpty(tEmail) || !isValidEmail(tEmail)) {
            etEmail.setError("Invalid Email Address");
            requestFocus(etEmail);

            View view = requestFocus(etEmail);
            Snackbar.make(view, "Please Enter a valid email Address", Snackbar.LENGTH_SHORT).show();

            return false;
        } else {
//            til.setErrorEnabled(false);
        }

        return true;
    }


    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private View requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
        return view;
    }

    /**
     * Validating form
     */
    private void submitForm() {

        if (!validateEmail()) {
            return;
        }

        else {

            Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
            Intent dashIntent = new Intent(Login.this, DashboardActivity.class);
            dashIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(dashIntent);
        }
    }


}
