// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Faculdade{
    private int num;
    private String nome;
    private String rua;
    private boolean matriculaConfirmada;
    
    // Construtor default
    public Faculdade(){
        num = 0;
        nome = "";
        rua = "";
        matriculaConfirmada = false;
    }
    
    // Construtor sobrecarregado
    public Faculdade(int num, String nome, String rua, boolean matriculaConfirmada){
        this.num = num;
        this.nome = nome;
        this.rua = rua;
        this.matriculaConfirmada = matriculaConfirmada;
    }
    
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRua(){
        return rua;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public boolean isMatriculaConfirmada(){
        return matriculaConfirmada;
    }
    
    public void confirmarMatriculaEstudante(Estudante e){
        if (e.getFaculdadeMatriculada().equalsIgnoreCase(this.getNome())){
            matriculaConfirmada = true;
        } else {
            matriculaConfirmada = false;
        }
    }
}
