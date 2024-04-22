package com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1;

import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1.model.CoinGeckoApi;
import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1.model.LivroGoogleApi;
import com.alura.curso4ConsumindoAPItratamentoDeErro.Desafios.Desafio1.model.TheMealDbApi;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
       /**
        String nomeLivro;
        System.out.println("Digite o livro que deseja procurar:");
        nomeLivro = scanner.nextLine();
        nomeLivro = nomeLivro.replace(" ", "+");
        LivroGoogleApi livroGoogleApi = new LivroGoogleApi();
        livroGoogleApi.procurarLivro(nomeLivro);
        **/

       /**
        CoinGeckoApi coinGeckoApi = new CoinGeckoApi();
        String nomeCripto;
        System.out.println("Digite o nome da cripto moeda:");
        nomeCripto = scanner.nextLine();
        coinGeckoApi.informacoesCriptoMoeda(nomeCripto);
        **/

       /**
        TheMealDbApi theMealDbApi = new TheMealDbApi();
        String nomeReceita;
        System.out.println("Digite o ingrediente ou receite em inglês");
        nomeReceita = scanner.nextLine();
        theMealDbApi.procurarReceita(nomeReceita);
        **/
    }
}
