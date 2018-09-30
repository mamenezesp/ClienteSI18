package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

//marcela menezes pinto - 816117695

public class DetalheClienteActivity extends Activity {
    private TextView nome, tipo, data;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        nome = findViewById(R.id.detalhe_txt_nome);
        tipo = findViewById(R.id.detalhe_txt_tipo);
        data = findViewById(R.id.detalhe_txt_data);
        foto = findViewById(R.id.detalhe_foto_cliente);

        Intent intent = getIntent();
        Cliente cliente = (Cliente)intent.getSerializableExtra(ListaClientesActivity.CLIENTE);
        nome.setText(cliente.getNome().toString());
        tipo.setText(cliente.getTipo().toString());
        data.setText(cliente.getData().toString());
        foto.setImageDrawable(Util.getImagem(this, cliente.getFoto()));
    }
}
