package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class telaselecao extends AppCompatActivity {

    ImageButton ibtnLg,ibtnSamsung,ibtnMotorola,ibtnLenovo,ibtnMicrosoft,ibtnNokia,ibtnTablet,ibtnApple,ibtnSony;
    Button btnVoltar;

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

        ibtnLg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("LG","1");

                startActivity(abrePeca);
            }
        });

        ibtnSamsung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Samsung","2");

                startActivity(abrePeca);
            }
        });

        ibtnMotorola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Motorola","3");

                startActivity(abrePeca);
            }
        });

        ibtnLenovo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Lenovo","4");

                startActivity(abrePeca);
            }
        });

        ibtnMicrosoft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Microsoft","5");

                startActivity(abrePeca);
            }
        });

        ibtnNokia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Nokia","6");

                startActivity(abrePeca);
            }
        });

        ibtnTablet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Tablet","7");

                startActivity(abrePeca);
            }
        });

        ibtnApple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Apple","8");

                startActivity(abrePeca);
            }
        });

        ibtnSony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Sony","9");

                startActivity(abrePeca);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrePeca = new Intent(telaselecao.this,telapeca.class);
                abrePeca.putExtra("Sony","9");

                startActivity(abrePeca);
            }
        });


    }
}
