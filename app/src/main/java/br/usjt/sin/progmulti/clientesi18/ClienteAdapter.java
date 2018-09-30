package br.usjt.sin.progmulti.clientesi18;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//marcela menezes pinto - 816117695

public class ClienteAdapter extends BaseAdapter{

    private Cliente[] clientes;
    private Context contexto;

    public ClienteAdapter(Cliente[] clientes, Context contexto) {
        this.clientes = clientes;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return clientes.length; //pegar o tamanho da lista
    }

    @Override
    public Object getItem(int i) {
        return clientes[i]; //retornar o cara que está na posição I
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //linha que esta sendo montada no listview e ele casa com a posição do array
        View linha = view;

        if(linha  == null){

            LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            linha = inflater.inflate(R.layout.linha_cliente, viewGroup, false); //inflando o layout vc tranforma o xml

            ImageView foto = linha.findViewById(R.id.foto_cliente);
            TextView linha_nome = linha.findViewById(R.id.linha_nome);
            TextView linha_detalhe = linha.findViewById(R.id.linha_detalhe);
            ViewHolder holder = new ViewHolder(foto, linha_nome, linha_detalhe);
            linha.setTag(holder);
        }

        Cliente cliente = clientes[i];
        ViewHolder holder = (ViewHolder)linha.getTag();

        holder.getLinha1().setText(cliente.getNome());
        holder.getLinha2().setText(cliente.getTipo() + " - " + cliente.getData());

        Drawable figura = Util.getImagem(contexto, cliente.getFoto());

        holder.getImagem().setImageDrawable(figura);

        return linha;
    }

}
