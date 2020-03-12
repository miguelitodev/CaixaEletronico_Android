package com.miguelrisquelme.caixa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Usuario extends AppCompatActivity {

    EditText valorSaque = findViewById(R.id.editTextValorSaque);
    EditText nota100 = findViewById(R.id.editTextNota100);
    EditText nota50 = findViewById(R.id.editTextNota50);
    EditText nota20 = findViewById(R.id.editTextNota20);
    EditText nota10 = findViewById(R.id.editTextNota10);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usuario);
    }

    public void voltar(View view){
    }

    public void sacar(View v){
        Context contesto = getApplicationContext();
        CharSequence text = valorSaque + " " + nota10 + " " + nota20 + " " + nota50 + " " + nota100;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contesto, text, duration);
        toast.show();
    }

}
