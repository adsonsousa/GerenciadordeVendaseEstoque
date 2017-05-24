package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class telaselecao extends AppCompatActivity {

    ImageButton ibtnLg,ibtnSamsung,ibtnMotorola,ibtnLenovo,ibtnMicrosoft,ibtnNokia,ibtnTablet,ibtnApple,ibtnSony;
    Button btnVoltar;
    String[] extras = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_selecao);

        ibtnLg = (ImageButton)findViewById(R.id.ibtnLg);
        ibtnSamsung = (ImageButton)findViewById(R.id.ibtnSamsung);
        ibtnMotorola = (ImageButton)findViewById(R.id.ibtnMotorola);
        ibtnLenovo = (ImageButton)findViewById(R.id.ibtnLenovo);
        ibtnMicrosoft = (ImageButton)findViewById(R.id.ibtnMicrosoft);
        ibtnNokia = (ImageButton)findViewById(R.id.ibtnNokia);
        ibtnTablet = (ImageButton)findViewById(R.id.ibtnTablet);
        ibtnApple = (ImageButton)findViewById(R.id.ibtnApple);
        ibtnSony = (ImageButton)findViewById(R.id.ibtnSony);
        btnVoltar =(Button)findViewById(R.id.btnVoltar);

        extras[1] = getIntent().getExtras().getString("busca");


        ibtnLg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "LG";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnSamsung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Samsung";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnMotorola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Motorola";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnLenovo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Lenovo";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnMicrosoft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Microsoft";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnNokia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Nokia";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnTablet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Tablet";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnApple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Apple";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        ibtnSony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                extras[0] = "Sony";
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("marca",extras[0]);
                abrePeca.putExtra("busca",extras[1]);
                finish();
                startActivity(abrePeca);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (extras[1].equals("ok")){
                    finish();
                }else{
                    AlertDialog.Builder alerta = new AlertDialog.Builder(telaselecao.this);
                    alerta.setTitle("Aviso!");
                    alerta
                            .setIcon(R.mipmap.ic_erro)
                            .setMessage("Venda andamento deseja realmente sair?")
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
                                    Intent abreInicial = new Intent(telaselecao.this,telainicial.class);
                                    finish();
                                    startActivity(abreInicial);
                                }
                            });
                    AlertDialog alertDialog = alerta.create();
                    alertDialog.show();
                }
            }
        });


    }
}
