package es.hol.kaiksales.minhamedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Peso extends AppCompatActivity {
    private EditText m1;
    private EditText m2;
    private EditText m3;
    private EditText m4;
    private EditText m5;
    private EditText p1;
    private EditText p2;
    private EditText p3;
    private EditText p4;
    private EditText p5;

    private Button cm;
    private TextView resu;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float nota5;

    private float peso1;
    private float peso2;
    private float peso3;
    private float peso4;
    private float peso5;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        Button VoltarTelaInicial = (Button) findViewById(R.id.voltar);
        VoltarTelaInicial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Peso.this.finish();
            }
        });


    m1 = (EditText) findViewById(R.id.m1);
    m2 = (EditText) findViewById(R.id.m2);
    m3 = (EditText) findViewById(R.id.m3);
    m4 = (EditText) findViewById(R.id.m4);
    m5 = (EditText) findViewById(R.id.m5);
    p1 = (EditText) findViewById(R.id.p1);
    p2 = (EditText) findViewById(R.id.p2);
    p3 = (EditText) findViewById(R.id.p3);
    p4 = (EditText) findViewById(R.id.p4);
    p5 = (EditText) findViewById(R.id.p5);

    cm = (Button) findViewById(R.id.cm);
    resu = (TextView) findViewById(R.id.resu);
    cm.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            nota1 =  Float.parseFloat(m1.getText().toString());
            nota2 =  Float.parseFloat(m2.getText().toString());
            nota3 =  Float.parseFloat(m3.getText().toString());
            nota4 =  Float.parseFloat(m4.getText().toString());
            nota5 =  Float.parseFloat(m5.getText().toString());

            peso1 =  Float.parseFloat(p1.getText().toString());
            peso2 = Float.parseFloat(p2.getText().toString());
            peso3 =  Float.parseFloat(p3.getText().toString());
            peso4 =  Float.parseFloat(p4.getText().toString());
            peso5 =  Float.parseFloat(p5.getText().toString());



            float media = resutado(nota1, peso1, nota2, peso2,  nota3, peso3, nota4, peso4, nota5, peso5);
            resu.setText(String.valueOf(media));
        }
    });

    }

    private float resutado(float nota1, float peso1, float nota2, float peso2, double nota3, float peso3, float nota4, float peso4, float nota5, float peso5) {
        float resultado = (float) ((nota1*peso1 + nota2*peso2 + nota3*peso3 + nota4*peso4 + nota5*peso5)/(peso1+peso2+peso3+peso4+peso5));
        return resultado;


    }
}
