package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviaMensagem(View view) {

        Intent intent = new Intent(this, MostraInfoActivity.class);

        //Permite ir buscar a caixa de edição de texto

        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String nome = editTextNome.getText().toString();

        //verificação de dados para o nome

        if(nome.length() == 0){
            editTextNome.setError("Falta preencher o nome");
            return;
        }

        EditText editTextTelemovel = (EditText) findViewById(R.id.editTextTelemovel);
        String telemovel = editTextTelemovel.getText().toString();

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String email = editTextEmail.getText().toString();

        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        String idade = editTextIdade.getText().toString();

        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        String peso = editTextPeso.getText().toString();

        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        String altura = editTextAltura.getText().toString();



        intent.putExtra(App.NOME, nome);
        intent.putExtra(App.TELEMOVEL, telemovel);
        intent.putExtra(App.EMAIL, email);
        intent.putExtra(App.IDADE, idade);
        intent.putExtra(App.PESO, peso);
        intent.putExtra(App.ALTURA, altura);

        startActivity(intent);

        //todo: enviar mensagem
    }
}
