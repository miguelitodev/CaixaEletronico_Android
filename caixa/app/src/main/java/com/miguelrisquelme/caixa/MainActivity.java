package com.miguelrisquelme.caixa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String user[] = {"admin","usuario"};
    String senha [] = {"admin","user"};
    EditText campoUser, campoSenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void sair(View view) {
        finish();
    }

    public void verifica(View view) {
        campoUser = findViewById(R.id.editTextUser);
        campoSenha = findViewById(R.id.editTextSenha);
        String campo1,campo2;
        campo1 = campoUser.getText().toString();
        campo2 = campoSenha.getText().toString();

        if (campo1.equals(user[0]) && campo2.equals(senha[0])){

            Intent minhaIntencao;
            minhaIntencao = new Intent(getApplicationContext(), Admin.class);
            startActivity(minhaIntencao);
        } else if(campo1.equals(user[1]) && campo2.equals(senha[1])){
            Intent minhaIntencao;
            minhaIntencao = new Intent(getApplicationContext(),Usuario.class);
            startActivity(minhaIntencao);
        } else{
            Context contesto = getApplicationContext();
            CharSequence text = "Login errado";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(contesto, text, duration);
            toast.show();
        }
    }
}
