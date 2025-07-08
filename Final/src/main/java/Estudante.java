// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Estudante extends Pessoa{
    private String faculdadeMatriculada;
    private int semestre;
    
    // Construtor default
    public Estudante(){
        super();
        faculdadeMatriculada = "";
        semestre = 0;
    }
    
    // Construtor sobrecarregado
    public Estudante(String nome, int cpf, String faculdadeMatriculada, int semestre){
        super(nome, cpf);
        this.faculdadeMatriculada = faculdadeMatriculada;
        this.semestre = semestre;
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
}
