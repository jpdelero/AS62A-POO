// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.GregorianCalendar;

public class Motorista extends Pessoa{
    private int cnh;
    private GregorianCalendar dataAdmissao;
    private int disponivelParaRotaId;
    
    // Construtor default
    public Motorista(){
        super();
        cnh = 0;
        dataAdmissao = new GregorianCalendar();
        disponivelParaRotaId = 0;
    }
    
    // Construtor sobrecarregado
    public Motorista(String nome, int cpf, int cnh, GregorianCalendar dataAdmissao){
        super(nome, cpf);
        this.cnh = cnh;
        this.dataAdmissao = dataAdmissao;
        this.disponivelParaRotaId = disponivelParaRotaId;
    }
    
    public int getCnh(){
        return cnh;
    }
    
    public void setCnh(int cnh){
        this.cnh = cnh;
    }
    
    public GregorianCalendar getDataAdmissao(){
        return dataAdmissao;
    }
    
    public void setDataAdmissao(GregorianCalendar dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    
    public int getDisponivelParaRotaId(){
        return disponivelParaRotaId;
    }
    /*
    public boolean estaDisponivelParaRota(Rota rota){
        this.disponivelParaRotaId = rota.getId();
        return true; // sempre disponível por simplicidade
    }
    */
}
