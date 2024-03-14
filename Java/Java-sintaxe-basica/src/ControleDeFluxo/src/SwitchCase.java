import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Tamanho da sua camisa, digite 'P' para pequeno, 'M' para médio e 'G' para grande. ");
    String sigla = scanner.nextLine();

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;  // break: sai do bloco de código em que ele está;
		}
		case "M":{
			System.out.println("MÉDIO");
			break; // break: sai do bloco de código em que ele está;
		}
		case "G":{
			System.out.println("GRANDE");
			break; // break: sai do bloco de código em que ele está;
		}
		default: //default: executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;
			System.out.println("INDEFINIDO");
		}    
    /*
    Código em if:

    if(sigla == "P"){System.out.println("PEQUENO");}
		else if(sigla == "M") {System.out.println("MÉDIO");}
		else if(sigla == "G") {System.out.println("GRANDE");}
		else {System.out.println("INDEFINIDO");}
        
     */    

     System.out.println("Escolha seu plano, digite 'B', 'M' ou 'T' ");
     String plano = scanner.nextLine();

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
                break; // break: sai do bloco de código em que ele está;
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
                break; // break: sai do bloco de código em que ele está;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break; // break: sai do bloco de código em que ele está;
			}
            default: //default: executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;
            System.out.println("é necessário escolher um plano, digite B, M ou T"); 
        }
    /*
    Código em if:
    
    if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
     */    

   }
}
