package br.usjt.sin.progmulti.clientesi18;

public class ClienteDAO {

    //marcela menezes pinto - 816117695

    private static Cliente[] clientes;

    private ClienteDAO(){

    }

    public static Cliente[] getClientes(){
       if(clientes == null){

           clientes = new Cliente[12];
           clientes[0] = new Cliente(1,"maze runner","Ação","18/09/2014");
           clientes[1] = new Cliente(2,"papillon","Drama","05/10/2018");
           clientes[2] = new Cliente(3,"cinderela e o principe secreto","Animação","11/10/2018");
           clientes[3] = new Cliente(4,"chacrinha","Comédia","25/10/2018");
           clientes[4] = new Cliente(5,"halloween","Terror","25/10/2018");
           clientes[5] = new Cliente(6,"bohemian rhapsody","Biografia, Drama","01/11/2018");
           clientes[6] = new Cliente(7,"o doutrinador","Ação","01/11/2018");
           clientes[7] = new Cliente(8,"o grinch","Animação, Comédia","08/11/2018");
           clientes[8] = new Cliente(9,"operacao overlord","Ação, Mistério, Terror","08/11/2018");
           clientes[9] = new Cliente(10,"refem do jogo","Ação","15/11/2018");
           clientes[10] = new Cliente(11,"a vida em si","Drama, Romance","06/12/2018");
           clientes[11] = new Cliente(12,"bumblebee","Ação, Aventura, Ficção-científica","25/12/2018");
       }

        return clientes;
    }

}
