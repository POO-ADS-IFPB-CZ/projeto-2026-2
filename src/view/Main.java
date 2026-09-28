import model.Funcionario;
import model.Pessoa;
import model.Professor;
import model.Tecnico;

void main(){

    Pessoa pessoa = new Professor("111.111.111-01",
            "João", 123456l, 2000,
            "POO", "ADS");
    Funcionario funcionario = new Tecnico("222.222.222-02",
            "Maria", 1234l, 2000,
            "Biblioteca");

    if(funcionario instanceof Tecnico){
        System.out.println(((Tecnico) funcionario).getSetor());
    }


}
