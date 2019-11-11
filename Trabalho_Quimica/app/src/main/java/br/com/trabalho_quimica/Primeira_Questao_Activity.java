package br.com.trabalho_quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Primeira_Questao_Activity extends AppCompatActivity {

    Button button,button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira__questao_layout);



        button = findViewById(R.id.btnRespostaCerta);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Segunda_Questao_Activity.class));
            }
        });
        button1 = findViewById(R.id.QErrada);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });

        button2 = findViewById(R.id.btnRespostaErrada2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button3 = findViewById(R.id.btnRespostaErrada3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente", Toast.LENGTH_LONG).show();
            }
        });

    }

}
