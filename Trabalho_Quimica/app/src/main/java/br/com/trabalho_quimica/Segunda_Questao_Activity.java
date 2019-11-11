package br.com.trabalho_quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Segunda_Questao_Activity extends AppCompatActivity {

    Button button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_questao_layout);

        button4 = findViewById(R.id.btnRespostaCerta2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Terceira_Questao_Activity.class));
            }
        });
        button5 = findViewById(R.id.btnRespostaErrada4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });

        button6 = findViewById(R.id.btnRespostaErrada5);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reposta errada, tente novamente",Toast.LENGTH_LONG).show();
            }
        });
        button7 = findViewById(R.id.btnRespostaErrada6);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reposta errada, tente novamente", Toast.LENGTH_LONG).show();
            }
        });
    }
}
