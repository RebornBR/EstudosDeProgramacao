package Enum;

public enum EstadosBrasileiro {
    SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;
//podemos colocar o restante dos estados

	private String nome;
	private String sigla;
private EstadosBrasileiro(String sigla, String nome){
    this.sigla = sigla;
    this.nome = nome;
}
public String getSigla() {
    return sigla;
}
public String getNome() {
    return nome;
}

}
