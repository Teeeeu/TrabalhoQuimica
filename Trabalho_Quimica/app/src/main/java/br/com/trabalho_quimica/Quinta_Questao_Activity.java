package br.com.trabalho_quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quinta_Questao_Activity extends AppCompatActivity {

    Button button16,button17,button18,button19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quinta_questao_layout);

        button16 = findViewById(R.id.btnRespostaCerta5);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Sexta_Questao_Activity.class));
            }
        });
        button17 = findViewById(R.id.btnRespostaErrada13);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button18 = findViewById(R.id.btnRespostaErrada14);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button19 = findViewById(R.id.btnRespostaErrada15);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
