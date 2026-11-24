import exceptions.LimiteExcedidoException;
import exceptions.SaldoInsuficienteException;
import model.ContaCorrente;

void main() {

    // supor que há caixa eletronico
    ContaCorrente contaCorrente = new ContaCorrente(1,
            "João", 10000, 5000);
    try{
        contaCorrente.sacar(10000);
    }catch (SaldoInsuficienteException ex){
        System.out.println(ex.getMessage());
    }catch (LimiteExcedidoException ex){
        System.out.println(ex.getMessage());
    }

}