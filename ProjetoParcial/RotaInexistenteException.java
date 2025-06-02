// Nome: Joao Pedro Dias Elero - RA: 2706431
// trata situacao especifica de erro do sistema: o id informado nao corresponde a uma rota
public class RotaInexistenteException extends Exception {
    public RotaInexistenteException(String msg) {
        super(msg);
    }
}
