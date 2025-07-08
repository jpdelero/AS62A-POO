// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;

public class BDFaculdade{
    private Faculdade fac;
    private List<Faculdade> bdFac;
    
    private static BDFaculdade faculdadeUnic;
    
    private BDFaculdade(){
        fac = new Faculdade();
        bdFac = new ArrayList<Faculdade>();
    }
    
    // MÉTODO SINGLETON
    public static BDFaculdade getFaculdadeUnic(){
        if(faculdadeUnic == null){
            faculdadeUnic = new BDFaculdade();
        }
        return faculdadeUnic;
    }
    
    public List<Faculdade> getBdFac(){
        return bdFac;
    }
    
    public Faculdade insereFac(Faculdade fac){
        if(consultaFac(fac) == null){
            bdFac.add(fac);
            return fac;
        }
        else{
            return null;
        }
    }
    
    public Faculdade consultaFac(Faculdade fac){
        for(int i = 0 ; i < bdFac.size() ; i++){
            if(fac.getNum() == bdFac.get(i).getNum()){
                return bdFac.get(i);
            }
        }
        return null;
    }
    
    public Faculdade excluiFac(Faculdade fac){
        Faculdade fac1 = consultaFac(fac);
        if(fac1 != null){
            bdFac.remove(fac1);
            return null;
        }
        else{
            return fac;
        }
    }
    
    public Faculdade alteraFac(Faculdade fac){
        for(int i = 0 ; i < bdFac.size() ; i++){
            if(fac.getNum() == bdFac.get(i).getNum()){
                return bdFac.get(i);
            }
        }
        return null;
    }
}
