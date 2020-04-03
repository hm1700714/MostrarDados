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

        //permite ir buscar a caixa de edição de texto

        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String mensagem = editTextNome.getText().toString();

        EditText editTextTelemovel = (EditText) findViewById(R.id.editTextTelemovel);
        String mensagem1 = editTextTelemovel.getText().toString();

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String mensagem2 = editTextEmail.getText().toString();

        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        String mensagem3 = editTextIdade.getText().toString();

        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        String mensagem4 = editTextPeso.getText().toString();

        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        String mensagem5 = editTextAltura.getText().toString();


        intent.putExtra("Nome", mensagem);
        intent.putExtra("Telemovel", mensagem1);
        intent.putExtra("Email", mensagem2);
        intent.putExtra("Idade", mensagem3);
        intent.putExtra("Peso", mensagem4);
        intent.putExtra("Altura", mensagem5);

        startActivity(intent);

        //todo: enviar mensagem
    }
}
