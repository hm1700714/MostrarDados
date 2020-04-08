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

        String nome = intent.getStringExtra(App.NOME);
        TextView textViewMensagem = (TextView) findViewById(R.id.textViewNome);
        textViewMensagem.setText(nome);


        String telemovel = intent.getStringExtra(App.TELEMOVEL);
        TextView textViewTelemovel = (TextView) findViewById(R.id.textViewTelemovel);
        textViewTelemovel.setText(telemovel);


        String email = intent.getStringExtra(App.EMAIL);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewEmail.setText(email);

        String idade = intent.getStringExtra(App.IDADE);
        TextView textViewIdade = (TextView) findViewById(R.id.textViewIdade);
        textViewIdade.setText(idade);

        String peso = intent.getStringExtra(App.PESO);
        TextView textViewPeso = (TextView) findViewById(R.id.textViewPeso);
        textViewPeso.setText(peso);

        String altura = intent.getStringExtra(App.ALTURA);
        TextView textViewAltura = (TextView) findViewById(R.id.textViewAltura);
        textViewAltura.setText(altura);


        //Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();



    }
}
