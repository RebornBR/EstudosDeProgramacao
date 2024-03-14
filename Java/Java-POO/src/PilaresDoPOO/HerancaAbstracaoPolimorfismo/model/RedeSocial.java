package PilaresDoPOO.HerancaAbstracaoPolimorfismo.model;

public abstract class RedeSocial {
    public abstract void entrandoNaRedeSocial();
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
/* são métodos abstratos, pois sabemos que cada rede social
 executa essas funcionalidades de forma distinta, então cabe a elas definir
 oque as funções acima fazmem*/
protected void validarConexaoInternet(){ // acessado apenas pelas classes filhas 
                                         //somente as classes filhas sabem
//não precisa ser abstrato, pois toda rede social testa a conexão a internet de uma mesma maneira
        System.out.println("Testando conexão");
    }

    public void testandoHeranca(){
        System.out.println("Herança Testada");
/*como a outra classe está herdando(extends) essa classe pai 
 basta apenas chamar esse método no nosso main pela nossa classe filho 
*/
    }

}
