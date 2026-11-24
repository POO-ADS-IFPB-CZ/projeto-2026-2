package exceptions;

public class LimiteExcedidoException
        extends Exception{

    public LimiteExcedidoException(String mensagem){
        super(mensagem);
    }

}