package br.com.planetasoft.gerenciadordevendaseestoque;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class telapeca extends AppCompatActivity {

    Button btnVoltar2,btnOk;
    RadioButton rbtnLcd,rbtnModulo,rbtnTouch,rbtnBateria,rbtnConector,rbtnOutro;
    TextView txtMarca;
    String marca, busca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_peca);

        txtMarca =(TextView)findViewById(R.id.txtMarca);

        btnVoltar2 = (Button)findViewById(R.id.btnVoltar2);
        btnOk = (Button)findViewById(R.id.btnOK);

        rbtnModulo = (RadioButton)findViewById(R.id.rbtnModulo);
        rbtnLcd = (RadioButton)findViewById(R.id.rbtnLcd);
        rbtnTouch = (RadioButton)findViewById(R.id.rbtnTouch);
        rbtnBateria = (RadioButton)findViewById(R.id.rbtnBateria);
        rbtnConector = (RadioButton)findViewById(R.id.rbtnConector);
        rbtnOutro = (RadioButton)findViewById(R.id.rbtnOutro);

        marca = getIntent().getExtras().getString("marca");
        busca = getIntent().getExtras().getString("busca");

        txtMarca.setText("Marca Selecionada: " + marca);

        if (busca.equals("ok")){
            btnOk.setVisibility(View.INVISIBLE);
        }

        btnVoltar2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (busca.equals("ok")){
                    finish();
                }else{
                    AlertDialog.Builder alerta = new AlertDialog.Builder(telapeca.this);
                    alerta.setTitle("Aviso!");
                    alerta
                            .setIcon(R.mipmap.ic_erro)
                            .setMessage("Venda em andamento deseja realmente sair?")
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
                                    finish();
                                }
                            });
                    AlertDialog alertDialog = alerta.create();
                    alertDialog.show();
                }
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreVenda = new Intent(telapeca.this,telavenda.class);
                abreVenda.putExtra("intem","venda");
                startActivity(abreVenda);
            }
        });
    }
}
