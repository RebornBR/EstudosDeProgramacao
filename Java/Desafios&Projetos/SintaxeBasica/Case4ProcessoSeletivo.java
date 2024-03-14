package SintaxeBasica;
import java.util.Random;

public class Case4ProcessoSeletivo {
 public static void main(String[] args) {
    String  candidatosAprovados [] = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    boolean atender = false;

    for (String candidato : candidatosAprovados){
    tentativasAtender(candidato); //candidato, substitui o parametro ligandoParaCandidatoNome
  }  
 }

/**
 * 
 * @return retorna true se o número aleatorio entre 1 e 4 for 1
 */
static boolean pessoaAtendeu() {
return new Random().nextInt(4)==1;	
}

/**
 * Método que executa um bloco, enquanto a condição for false e as tentativas realizadas forem menores que 3.
 * 
 * @param ligandoParaCandidatoNome , nome parametro que será substituido pelo array, for each
 */
static void tentativasAtender(String ligandoParaCandidatoNome){
boolean atender = false; // inicialmente é falso
int tentativasRealizadas = 1;
do{
atender = pessoaAtendeu(); // atender recebe o metodo pessoaAtendeu(), que retornará true, quando o número aleatório entre 0 e 3 for 1
     if(atender == true){
    System.out.println("Conseguimos contato com o candidato " + ligandoParaCandidatoNome);
}else{
tentativasRealizadas++; // soma 1 sempre que atender for false
}

} while(atender == false && tentativasRealizadas < 3);// enquanto atender for igual a false && tentativas realizadas menores que 3, executará o bloco acima

      if(atender == true){// assim que, atender, que recebe o booleano do método pessoaAtendeu() for true exibira mensagem abaixo
    System.out.println("O candidato: " + ligandoParaCandidatoNome + " atendeu após " + tentativasRealizadas + " tentativas.");
}else{
    System.out.println("Não conseguimos contato com o candidato " + ligandoParaCandidatoNome + ", Número de tentativas realizadas: " + tentativasRealizadas);//exibida, se atingirmos 3 tentativas, ou seja, se o atender for false.
}

}

}
