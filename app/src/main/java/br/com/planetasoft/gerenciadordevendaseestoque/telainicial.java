package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class telainicial extends AppCompatActivity {

    Button btnVenda, btnBusca, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        btnVenda = (Button)findViewById(R.id.btnVenda);
        btnBusca = (Button)findViewById(R.id.btnBusca);
        btnSair =(Button)findViewById(R.id.btnSair);

        btnVenda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(getApplicationContext(), "Logado com sucesso!", Toast.LENGTH_LONG).show();

                Intent abreVenda = new Intent(telainicial.this, telavenda.class);
                startActivity(abreVenda);
            }
        });

        btnBusca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(getApplicationContext(), "Logado com sucesso!", Toast.LENGTH_LONG).show();

                Intent abreBusca = new Intent(telainicial.this, telapesquisa.class);
                startActivity(abreBusca);
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(getApplicationContext(), "Logado com sucesso!", Toast.LENGTH_LONG).show();

                //Intent abreSair = new Intent(telainicial.this, telalogin.class);
                //startActivity(abreSair);
                finish();
            }
        });
    }
}
