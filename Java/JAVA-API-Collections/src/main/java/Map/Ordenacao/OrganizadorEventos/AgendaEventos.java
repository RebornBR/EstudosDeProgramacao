package main.java.Map.Ordenacao.OrganizadorEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  //Chave do map é LocalDate e o Evento é seu valor.
     private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
    eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
  }

/**
 * <h3>criamos um TreeMap e nosso TreeMap recebe eventosMap e o organiza esse map de forma natural, isto é, crescente.
 * <h3>
 */
  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) { // criamos um mapa que sera um Entry que terá LocalDate(chave) e Evento(valor) será chamado entry e fará um set com o entrySet no nosso TreeMap(EventosTreeMap)
      LocalDate dataEvento = entry.getKey(); //obtem a chave do nosso entrySet(eventosTreeMap)
      Evento evento = entry.getValue(); // obtem o valor do nosso entrySet(eventosTreeMap)
      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
    }
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now(); //LocalDate.now() retorna a data atual do sistema
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    /*
     * Método Entry, com método entrySet retorna um set com objetos do tipo Map.Entry(com isso retornamos tanto a chave como o seu valor), LocalDate(chave) Evento(valor) do nosso HashMap(eventosMap)
     */
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
        /*verifica se dataEvento é igual a nossa dataAtual ou se nossa dataEvento é depois da nossa dataAtual. Faz isso para cada elemento presente no nosso HashMap(eventosMap) que se tornou um entrySey, em outras palavaras, se tornou um set
         * se for, nosso proximaData recebe a nossa dataEvento(chave) e nosso proximoEvento recebe o valor(Evento) da nossa chave
         */
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    if (proximoEvento != null) {// se for diferente de nulo retorna a mensagem abaixo
      System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
    } else {
      System.out.println("Não há eventos futuros na agenda.");
    }
}
 public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // LocalDate.of é o método para adicionarmos a data.
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }
}
