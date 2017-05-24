package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
                Toast.makeText(getApplicationContext(), "Sua venda foi iniciada!", Toast.LENGTH_LONG).show();

                Intent abreSelecao = new Intent(telainicial.this, telaselecao.class);
                abreSelecao.putExtra("busca","not");
                finish();
                startActivity(abreSelecao);
            }
        });

        btnBusca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abreSelecao = new Intent(telainicial.this, telaselecao.class);
                abreSelecao.putExtra("busca","ok");
                finish();
                startActivity(abreSelecao);
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alerta = new AlertDialog.Builder(telainicial.this);
                alerta.setTitle("Aviso!");
                alerta
                        .setIcon(R.mipmap.ic_erro)
                        .setMessage("Deseja sair do sistema?")
                        .setCancelable(false)
                        .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Continua logado.",Toast.LENGTH_LONG).show();
                            }
                        })
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Até a proxima!",Toast.LENGTH_LONG).show();
                                Intent abreLogin = new Intent(telainicial.this, telalogin.class);
                                finish();
                                startActivity(abreLogin);
                                /*Intent sair = new Intent(Intent.ACTION_MAIN);
                                sair.addCategory(Intent.CATEGORY_HOME);
                                sair.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(sair);*/
                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
        });
    }
}
