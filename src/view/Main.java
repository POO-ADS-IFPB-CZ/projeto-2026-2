import model.Cliente;
import model.Endereco;
import model.Loja;

void main(){

    Loja loja = new Loja("11.111.111/0001-11",
            "Armazem Paraiba");
    Cliente cliente = new Cliente("111.111.111-01",
            "Maria", new Endereco("Rua A",
            30, "58900-000"));
    loja.adicionarCliente(cliente);

    for(Cliente c: loja.getClientes()){
        System.out.println(c.getNome());
    }

}