package com.example.app2activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.app2activity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View v) {
        Intent intent = new Intent(this, Pantalla2.class);
        EditText name = (EditText) findViewById(R.id.inpNombre);
        String nombre = name.getText().toString();

        if (name.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Error: Please, enter your name", Toast.LENGTH_LONG).show();
        }
        else
        {
            intent.putExtra(EXTRA_MESSAGE, nombre);
            startActivity(intent);
        }




        }

}