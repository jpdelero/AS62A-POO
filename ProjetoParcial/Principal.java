// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Principal{
    private Leitura l = Leitura.gerarLeitura();
    
    private List<Estudante> bdEstudante = new ArrayList<Estudante>();
    private List<Motorista> bdMotorista = new ArrayList<Motorista>();
    private List<Coordenador> bdCoordenador = new ArrayList<Coordenador>();
    private List<Faculdade> bdFaculdade = new ArrayList<Faculdade>();
    private List<Veiculo> bdVeiculo = new ArrayList<Veiculo>();
    private List<Rota> bdRota = new ArrayList<Rota>();
    
    public static void main(String arg[]){
        new Principal().exibirMenu();
    }
    
    public void exibirMenu(){
        boolean vai = true;
        int op = 0;
        
        while(vai){
            System.out.println("\nMenu Principal");
            System.out.println("1 - Cadastrar Estudante");
            System.out.println("2 - Cadastrar Motorista");
            System.out.println("3 - Cadastrar Coordenador");
            System.out.println("4 - Cadastrar Faculdade");
            System.out.println("5 - Cadastrar Veiculo");
            System.out.println("6 - Cadastrar Rota");
            System.out.println("7 - Listar Entidades");
            System.out.println("8 - Buscar Rota");
            System.out.println("9 - Agendar Horario");
            System.out.println("0 - Sair");
            
            op = l.entInt("\nEscolha uma opcao: ");
            
            switch(op){
                case 1:
                    cadastrarEstudante();
                    break;
                case 2:
                    cadastrarMotorista();
                    break;
                case 3:
                    cadastrarCoordenador();
                    break;
                case 4:
                    cadastrarFaculdade();
                    break;
                case 5:
                    cadastrarVeiculo();
                    break;
                case 6:
                    cadastrarRota();
                    break;
                case 7:
                    listarEntidades();
                    break;
                case 8:
                    buscarRota();
                    break;
                case 9:
                    agendarHorario();
                    break;
                case 0:
                    String resp = l.entDados("\nDeseja realmente sair do sistema? <s/n> ");
                    if(resp.equalsIgnoreCase("s")){
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("\nOpcao invalida.");
            }
        }
    }
    
    public void cadastrarEstudante(){
        Estudante e = new Estudante();
        
        System.out.println("\nCadastrar Estudante");
        e.setNome(l.entDados("Nome: "));
        e.setCpf(l.entInt("CPF: "));
        e.setFaculdadeMatriculada(l.entDados("Faculdade Matriculada: "));
        e.setSemestre(l.entInt("Semestre: "));
        
        e.registrar();
        bdEstudante.add(e);
    }
    
    public void cadastrarMotorista(){
        Motorista m = new Motorista();
        
        System.out.println("\nCadastrar Motorista");
        m.setNome(l.entDados("Nome: "));
        m.setCpf(l.entInt("CPF: "));
        m.setCnh(l.entInt("CNH: "));
        
        GregorianCalendar dataAdmissao = l.entData("Data de Admissao (dd/MM/yyyy): ");
        m.setDataAdmissao(dataAdmissao);
        
        m.registrar();
        bdMotorista.add(m);
    }
    
    public void cadastrarCoordenador(){
        Coordenador c = new Coordenador();
        
        System.out.println("\nCadastrar Coordenador");
        c.setNome(l.entDados("Nome: "));
        c.setCpf(l.entInt("CPF: "));
        c.setSetorResponsavel(l.entDados("Setor Responsavel: "));
        c.setEmailContato(l.entDados("Email Contato: "));
        
        c.registrar();
        bdCoordenador.add(c);
    }
    
    public void cadastrarFaculdade(){
        Faculdade f = new Faculdade();
        
        System.out.println("\nCadastrar Faculdade");
        f.setNome(l.entDados("Nome: "));
        f.setEndereco(l.entDados("Endereco: "));
        
        f.registrar();
        bdFaculdade.add(f);
    }
    
    public void cadastrarVeiculo(){
        Veiculo v = new Veiculo();
        
        System.out.println("\nCadastrar Veiculo");
        v.setPlaca(l.entDados("Placa: "));
        v.setModelo(l.entDados("Modelo: "));
        
        v.registrar();
        bdVeiculo.add(v);
    }
    
    public void cadastrarRota(){
        Rota r = new Rota();
        
        System.out.println("\nCadastrar Rota");
        r.setId(l.entInt("ID: "));
        r.setDestino(l.entDados("Destino: "));
        
        int[] horaMinSaida = l.entHora("Horario de Saida (HH:mm):");
        GregorianCalendar gcSaida = new GregorianCalendar();
        gcSaida.set(GregorianCalendar.HOUR_OF_DAY, horaMinSaida[0]);
        gcSaida.set(GregorianCalendar.MINUTE, horaMinSaida[1]);
        gcSaida.set(GregorianCalendar.SECOND, 0);
        gcSaida.set(GregorianCalendar.MILLISECOND, 0);
        r.setHorarioSaida(gcSaida);
        
        int[] horaMinChegada = l.entHora("Horario de Chegada (HH:mm):");
        GregorianCalendar gcChegada = new GregorianCalendar();
        gcChegada.set(GregorianCalendar.HOUR_OF_DAY, horaMinChegada[0]);
        gcChegada.set(GregorianCalendar.MINUTE, horaMinChegada[1]);
        gcChegada.set(GregorianCalendar.SECOND, 0);
        gcChegada.set(GregorianCalendar.MILLISECOND, 0);
        r.setHorarioSaida(gcChegada);
        
        r.registrar();
        bdRota.add(r);
        
        String resp = l.entDados("Deseja adicionar parada? <s/n> ");
        while (resp.equalsIgnoreCase("s")){
            String nomeParada = l.entDados("Nome da Parada: ");
            String usaHorario = l.entDados("Informar horario para esta parada? <s/n> ");
            
            if (usaHorario.equalsIgnoreCase("s")){
                int[] horaMinParada = l.entHora("Horario da Parada (HH:mm): ");
                GregorianCalendar gcParada = new GregorianCalendar();
                gcParada.set(GregorianCalendar.HOUR_OF_DAY, horaMinParada[0]);
                gcParada.set(GregorianCalendar.MINUTE, horaMinParada[1]);
                gcParada.set(GregorianCalendar.SECOND, 0);
                gcParada.set(GregorianCalendar.MILLISECOND, 0);
                
                r.adicionarParada(nomeParada, gcParada);
            } else{
                r.adicionarParada(nomeParada);
            }
            resp = l.entDados("Adicionar outra parada? <s/n> ");
        }
    }
    
    public void listarEntidades(){
        System.out.println("\nListar todos estudantes utilizando reflexividade");
        for (Estudante e : bdEstudante){
            exibirReflection(e); //Reflexividade
        }
        
        System.out.println("\nListar todos motoristas");
        for (Motorista m : bdMotorista){
            m.impDados();
            
            if (!bdRota.isEmpty()){
                // pega a primeira rota da lista
                m.estaDisponivelParaRota(bdRota.get(0));
            } else {
                System.out.println("Nenhuma rota cadastrada para verificar disponibilidade.");
            }
        }
        
        System.out.println("\nListar todos coordenadores");
        for (Coordenador c : bdCoordenador){
            c.impDados();
        }
        
        System.out.println("\nListar todas faculdades");
        for (Faculdade f : bdFaculdade){
            f.impDados();
        }
        
        System.out.println("\nListar todos veiculos");
        for (Veiculo v : bdVeiculo){
            v.impDados();
        }
        
        System.out.println("\nListar todas rotas");
        for (Rota r : bdRota){
            r.impDados();
        }
    }
    
    public void buscarRota(){
        System.out.println("\nBuscar Rota por ID");
        int idBusca = l.entInt("Digite o ID da Rota: ");
        try{
            Rota rotaEncontrada = null;
            for(Rota r : bdRota){
                if(r.getId() == idBusca){
                    rotaEncontrada = r;
                    break;
                }
            }
            if(rotaEncontrada == null){
                throw new RotaInexistenteException("Rota com ID " + idBusca + " nao existe.");
            }
            rotaEncontrada.impDados();
        }
        catch(RotaInexistenteException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void agendarHorario(){
        System.out.println("\nAgendar Horario para Rota");
        int idAg = l.entInt("Digite o ID da Rota: ");
        
        try{
            Rota rotaParaAgendar = null;
            for(Rota r : bdRota){
                if(r.getId() == idAg){
                    rotaParaAgendar = r;
                    break;
                }
            }
            if(rotaParaAgendar == null){
                throw new RotaInexistenteException("Rota com ID " + idAg + " nao existe.");
            }
            
            int[] horaMin = l.entHora("Horario a agendar (HH:mm):");
            GregorianCalendar saida = rotaParaAgendar.getHorarioSaida();
            GregorianCalendar chegada = rotaParaAgendar.getHorarioChegada();
            
            GregorianCalendar gcAgendamento = new GregorianCalendar(
                saida.get(GregorianCalendar.YEAR),
                saida.get(GregorianCalendar.MONTH),
                saida.get(GregorianCalendar.DAY_OF_MONTH),
                horaMin[0],
                horaMin[1]
            );
            gcAgendamento.set(GregorianCalendar.SECOND, 0);
            gcAgendamento.set(GregorianCalendar.MILLISECOND, 0);
            
            if (gcAgendamento.compareTo(saida) <= 0 || gcAgendamento.compareTo(chegada) >= 0){
                throw new HorarioIndisponivelException(
                    "Horario indisponivel para esta rota. Deve estar estritamente entre " +
                    String.format("%02d:%02d", saida.get(GregorianCalendar.HOUR_OF_DAY), saida.get(GregorianCalendar.MINUTE)) +
                    " e " +
                    String.format("%02d:%02d", chegada.get(GregorianCalendar.HOUR_OF_DAY), chegada.get(GregorianCalendar.MINUTE)) +
                    "."
                );
            }
            
            System.out.println("Horario " +
                String.format("%02d:%02d", horaMin[0], horaMin[1]) +
                " agendado com sucesso para a Rota " + idAg + ".");
        }
        catch(RotaInexistenteException | HorarioIndisponivelException e){
            System.err.println(e.getMessage());
        }
    }
    
    //Reflexividade
    public void exibirReflection(Object obj){
        Class<?> clazz = obj.getClass();
        System.out.println("Classe: " + clazz.getSimpleName());
        
        var fields = clazz.getDeclaredFields();
        for(var field : fields){
            field.setAccessible(true); // permite acesso a atributos privados
            try{
                System.out.println("- " + field.getName() + ": " + field.get(obj));
            }
            catch (IllegalAccessException e){
                System.out.println("- " + field.getName() + ": [acesso negado]");
            }
        }
    }
    
}
