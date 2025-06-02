// Nome: Joao Pedro Dias Elero - RA: 2706431
// trata situacao especifica de erro do sistema: horario fora do intervalo permitido
public class HorarioIndisponivelException extends Exception {
    public HorarioIndisponivelException(String msg) {
        super(msg);
    }
}
