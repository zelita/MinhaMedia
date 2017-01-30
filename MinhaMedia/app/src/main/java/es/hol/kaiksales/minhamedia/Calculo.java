package es.hol.kaiksales.minhamedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculo extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private EditText n4;
    private EditText n5;
    private EditText n3;
    private Button cm;
    private TextView resu;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float nota5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Button VoltarTelaInicial = (Button) findViewById(R.id.voltar);


        VoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculo.this.finish();
            }
        });
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        n4 = (EditText) findViewById(R.id.n4);
        n5 = (EditText) findViewById(R.id.n5);
        cm = (Button) findViewById(R.id.cm);
        resu = (TextView) findViewById(R.id.resu);
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota1 =  Float.parseFloat(n1.getText().toString());
                nota2 =  Float.parseFloat(n2.getText().toString());
                nota3 =  Float.parseFloat(n3.getText().toString());
                nota4 =  Float.parseFloat(n4.getText().toString());
                nota5 =  Float.parseFloat(n5.getText().toString());

                float media = resutado(nota1, nota2, nota3, nota4, nota5);
                resu.setText(String.valueOf(media));
            }
        });

    }

    private  float resutado(float nota1,  float nota2,  float nota3,  float nota4,  float nota5) {
        float resultado = ((nota1 +nota2 + nota3 + nota4 + nota5)/5);
        return resultado;
    }
}