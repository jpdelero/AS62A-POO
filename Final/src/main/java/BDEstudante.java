// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;

public class BDEstudante{
    private Estudante est;
    private List<Estudante> bdEst;
    
    private static BDEstudante estudanteUnic;
    
    private BDEstudante(){
        est = new Estudante();
        bdEst = new ArrayList<Estudante>();
    }
    
    // MÉTODO SINGLETON
    public static BDEstudante getEstudanteUnic(){
        if(estudanteUnic == null){
            estudanteUnic = new BDEstudante();
        }
        return estudanteUnic;
    }
    
    public List<Estudante> getBdEst(){
        return bdEst;
    }
    
    public Estudante insereEst(Estudante est){
        if(consultaEst(est) == null){
            bdEst.add(est);
            return est;
        }
        else{
            return null;
        }
    }
    
    public Estudante consultaEst(Estudante est){
        for(int i = 0 ; i < bdEst.size() ; i++){
            if(est.getCpf() == bdEst.get(i).getCpf()){
                return bdEst.get(i);
            }
        }
        return null;
    }
    
    public Estudante excluiEst(Estudante est){
        Estudante Est1 = consultaEst(est);
        if(Est1 != null){
            bdEst.remove(Est1);
            return null;
        }
        else{
            return est;
        }
    }
    
    public Estudante alteraEst(Estudante est){
        for(int i = 0 ; i < bdEst.size() ; i++){
            if(est.getCpf() == bdEst.get(i).getCpf()){
                return bdEst.get(i);
            }
        }
        return null;
    }
}
