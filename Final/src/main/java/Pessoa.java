// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Pessoa{
    private String nome;
    private int cpf;
    
    // Construtor default
    public Pessoa(){
        nome = "";
        cpf  = 0;
    }
    
    // Construtor sobrecarregado
    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
}
