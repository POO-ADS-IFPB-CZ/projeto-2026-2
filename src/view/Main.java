import model.Assalariado;
import model.Comissionado;
import model.Empresa;
import model.Funcionario;

void main(){
    Funcionario funcionarios[] = {
        new Assalariado("111.111.111-01", "João",
                2000),
        new Assalariado("222.222.222-02", "Maria",
                3000),
        new Comissionado("333.333.333-03", "José",
                10000, 10)
    };
    Empresa empresa = new Empresa("11.111.111/0001-01",
            "Empresa A", funcionarios);
    System.out.println(empresa.calcularFolha());
}