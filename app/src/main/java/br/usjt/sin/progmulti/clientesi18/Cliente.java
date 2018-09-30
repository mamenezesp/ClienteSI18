package br.usjt.sin.progmulti.clientesi18;

import java.io.Serializable;

//marcela menezes pinto - 816117695

public class Cliente implements Serializable{ //serializable é persistir o estado dela no SO (como um arquivo)

    private int id;
    private String nome, tipo, data;


    public Cliente(int id, String nome, String tipo, String data) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getFoto(){
        String foto = nome.replace(' ','_');
        return foto.replace('.','_');
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
