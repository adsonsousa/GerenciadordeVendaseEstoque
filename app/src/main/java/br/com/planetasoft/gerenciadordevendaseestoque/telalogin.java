package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class telalogin extends AppCompatActivity {

    EditText editUser, editPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        editUser = (EditText)findViewById(R.id.editUser);
        editPass = (EditText)findViewById(R.id.editPass);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Logado com sucesso!", Toast.LENGTH_LONG).show();

                Intent abreInicial = new Intent(telalogin.this, telainicial.class);
                startActivity(abreInicial);
            }
        });
    }
}
