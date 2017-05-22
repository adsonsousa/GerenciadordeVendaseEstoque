package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class telavenda extends AppCompatActivity {

    EditText editCliente, editValor;
    Button btnAdicionar,btnFinalizar;
    CheckBox cboxItem1,cboxItem2,cboxItem3,cboxItem4,cboxItem5,cboxItem6, cboxItem7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_venda);

        editCliente = (EditText)findViewById(R.id.editCliente);
        editValor = (EditText)findViewById(R.id.editValor);

        cboxItem1 = (CheckBox)findViewById(R.id.cboxItem1);
        cboxItem2 = (CheckBox)findViewById(R.id.cboxItem2);
        cboxItem3 = (CheckBox)findViewById(R.id.cboxItem3);
        cboxItem4 = (CheckBox)findViewById(R.id.cboxItem4);
        cboxItem5 = (CheckBox)findViewById(R.id.cboxItem5);
        cboxItem6 = (CheckBox)findViewById(R.id.cboxItem6);
        cboxItem7 = (CheckBox)findViewById(R.id.cboxItem7);

        btnAdicionar = (Button)findViewById(R.id.btnAdicionar);
        btnFinalizar = (Button)findViewById(R.id.btnFinalizar);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreSelecao = new Intent(telavenda.this, telaselecao.class);
                startActivity(abreSelecao);
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Venda concluida, imprimindo...", Toast.LENGTH_LONG).show();
                Intent abreInicio = new Intent(telavenda.this,telainicial.class);
                startActivity(abreInicio);
            }
        });


    }
}
