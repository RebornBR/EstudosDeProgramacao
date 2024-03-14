package SintaxeBasica;
public class Case3ProcessoSeletivo {
    public static void main(String[] args) {
        String  candidatosSelecionados[] = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		//forma indexada
		//quando preciso do indice para complementar a lógica
		System.out.println("Imprimindo com a ordem de seleção pelo índice");

        int x=0;
		for(; x<candidatosSelecionados.length; ) {// enquanto x for menor que o tamanho de candidatosSelecionados.
			System.out.println((x+1)+ "° Candidato é " + candidatosSelecionados [x] ); //x+1 porque o array sempre começa no zero
            x++;
		}
		
		//forma abrevida
		//interação total sem precisar da posição ou indice
		System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
		
		for(String candidato: candidatosSelecionados) { // forEach
			System.out.println(candidato);
		}

    }
}
