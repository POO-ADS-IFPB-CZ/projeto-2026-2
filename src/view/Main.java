import model.Funcionario;
import model.Pessoa;
import model.Professor;
import model.Tecnico;

void main(){

    Funcionario funcionario = new Professor(
            "111.111.111-01", "João",
            12345l, 2000, "POO",
            "Doutorado em Computação"
            );
    Funcionario funcionario1 = new Tecnico(
            "222.222.222-02", "Maria",
            654321l, 2000,
            "Laboratório de Química");

    System.out.println(funcionario.calcularPagamento());
    System.out.println(funcionario1.calcularPagamento());

}
