// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Coordenador extends Pessoa implements Registravel{
    private String setorResponsavel;
    private String emailContato;
    
    public Coordenador(){
        super();
        setorResponsavel = "";
        emailContato = "";
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
    
    // possivel implementacao para entrega final, no futuro poderia mudar status da rota
    public void aprovarRota(Rota rota){
        System.out.println("Coordenador " + this.getNome() + " aprovou a rota para " + rota.getDestino());
    }
    
    @Override //Sobrescrita
    public void registrar(){
        System.out.println("\nRegistrando Coordenador: " + getNome());
    }
    
    @Override //Sobrescrita
    public void impDados(){
        super.impDados();
        System.out.println("Setor Responsavel: " + getSetorResponsavel());
        System.out.println("Email Contato: " + getEmailContato());
    }
}
