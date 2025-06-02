// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Pessoa{
    private String nome;
    private int cpf;
    
    public Pessoa(){
        nome = "";
        cpf  = 0;
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
    
    public void impDados(){
        System.out.println("\nDados: ");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    }
}
