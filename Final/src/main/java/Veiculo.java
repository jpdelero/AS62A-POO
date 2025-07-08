// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Veiculo{
    private int placa;
    private String modelo;
    
    // Construtor default
    public Veiculo(){
        placa = 0;
        modelo = "";
    }
    
    // Construtor sobrecarregado
    public Veiculo(int placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
    }
    
    public int getPlaca(){
        return placa;
    }
    
    public void setPlaca(int placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public boolean estaDisponivel(){
        return true; // sempre disponível por simplicidade
    }
}
