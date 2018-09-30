package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//marcela menezes pinto - 816117695

public class MainActivity extends Activity {

    private EditText editText;

    public static final String BUSCA = "br.usjt.sin.progmulti.clientesi18.busca";  // final não consegue alterar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txt_busca);
    }

    public void buscarCliente(View view) {
        String texto = editText.getText().toString();
        Intent intent = new Intent(this,ListaClientesActivity.class); //dentro do intent coloca o contexto //isso é reflexão, ou seja, um objetvo "olhando" para dentro dele mesmo (recebe o nome da classe e instancia)
        intent.putExtra(BUSCA, texto);
        startActivity(intent);
    }
}
