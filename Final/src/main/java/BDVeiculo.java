// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;

public class BDVeiculo{
    private Veiculo vec;
    private List<Veiculo> bdVec;
    
    private static BDVeiculo veiculoUnic;
    
    private BDVeiculo(){
        vec = new Veiculo();
        bdVec = new ArrayList<Veiculo>();
    }
    
    // MÉTODO SINGLETON
    public static BDVeiculo getVeiculoUnic(){
        if(veiculoUnic == null){
            veiculoUnic = new BDVeiculo();
        }
        return veiculoUnic;
    }
    
    public List<Veiculo> getBdVec(){
        return bdVec;
    }
    
    public Veiculo insereVec(Veiculo vec){
        if(consultaVec(vec) == null){
            bdVec.add(vec);
            return vec;
        }
        else{
            return null;
        }
    }
    
    public Veiculo consultaVec(Veiculo vec){
        for(int i = 0 ; i < bdVec.size() ; i++){
            if(vec.getPlaca() == bdVec.get(i).getPlaca()){
                return bdVec.get(i);
            }
        }
        return null;
    }
    
    public Veiculo excluiVec(Veiculo vec){
        Veiculo vec1 = consultaVec(vec);
        if(vec1 != null){
            bdVec.remove(vec1);
            return null;
        }
        else{
            return vec;
        }
    }
    
    public Veiculo alteraVec(Veiculo vec){
        for(int i = 0 ; i < bdVec.size() ; i++){
            if(vec.getPlaca() == bdVec.get(i).getPlaca()){
                return bdVec.get(i);
            }
        }
        return null;
    }
}
