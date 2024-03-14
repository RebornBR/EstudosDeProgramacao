package SintaxeBasica;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DesafioOrganizandoAtivos {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  ArrayList < String > ativos = new ArrayList < > (); // cria uma array chamado ativos

    //Entrada dos tipos de ativos
    System.out.println("Número de ativos");
    int quantidadeAtivos = scanner.nextInt(); // quantidadedeAtivos, utilizado para fazer o controle do tamanho do array

    // Entrada dos códigos dos ativos
    System.out.println("Digite o nome dos ativos(1 por vez e aperte enter):");
    for (int i = 0; i <= quantidadeAtivos; i++) { //enquanto i for menor que quantidadeAtivos, salvamos o ativo no array com .add
        String codigoAtivo = scanner.nextLine();//para usuário digitar o nome do ativo
        ativos.add(codigoAtivo); //adiciona o valor da variavel codigoAtivo, ao array ativo.
      }

ativos.sort(null);// ordena o array por ordem alfabetica, null == compara se é nulo.

System.out.println("\nAtivos cadastrados, em ordem alfabetica:");
for( String ativosCadastrados : ativos){
        System.out.println(ativosCadastrados); // IMPRIME cada ativo das posições do array
}


    }
}
