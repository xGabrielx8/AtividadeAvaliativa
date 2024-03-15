package br.com.gabrielmayer.atividadeavaliativa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText campoNome;
    Button btnsaudacao;
    TextView TVmensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        btnsaudacao = findViewById(R.id.btnBotao);
        TVmensagem = findViewById(R.id.tvNome);

        btnsaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String mensagem = "Olá, "+nome;
                TVmensagem.setText(mensagem);
            }
        });
    }
}
