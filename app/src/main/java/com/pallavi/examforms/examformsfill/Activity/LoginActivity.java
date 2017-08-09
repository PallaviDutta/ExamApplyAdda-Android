package com.pallavi.examforms.examformsfill.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.pallavi.examforms.examformsfill.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_login_username;
    EditText edt_login_password;
    Button btn_login_button;
    Button btn_signup_button;
    String  login_email;
    String login_password;

    FirebaseAuth mauth;
    FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_login_username=(EditText)findViewById(R.id.edt_login_username);
        edt_login_password=(EditText)findViewById(R.id.edt_login_password);
        btn_login_button = (Button)findViewById(R.id.btn_login_button);
        btn_signup_button = (Button)findViewById(R.id.btn_signup_button);

        btn_login_button.setOnClickListener(this);
        btn_signup_button.setOnClickListener(this);

        mauth=FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

            }
        };
    }

    @Override
    public void onClick(View view) {

        login_email=edt_login_username.getText().toString().trim();
        login_password=edt_login_password.getText().toString().trim();
        switch (view.getId())
        {
            case R.id.btn_login_button:
                Toast.makeText(this, "Login...", Toast.LENGTH_SHORT).show();
                if(login_email.equals("") & login_password.equals(""))
                    Toast.makeText(this, "First enter both fields", Toast.LENGTH_SHORT).show();
                else
//                    progressDialog.show();
                normalLogin();

                break;
            case R.id.btn_signup_button:
//                progressDialog.show();
                startActivity(new Intent(this,RegisterActivity.class));
                Toast.makeText(this, "Signup...", Toast.LENGTH_SHORT).show();
                break;

        }

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }


    public void normalLogin(){
        mauth.signInWithEmailAndPassword(login_email, login_password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("normal_login", "signInWithEmail:onComplete:" + task.isSuccessful());

                        if (!task.isSuccessful()) {
                            Log.w("normal_login", "signInWithEmail:failed", task.getException());
//                            progressDialog.dismiss();//dismiss on task failure
                        }
                        else {
                            Toast.makeText(LoginActivity.this, "Successful Login!!!",
                                    Toast.LENGTH_LONG).show();
                            startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                            finish();
//                            progressDialog.dismiss();//dismiss on task completion
                        }

                    }
                });

    }




}
