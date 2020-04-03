package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MostraInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_info);

        Intent intent = getIntent();

        String mensagem = intent.getStringExtra("Nome");
        TextView textViewMensagem = (TextView) findViewById(R.id.textViewNome);
        textViewMensagem.setText(mensagem);


        String mensagem1 = intent.getStringExtra("Telemovel");
        TextView textViewTelemovel = (TextView) findViewById(R.id.textViewTelemovel);
        textViewTelemovel.setText(mensagem1);


        String mensagem2 = intent.getStringExtra("Email");
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewEmail.setText(mensagem2);

        String mensagem3 = intent.getStringExtra("Idade");
        TextView textViewIdade = (TextView) findViewById(R.id.textViewIdade);
        textViewIdade.setText(mensagem3);

        String mensagem4 = intent.getStringExtra("Peso");
        TextView textViewPeso = (TextView) findViewById(R.id.textViewPeso);
        textViewPeso.setText(mensagem4);

        String mensagem5 = intent.getStringExtra("Altura");
        TextView textViewAltura = (TextView) findViewById(R.id.textViewAltura);
        textViewAltura.setText(mensagem5);


        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();



    }
}
