package PilaresDoPOO.Encapsulamento;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger usuario = new MSNMessenger();
		usuario.enviarMensagem();
		usuario.receberMensagem();
	}
}
