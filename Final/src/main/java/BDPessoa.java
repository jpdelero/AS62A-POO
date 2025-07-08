// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;

public class BDPessoa{
    private Pessoa pes;
    private List<Pessoa> bdPes;
    
    private static BDPessoa pessoaUnic;
    
    private BDPessoa(){
        pes = new Pessoa();
        bdPes = new ArrayList<Pessoa>();
    }
    
    // MÉTODO SINGLETON
    public static BDPessoa getPessoaUnic(){
        if(pessoaUnic == null){
            pessoaUnic = new BDPessoa();
        }
        return pessoaUnic;
    }
    
    public List<Pessoa> getBdPes(){
        return bdPes;
    }
    
    public Pessoa inserePes(Pessoa pes){
        if(consultaPes(pes) == null){
            bdPes.add(pes);
            return pes;
        }
        else{
            return null;
        }
    }
    
    public Pessoa consultaPes(Pessoa pes){
        for(int i = 0 ; i < bdPes.size() ; i++){
            if(pes.getCpf() == bdPes.get(i).getCpf()){
                return bdPes.get(i);
            }
        }
        return null;
    }
    
    public Pessoa excluiPes(Pessoa pes){
        Pessoa pes1 = consultaPes(pes);
        if(pes1 != null){
            bdPes.remove(pes1);
            return null;
        }
        else{
            return pes;
        }
    }
    
    public Pessoa alteraPes(Pessoa pes){
        for(int i = 0 ; i < bdPes.size() ; i++){
            if(pes.getCpf() == bdPes.get(i).getCpf()){
                return bdPes.get(i);
            }
        }
        return null;
    }
}
