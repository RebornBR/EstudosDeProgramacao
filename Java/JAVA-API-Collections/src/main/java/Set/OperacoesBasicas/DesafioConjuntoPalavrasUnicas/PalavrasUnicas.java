package main.java.Set.OperacoesBasicas.DesafioConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public PalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavraUnica){
        this.palavrasUnicasSet.add(palavraUnica);
    }
    
    /**
     * verifica se nosso HashSet(palavrasUnicasSet) está vazio.
     * <h3>Verifica se existe a String, palavra que virá com o parametro 
     * palavraParaRemover na HashSet(palavrasUnicasSet) com o comando contains 
     * e passamos esse parametro palavraParaRemover<h3>
     * se existir, com o comanndo remove, removemos esse String, palavra, da nossa HashSet
     * palavrasUnicasSet, se não existir exibe "Palavra não encontrada no conjunto"
     * @param palavraParaRemover
     */
    public void removerPalavra(String palavraParaRemover){
        String removerPalavra = null;
        if(!palavrasUnicasSet.isEmpty()){

        if(palavrasUnicasSet.contains(palavraParaRemover)){
            palavrasUnicasSet.remove(palavraParaRemover);
        }else{
            System.out.println("Palavra não encontrada no conjunto");
        }
        }else{
            System.out.println("Lista vazia: ");
        }
    }

    /**
     * verificamos se nossa Palavra passada atraves do parametro palavraVerificando 
     * existe no nosso HashSet(palavrasUnicasSet) com o comando contains, esse comando
     * retornar um boolean, e utilizamos esse retorno para devolver uma mensagem
     * se a palavra foi encontrada ou não.
     * <H1>Outra Forma<H1>
     * <h3>  
     * public boolean verificarPalavra(String palavra) {
       return palavrasUnicasSet.contains(palavra); } 
        <h3>
        retorna apenas se é true ou false
     * @param palavraVerificando 
     */
    public void verificarPalavra(String palavraVerificando){
        if(palavrasUnicasSet.contains(palavraVerificando) == true){
        System.out.println("Palavra encontrada no conjunto");
        }else{
            System.out.println("Palavra não encontrada");
        }      
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicasSet.isEmpty()){
        System.out.println("Palavras inseridas: " + palavrasUnicasSet);
        }else{
            System.out.println("Lista vazia: ");
        }
    }
}
