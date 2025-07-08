// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;

public class BDMotorista{
    private Motorista mot;
    private List<Motorista> bdMot;
    
    private static BDMotorista motoristaUnic;
    
    private BDMotorista(){
        mot = new Motorista();
        bdMot = new ArrayList<Motorista>();
    }
    
    // MÉTODO SINGLETON
    public static BDMotorista getMotoristaUnic(){
        if(motoristaUnic == null){
            motoristaUnic = new BDMotorista();
        }
        return motoristaUnic;
    }
    
    public List<Motorista> getBdMot(){
        return bdMot;
    }
    
    public Motorista insereMot(Motorista mot){
        if(consultaMot(mot) == null){
            bdMot.add(mot);
            return mot;
        }
        else{
            return null;
        }
    }
    
    public Motorista consultaMot(Motorista mot){
        for(int i = 0 ; i < bdMot.size() ; i++){
            if(mot.getCpf() == bdMot.get(i).getCpf()){
                return bdMot.get(i);
            }
        }
        return null;
    }
    
    public Motorista excluiMot(Motorista mot){
        Motorista Mot1 = consultaMot(mot);
        if(Mot1 != null){
            bdMot.remove(Mot1);
            return null;
        }
        else{
            return mot;
        }
    }
    
    public Motorista alteraMot(Motorista mot){
        for(int i = 0 ; i < bdMot.size() ; i++){
            if(mot.getCpf() == bdMot.get(i).getCpf()){
                return bdMot.get(i);
            }
        }
        return null;
    }
}
