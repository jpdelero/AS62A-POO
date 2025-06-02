// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.GregorianCalendar;

public class Rota implements Registravel{
    private int id;
    private String destino;
    private GregorianCalendar horarioSaida;
    private GregorianCalendar horarioChegada;
    
    public Rota(){
        id = 0;
        destino = "";
        horarioSaida = new GregorianCalendar();
        horarioChegada = new GregorianCalendar();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getDestino(){
        return destino;
    }
    
    public void setDestino(String destino){
        this.destino = destino;
    }
    
    public GregorianCalendar getHorarioSaida(){
        return horarioSaida;
    }
    
    public void setHorarioSaida(GregorianCalendar horarioSaida){
        this.horarioSaida = horarioSaida;
    }
    
    public GregorianCalendar getHorarioChegada(){
        return horarioChegada;
    }
    
    public void setHorarioChegada(GregorianCalendar horarioChegada){
        this.horarioChegada = horarioChegada;
    }
    
    public int calcularDuracaoEstimada(){
        long msSaida = horarioSaida.getTimeInMillis();
        long msChegada = horarioChegada.getTimeInMillis();
        long difMs = msChegada - msSaida;
        return (int) (difMs / (1000L * 60L));
    }
    
    //Sobrecarga
    public void adicionarParada(String parada){ // parada = ponto de onibus
        System.out.println("Parada adicionada: " + parada);
    }
    
    //Sobrecarga
    public void adicionarParada(String parada, GregorianCalendar horario){ // parada = ponto de onibus + data e horario
        int dia = horario.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = horario.get(GregorianCalendar.MONTH) + 1; // mes vai de 0 a 11
        int ano = horario.get(GregorianCalendar.YEAR);
        int hora = horario.get(GregorianCalendar.HOUR_OF_DAY);
        int minuto = horario.get(GregorianCalendar.MINUTE);
        String strHorario = String.format("%02d/%02d/%04d %02d:%02d", dia, mes, ano, hora, minuto);
        
        System.out.println("Parada adicionada: " + parada + " em " + strHorario);
    }
    
    @Override //Sobrescrita
    public void registrar(){
        int diaS = horarioSaida.get(GregorianCalendar.DAY_OF_MONTH);
        int mesS = horarioSaida.get(GregorianCalendar.MONTH) + 1;
        int anoS = horarioSaida.get(GregorianCalendar.YEAR);
        int horaS = horarioSaida.get(GregorianCalendar.HOUR_OF_DAY);
        int minS = horarioSaida.get(GregorianCalendar.MINUTE);
        String strSaida = String.format("%02d/%02d/%04d %02d:%02d", diaS, mesS, anoS, horaS, minS);
        
        int diaC  = horarioChegada.get(GregorianCalendar.DAY_OF_MONTH);
        int mesC  = horarioChegada.get(GregorianCalendar.MONTH) + 1;
        int anoC  = horarioChegada.get(GregorianCalendar.YEAR);
        int horaC = horarioChegada.get(GregorianCalendar.HOUR_OF_DAY);
        int minC  = horarioChegada.get(GregorianCalendar.MINUTE);
        String strChegada = String.format("%02d/%02d/%04d %02d:%02d", diaC, mesC, anoC, horaC, minC);
        
        System.out.println(
                "\nRegistrando Rota: \nID - " + getId() + "\nDestino - " + getDestino() +
                "\nSaida - " + strSaida + "\nChegada - " + strChegada
        );
    }
    
    public void impDados(){
        System.out.println("\nDados Rota: ");
        System.out.println("ID: " + getId());
        System.out.println("Destino: " + getDestino());
        
        int diaS = horarioSaida.get(GregorianCalendar.DAY_OF_MONTH);
        int mesS = horarioSaida.get(GregorianCalendar.MONTH) + 1;
        int anoS = horarioSaida.get(GregorianCalendar.YEAR);
        int horaS = horarioSaida.get(GregorianCalendar.HOUR_OF_DAY);
        int minS = horarioSaida.get(GregorianCalendar.MINUTE);
        System.out.println("Saida: " + String.format("%02d/%02d/%04d %02d:%02d", diaS, mesS, anoS, horaS, minS));
        
        int diaC  = horarioChegada.get(GregorianCalendar.DAY_OF_MONTH);
        int mesC  = horarioChegada.get(GregorianCalendar.MONTH) + 1;
        int anoC  = horarioChegada.get(GregorianCalendar.YEAR);
        int horaC = horarioChegada.get(GregorianCalendar.HOUR_OF_DAY);
        int minC  = horarioChegada.get(GregorianCalendar.MINUTE);
        System.out.println("Chegada: " + String.format("%02d/%02d/%04d %02d:%02d", diaC, mesC, anoC, horaC, minC));
        
        int duracao = calcularDuracaoEstimada();
        System.out.println("Duracao estimada: " + duracao + " minutos");
    }
}
