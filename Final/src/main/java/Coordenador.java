// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Coordenador extends Pessoa{
    private String setorResponsavel;
    private String emailContato;
    
    // Construtor default
    public Coordenador(){
        super();
        setorResponsavel = "";
        emailContato = "";
    }
    
    // Construtor sobrecarregado
    public Coordenador(String nome, int cpf, String setorResponsavel, String emailContato){
        super(nome, cpf);
        this.setorResponsavel = setorResponsavel;
        this.emailContato = emailContato;
    }
    
    public String getSetorResponsavel(){
        return setorResponsavel;
    }
    
    public void setSetorResponsavel(String setorResponsavel){
        this.setorResponsavel = setorResponsavel;
    }
    
    public String getEmailContato(){
        return emailContato;
    }
    
    public void setEmailContato(String emailContato){
        this.emailContato = emailContato;
    }
}
