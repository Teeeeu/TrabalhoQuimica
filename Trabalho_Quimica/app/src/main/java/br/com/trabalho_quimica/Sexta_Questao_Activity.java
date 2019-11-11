package br.com.trabalho_quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sexta_Questao_Activity extends AppCompatActivity {

    Button button20,button21,button22,button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sexta_questao_layout);

        button20 = findViewById(R.id.btnRespostaCerta6);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Setima_Questao_Activity.class));
            }
        });
        button21 = findViewById(R.id.btnRespostaErrada17);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button22 = findViewById(R.id.btnRespostaErrada18);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button23 = findViewById(R.id.btnRespostaErrada19);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
