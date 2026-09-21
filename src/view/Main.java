import model.Cliente;
import model.Endereco;

void main(){
    Cliente cliente = new Cliente("111.111.111-01",
            "João",
            new Endereco("Rua José Antônio da Silva",
                300,
                "58900-000")
    );
}