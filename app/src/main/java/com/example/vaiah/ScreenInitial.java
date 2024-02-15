package com.example.vaiah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ScreenInitial extends AppCompatActivity {
private EditText EditName, EditeTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        EditName = findViewById(R.id.edit_name);
        EditeTable = findViewById(R.id.edit_table);
    }
    public void ChangeScreen(View view){
        if(EditName.getText().toString().equals("")){
            Toast.makeText(this, R.string.toast_error_name, Toast.LENGTH_LONG).show();
        }
        else if(EditeTable.getText().toString().equals("")){
            Toast.makeText(this, R.string.toast_error_table, Toast.LENGTH_LONG).show();
        }
        else {
            Intent change = new Intent(this, MainActivity.class);
            startActivity(change);   
        }
    }
}