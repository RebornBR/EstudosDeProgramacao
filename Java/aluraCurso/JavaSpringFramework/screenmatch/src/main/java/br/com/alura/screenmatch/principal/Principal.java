package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.services.ConsumoApi;
import br.com.alura.screenmatch.services.ConverteDados;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    /**Consome os métodos da classe ConsumoApi e ConverteDados, retornado o resultado da api do omdb**/
    public void exibeMenu() throws IOException, InterruptedException {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println("Imprimindo dadosSerie");
        System.out.println(dados);
        System.out.println("================================================================================================================================================================================================================================================");

        List<DadosTemporada> temporadas = new ArrayList<>(); // List temporadas

        for (int i = 1; i<=dados.totalTemporadas(); i++){
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") +"&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        System.out.println("Imprimindo dadosTemporada, episodios e seus titulos: com forEach Lambda");
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo()))); // Para cada temporada pegamos seus episodios e imprimimos os titulos de cada um
        System.out.println("================================================================================================================================================================================================================================================");
//        for(int i = 0; i < dados.totalTemporadas(); i++){
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for(int j = 0; j< episodiosTemporada.size(); j++){
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }
        //temporadas.forEach(System.out::println);
        //temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo()))); // Para cada temporada pegamos seus episodios e imprimimos os titulos de cada um
        /*AS OPÇÕES AQUI FAZEM A MESMA COISA DO for (FOR EACH) ACIMA, MAS DE FORMA MAIS LIMPA, UTILIZANDO LAMBDAS*/

        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList()); //coletar os elementos da stream em uma coleção ou em outro tipo de dado e esse novo dado será retornado // podemos usar apenas o toList(), mas será uma lista imutável, ou seja, não será possivel adicionar mais elementos depois

        System.out.println("\nTop 5 episódios");
        dadosEpisodios.stream() // método stream
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);
        System.out.println("====================================================================================================================================================================================================================================================");


//        System.out.println("\nTop 10 episódios");
//        dadosEpisodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))// pegamos o episodio(e.avaliação) e verificamos se é igual a "N/A" ignoramos a case, equalsIgnoraCase
//                .peek(e -> System.out.println("Primeiro filtro(N/A) " +  e)) // exibe oq ocorreu apos a alteração anterior
//                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed()) // reversed, exibe na ordem decrescente
//                .peek(e -> System.out.println("Ordenação " +  e)) // exibe oq ocorreu apos a alteração anterior
//                .limit(10)
//                .peek(e -> System.out.println("Limite " +  e)) // exibe oq ocorreu apos a alteração anterior
//                .map(e -> e.titulo().toUpperCase()) // transforma cada elemento da stream em outro tipo de dado e ele sera retornado, ou seja, estamos transformado todos os e.titulo em e.titulo com letras MAIUSCULAS
//                .peek(e -> System.out.println("Mapeamento " +  e)) // exibe oq ocorreu apos a alteração anterior
//                .forEach(System.out::println);

        System.out.println("Imprimindo com a classe episodio:");
        List<Episodio> episodios = temporadas.stream()/*Stream<DadosTemporada> criamos uma list<Episodio> que recebe o ArrayList temporadas que sera seu temporadas.stream*/
                .flatMap(t -> t.episodios().stream() // da nossa temporada, pegamos sua list de episodios e fazemos o stream
                        .map(d -> new Episodio(t.numero(), d)))/*Stream<Episodios> criamos com o map uma nova Lista que Pega os episodios(dadosEpisodios) de temporada e cria um novo episodio que recebe o numero da temporada e os dadosEpisodios dela*/
                .collect(Collectors.toList());  //Agora coletamos a lista criada pelo map; //podemos usar apenas o toList(), mas será uma lista imutável, ou seja, não será possivel adicionar mais elementos depois
        episodios.forEach(System.out::println); // faz um for each de episodios
        System.out.println("====================================================================================================================================================================================================================================================");

//        System.out.println("Digite um trecho do título do episódio");
//        var trechoTitulo = leitura.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream() // Optional é um container que vai manter os dados, o optional tbm indica que esse container pode ou não ter dados
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))// filtramos para encontrar o titulo que contenha nosso trecho e usamos o toUpperCase tanto no titulo quanto no trecho que queremos, para torna a busca mais acertiva
//                .findFirst();
//        if(episodioBuscado.isPresent()){ // verifica se o optional episodioBuscado está presente, se tem, mas podemos usar e é indicado o uso do get
//            System.out.println("Episódio encontrado!");
//            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
//        } else {
//            System.out.println("Episódio não encontrado!");
//        }

        System.out.println("A partir de que ano você deseja ver os episódios? ");
        var ano = leitura.nextInt();
        leitura.nextLine();

        LocalDate dataBusca = LocalDate.of(ano, 1, 1); // criando um LocalDate com o ano digitado pelo usuadrio

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // faz formataçao para o nosso modelo de data dia/mes/ano

        episodios.stream()
                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
                .forEach(e -> System.out.println(
                        "Temporada:  " + e.getTemporada() +
                                " Episódio: " + e.getTitulo() +
                                " Data lançamento: " + e.getDataLancamento().format(formatador)
                ));
        System.out.println("====================================================================================================================================================================================================================================================");

        System.out.println("Exibindo temporada e sua media de nota com base nos episodios: ");
        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0) // filtramos, ou seja, pegamos apenas as avaliações que forem maiores que 0
                .collect(Collectors.groupingBy(Episodio::getTemporada, Collectors.averagingDouble(Episodio::getAvaliacao))); // averagingDouble faz a media de episodios pelo getAvaliaçao
        System.out.println(avaliacoesPorTemporada);
        System.out.println("====================================================================================================================================================================================================================================================");

        System.out.println("Usando class DoubleSummaryStatistics: ");
        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));// retorna as estatiticas utilizando o episodio.getAvaliação
        System.out.println("retornando a DoubleSummaryStatistics est completa ");
        System.out.println(est);
        System.out.println("====================================================================================================================================================================================================================================================");
        System.out.println("retornando a DoubleSummaryStatistics est partes especificas ");
        System.out.println("Média: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " + est.getCount());
    }
}
