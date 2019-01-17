package com.sheygam.masa_2018_g2_17_01_19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputEmail;
    private Button okBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        inputEmail = findViewById(R.id.input_email);
        okBtn = findViewById(R.id.ok_btn);
        okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.ok_btn){
            String email = inputEmail.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("EMAIL",email);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}
