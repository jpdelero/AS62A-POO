// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Estudante extends Pessoa implements Registravel{
    private String faculdadeMatriculada;
    private int semestre;
    
    public Estudante(){
        super();
        faculdadeMatriculada = "";
        semestre = 0;
    }
    
    public String getFaculdadeMatriculada(){
        return faculdadeMatriculada;
    }
    
    public void setFaculdadeMatriculada(String faculdadeMatriculada){
        this.faculdadeMatriculada = faculdadeMatriculada;
    }
    
    public int getSemestre(){
        return semestre;
    }
    
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    
    // equivalente ao agendar horario
    public void solicitarTransporte(Rota rota){
        System.out.println("Estudante " + this.getNome() + " solicitou transporte para a rota " + rota.getDestino());
    }
    
    @Override //Sobrescrita
    public void registrar(){
        System.out.println("\nRegistrando Estudante: " + getNome());
    }
    
    @Override //Sobrescrita
    public void impDados(){
        super.impDados();
        System.out.println("Faculdade: " + getFaculdadeMatriculada());
        System.out.println("Semestre: " + getSemestre());
    }
}
