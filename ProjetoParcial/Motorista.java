// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.GregorianCalendar;

public class Motorista extends Pessoa implements Registravel{
    private int cnh;
    private GregorianCalendar dataAdmissao;
    
    public Motorista(){
        super();
        int cnh = 0;
        dataAdmissao = new GregorianCalendar();
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
    
    public boolean estaDisponivelParaRota(Rota rota){
        System.out.println("Motorista " + this.getNome() + " esta disponivel para a rota " + rota.getId());
        return true; // sempre disponivel por simplicidade
    }
    
    @Override //Sobrescrita
    public void registrar(){
        int dia = dataAdmissao.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = dataAdmissao.get(GregorianCalendar.MONTH) + 1; // mes vai de 0 a 11
        int ano = dataAdmissao.get(GregorianCalendar.YEAR);
        
        System.out.println("\nRegistrando Motorista: " + getNome());
        System.out.println("Data de Admissao: " + String.format("%02d/%02d/%04d", dia, mes, ano));
    }
    
    @Override //Sobrescrita
    public void impDados(){
        super.impDados();
        System.out.println("CNH: " + getCnh());
        int dia = dataAdmissao.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = dataAdmissao.get(GregorianCalendar.MONTH) + 1; // mes vai de 0 a 11
        int ano = dataAdmissao.get(GregorianCalendar.YEAR);
        System.out.println("Data de Admissao: " + String.format("%02d/%02d/%04d", dia, mes, ano));
    }
}
