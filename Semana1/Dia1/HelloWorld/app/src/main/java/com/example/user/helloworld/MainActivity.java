package com.example.user.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Toast.makeText(this, R.string.button_clicked, Toast.LENGTH_SHORT).show();
        EditText etName=findViewById(R.id.etName);
        TextView textResult=findViewById(R.id.tvNameResult);
        textResult.setText(getString(R.string.text_hi)+etName.getText());
    }
}
