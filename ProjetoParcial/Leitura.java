// Nome: Joao Pedro Dias Elero - RA: 2706431
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Date;

public class Leitura{
	
	private static Leitura leitUnic; //1º Passo
	
	private Leitura(){} //2º passo
	
	//Metodo Singleton:
	
	public static Leitura gerarLeitura(){ //3º Passo
		
		if(leitUnic == null){
			leitUnic = new Leitura();
		}
		return leitUnic;
		
	}
	
        

	public String entDados(String rotulo){
		System.out.println(rotulo);
		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader bufTec = new BufferedReader(teclado);
		String ret = "";
		try{
			ret = bufTec.readLine();
		}
		catch(IOException ioe){
			System.out.println("ERRO de JVM ou RAM");
		}
			
		return ret;
	}
        
        // metodo para realizar a entrada de numeros inteiros e validar entrada
        public int entInt(String rotulo){
        int valor = 0;
        boolean vai = true;
        while(vai){
            String linha = entDados(rotulo);
            try{
                valor = Integer.parseInt(linha.trim());
                vai = false;
            }
            catch(NumberFormatException nfe){
                System.out.println("O valor deve ser um inteiro. Tente novamente: ");
            }
        }
        return valor;
        }
        
        // metodo para realizar a entrada de data e validar
        public GregorianCalendar entData(String rotulo){
            SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy"); // define o padrao de data
            sdfData.setLenient(false); // recusa data nao valida
            
            GregorianCalendar calendar = null;
            boolean vai = true;
            
            while(vai){
                String linha = entDados(rotulo);
                try{
                    Date d = sdfData.parse(linha.trim());
                    calendar = new GregorianCalendar();
                    calendar.setTime(d);
                    // zera atributos de hora
                    calendar.set(GregorianCalendar.HOUR_OF_DAY, 0);
                    calendar.set(GregorianCalendar.MINUTE, 0);
                    calendar.set(GregorianCalendar.SECOND, 0);
                    calendar.set(GregorianCalendar.MILLISECOND, 0);
                    vai = false;
                }
                catch(ParseException pe){
                    System.out.println("Formato invalido! Use dd/MM/yyyy (ex.: 31/12/2025).");
                }
            }
            return calendar;
        }
        
        // metodo para realizar a entrada de hora e validar
        public int[] entHora(String rotulo){
            SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm"); // define o padrao de hora
            sdfHora.setLenient(false); // recusa hora nao valida
            
            int[] horaMin = new int[2];
            boolean vai = true;
            
            while(vai){
                String linha = entDados(rotulo);
                try{
                    Date h = sdfHora.parse(linha.trim());
                    GregorianCalendar tmp = new GregorianCalendar();
                    tmp.setTime(h);
                    horaMin[0] = tmp.get(GregorianCalendar.HOUR_OF_DAY);
                    horaMin[1] = tmp.get(GregorianCalendar.MINUTE);
                    vai = false;
                }
                catch(ParseException pe){
                    System.out.println("Formato invalido! Use HH:mm (ex.: 14:30).");
                }
            }
            return horaMin;
        }
        
}
