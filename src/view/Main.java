import model.Aluno;
import model.Pessoa;
import model.Professor;

void main(){

    Pessoa pessoa = new Professor("111.111.111-01",
            "João", 123456l, "POO",
            "Ciência da Computação");

    Pessoa pessoa1 = new Aluno("222.222.222", "Maria",
            202012010001l, "ADS");

    if(pessoa instanceof Professor){
        System.out.println("É um professor");
    }
    if(pessoa instanceof Aluno){
        System.out.println("É um aluno");
    }

}
