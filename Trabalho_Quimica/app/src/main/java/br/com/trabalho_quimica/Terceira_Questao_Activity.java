package br.com.trabalho_quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Terceira_Questao_Activity extends AppCompatActivity {

    Button button8,button9,button10,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceira_questao_layout);

        button8 = findViewById(R.id.btnRespostaCerta3);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Quarta_Questao_Activity.class));
            }
        });
        button9 = findViewById(R.id.btnRespostaErrada7);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button10 = findViewById(R.id.btnRespostaErrada8);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button11 = findViewById(R.id.btnRespostaErrada9);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
