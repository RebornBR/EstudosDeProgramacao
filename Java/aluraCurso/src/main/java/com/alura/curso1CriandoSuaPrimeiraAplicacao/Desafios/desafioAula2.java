package com.alura.curso1CriandoSuaPrimeiraAplicacao.Desafios;

public class desafioAula2 {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 2.5;
        double media = (nota1 + nota2)/2;
        double variavelDouble = 2.333;
        int casting = (int) (variavelDouble);
        char varChar = 'O';
        String varString = "ibama";
        double precoProduto = 10;
        int qtdProdutos = 30;
        double totalCompra = precoProduto * qtdProdutos ;
        double valorDolarParaReal = 4.94;
        double qtdDolares= 10;
        double valorQtdDolaresEmReal = qtdDolares * valorDolarParaReal;
        String resultado = """
                Media: %f
                
                valor casting double para int: %d
                
                Concatenação char e String: %s %s
               
                Total compra = %f
                
                Valor dolar em real: %f
                
                """.formatted(media, casting, varChar, varString, totalCompra, valorQtdDolaresEmReal);
        System.out.println(resultado);
        System.out.println("-------------------------------------------------");
        double precoOriginal= 300.0;
        double percentualDesconto = 20.0;
        double desconto = (precoOriginal / 100) * percentualDesconto;
        double precoComDesconto = precoOriginal - desconto;
        System.out.println("""
                preço original do produto: R$ %f 
                desconto: R$ %f
                preço com desconto: R$ %f
                """.formatted(precoOriginal, desconto, precoComDesconto));
    }
}
