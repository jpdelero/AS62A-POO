// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;

public class BDCoordenador{
    private Coordenador coo;
    private List<Coordenador> bdCoo;
    
    private static BDCoordenador coordenadorUnic;
    
    private BDCoordenador(){
        coo = new Coordenador();
        bdCoo = new ArrayList<Coordenador>();
    }
    
    // MÉTODO SINGLETON
    public static BDCoordenador getCoordenadorUnic(){
        if(coordenadorUnic == null){
            coordenadorUnic = new BDCoordenador();
        }
        return coordenadorUnic;
    }
    
    public List<Coordenador> getBdCoo(){
        return bdCoo;
    }
    
    public Coordenador insereCoo(Coordenador coo){
        if(consultaCoo(coo) == null){
            bdCoo.add(coo);
            return coo;
        }
        else{
            return null;
        }
    }
    
    public Coordenador consultaCoo(Coordenador coo){
        for(int i = 0 ; i < bdCoo.size() ; i++){
            if(coo.getCpf() == bdCoo.get(i).getCpf()){
                return bdCoo.get(i);
            }
        }
        return null;
    }
    
    public Coordenador excluiCoo(Coordenador coo){
        Coordenador Coo1 = consultaCoo(coo);
        if(Coo1 != null){
            bdCoo.remove(Coo1);
            return null;
        }
        else{
            return coo;
        }
    }
    
    public Coordenador alteraCoo(Coordenador coo){
        for(int i = 0 ; i < bdCoo.size() ; i++){
            if(coo.getCpf() == bdCoo.get(i).getCpf()){
                return bdCoo.get(i);
            }
        }
        return null;
    }
}
