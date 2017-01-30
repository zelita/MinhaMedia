package es.hol.kaiksales.minhamedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


        Button CalcularMediap = (Button) findViewById(R.id.button2);

        CalcularMediap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_tela2);
                Intent intent = new Intent(TelaInicial.this, Calculo.class);
                startActivity(intent);
            }
        });
        Button CalcularMediapeso = (Button) findViewById(R.id.button3);

        CalcularMediapeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_tela2);
                Intent intent = new Intent(TelaInicial.this, Peso.class);
                startActivity(intent);
            }
        });
    }
}
