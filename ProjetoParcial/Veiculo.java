// Nome: Joao Pedro Dias Elero - RA: 2706431
public class Veiculo implements Registravel{
    private String placa;
    private String modelo;
    
    public Veiculo(){
        String placa = "";
        String modelo = "";
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public boolean estaDisponivel(){
        System.out.println("Veiculo " + this.getPlaca() + " esta disponivel.");
        return true; // sempre disponivel por simplicidade
    }
    
    @Override //Sobrescrita
    public void registrar(){
        System.out.println("\nRegistrando Veiculo: " + getModelo() + " - " + getPlaca());
    }
    
    public void impDados(){
        System.out.println("\nDados Veiculo: ");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
    }
}
