// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Faculdade implements Registravel{
    private String nome;
    private String endereco;
    
    public Faculdade(){
        String nome = "";
        String endereco = "";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void confirmarMatriculaEstudante(Estudante e){
        if (e.getFaculdadeMatriculada().equalsIgnoreCase(this.getNome())){
            System.out.println("Faculdade " + this.getNome() + " confirmou matrícula de " + e.getNome());
        }else{
            System.out.println("Estudante " + e.getNome() + " não está matriculado nesta faculdade.");
        }
    }
    
    @Override //Sobrescrita
    public void registrar(){
        System.out.println("\nRegistrando Faculdade: " + getNome());
    }
    
    public void impDados(){
        System.out.println("\nDados Faculdade: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
    }
}
