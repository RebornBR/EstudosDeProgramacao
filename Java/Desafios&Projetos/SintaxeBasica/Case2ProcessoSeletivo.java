package SintaxeBasica;
import java.util.concurrent.ThreadLocalRandom;

public class Case2ProcessoSeletivo {

/**
 * 
 * @return retorna um double aleatório entre 1500 e 2500.
 */    
static double SalarioDesejado(){
    return ThreadLocalRandom.current().nextDouble(1500, 2500);
}    

public static void main(String[] args) {
String candidatos[] = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
int candidatosSelecionados = 0;
int candidatosAnalisados = 0; //utilizado como INDICE do array
double salarioBase = 2000;

while(candidatosSelecionados < 5 && candidatosAnalisados <  candidatos.length){ // condição de execução do bloco abaixo, candidatos.lenght se refere ao tamnanho do array
    String candidatoEntrevistado = candidatos[candidatosAnalisados++]; // candidatosAnalisados é o indice do array, e será acrescido 1 sempre que a condiçõa acima for verdadeira
    double salarioPretendido = SalarioDesejado();
if (salarioBase < salarioPretendido){    
    System.out.println("O candidato(a) " + candidatoEntrevistado + " não foi aprovado, porque pediu um salário maior que o salário base. Ele pediu R$" + salarioPretendido);

}else {
    System.out.println("O candidato(a): " + candidatoEntrevistado + " foi aprovado, seu salário é de R$" + salarioPretendido);
    candidatosSelecionados++;
}
}
System.out.println("Total de novos empregados: " + candidatosSelecionados);
System.out.println("Total de candidatos entrevistados: " + candidatosAnalisados);




}   
    
}
