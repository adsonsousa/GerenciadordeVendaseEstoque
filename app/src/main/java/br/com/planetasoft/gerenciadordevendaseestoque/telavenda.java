package br.com.planetasoft.gerenciadordevendaseestoque;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class telavenda extends AppCompatActivity {

    EditText editCliente, editValor;
    Button btnAdicionar,btnFinalizar,btnVoltar1;
    CheckBox cboxItem1,cboxItem2,cboxItem3,cboxItem4,cboxItem5,cboxItem6, cboxItem7;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
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
        btnVoltar1 = (Button)findViewById(R.id.btnVoltar1);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreSelecao = new Intent(telavenda.this, telaselecao.class);
                abreSelecao.putExtra("busca","not");
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

        btnVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Venda concluida, imprimindo...", Toast.LENGTH_LONG).show();
                //Intent abreInicio = new Intent(telavenda.this,telainicial.class);
                //startActivity(abreInicio);
                AlertDialog.Builder alerta = new AlertDialog.Builder(telavenda.this);
                alerta.setTitle("Aviso!");
                alerta
                        .setIcon(R.mipmap.ic_erro)
                        .setMessage("Deseja realmente sair sem finalizar a venda?")
                        .setCancelable(false)
                        .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Continuando a venda",Toast.LENGTH_LONG).show();
                            }
                        })
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent abreInicio = new Intent(telavenda.this,telainicial.class);
                                startActivity(abreInicio);
                                finish();
                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
        });


    }
}
