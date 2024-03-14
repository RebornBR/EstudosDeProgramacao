package PilaresDoPOO.Encapsulamento;

public class MSNMessenger {
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
// o método/função enviarMensagem() terá acesso ao resultado e função do método validarConectadoInternet()

		System.out.println("Enviando mensagem");
		
//depois de enviada, salva o histórico da mensagem
// o método/função enviarMensagem() terá acesso ao resultado e função do método salvarHistoricoMensagem(); 

		salvarHistoricoMensagem();
		
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem(); 
// o método receberMensagem() terá acesso ao resultado e função do método salvarHistoricoMensagem(); 

	}
	
//métodos privadas, visíveis somente na classe
// Pilar do encapsulamento, o usuário ou outras classes, não precisam ter conhecimento
//ou saber como os metodos/funções abaixo, funcionam
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}