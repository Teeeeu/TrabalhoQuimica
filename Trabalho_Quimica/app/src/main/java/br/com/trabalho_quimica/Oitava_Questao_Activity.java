package br.com.trabalho_quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Oitava_Questao_Activity extends AppCompatActivity {

    Button button28,button29,button30,button31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oitava__questao_layout);

        button28 = findViewById(R.id.btnRespostaCerta8);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Nona_Questao_Activity.class));
            }
        });
        button29 = findViewById(R.id.btnRespostaErrada23);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button30 = findViewById(R.id.btnRespostaErrada24);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button31 = findViewById(R.id.btnRespostaErrada25);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
