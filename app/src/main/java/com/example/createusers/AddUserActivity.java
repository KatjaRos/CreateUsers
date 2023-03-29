package com.example.createusers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }


    public void addUser(View view) {
        RadioGroup program = findViewById(R.id.programIn);
        EditText firstnameInput = findViewById(R.id.fnameIn);
        EditText lastnameInput = findViewById(R.id.lnameIn);
        EditText e_mailInput = findViewById(R.id.email_in);
        String fname = firstnameInput.getText().toString();
        String lname = lastnameInput.getText().toString();
        String email = e_mailInput.getText().toString();
        switch (program.getCheckedRadioButtonId()) {
            case R.id.btnTiTe:
                UserStorage.getInstance().addUser(new UserInformation(fname, lname, email, "Tietotekniikka"));
                break;
            case R.id.btnLaTe:
                UserStorage.getInstance().addUser(new UserInformation(fname, lname, email, "Laskennallinen tekniikka"));
                break;
            case R.id.btnTuTa:
                UserStorage.getInstance().addUser(new UserInformation(fname, lname, email, "Tuotantotalous"));
                break;
            case R.id.btnSaTe:
                UserStorage.getInstance().addUser(new UserInformation(fname, lname, email, "Sähkötekniikka"));
                break;

        }
    }
}