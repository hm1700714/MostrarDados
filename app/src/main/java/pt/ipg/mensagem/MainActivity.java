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
            editTextNome.setError("Falta preencher o nome.");
            editTextNome.requestFocus();
            return;
        }

        EditText editTextTelemovel = (EditText) findViewById(R.id.editTextTelemovel);
        String telemovel = editTextTelemovel.getText().toString();

        if(telemovel.length() < 9){
            editTextTelemovel.setError("Telefone Inválido.Falta preencher o numero de telemóvel.");
            editTextTelemovel.requestFocus();
            return;
        }

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String email = editTextEmail.getText().toString();

        if(email.length() == 0){
            editTextEmail.setError("Falta preencher o email.");
            editTextEmail.requestFocus();
            return;
        }

        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        String srtIdade = editTextIdade.getText().toString();

        int idade;
        try {
            idade = Integer.parseInt(srtIdade);
        } catch (NumberFormatException e) {
            editTextIdade.setError("Idade Inválida. Preencha a idade");
            editTextIdade.requestFocus();
            return;
        }

        if(idade < 18){
            editTextIdade.setError("A idade tem de ser maior ou igual a 18 anos");
            editTextIdade.requestFocus();
            return;
        }


        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        String peso = editTextPeso.getText().toString();

        if(peso.length() == 0){
            editTextPeso.setError("Falta preencher o peso.");
            editTextPeso.requestFocus();
            return;
        }

        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        String altura = editTextAltura.getText().toString();

        if(altura.length() == 0){
            editTextAltura.setError("Falta preencher a altura.");
            editTextAltura.requestFocus();
            return;
        }

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
