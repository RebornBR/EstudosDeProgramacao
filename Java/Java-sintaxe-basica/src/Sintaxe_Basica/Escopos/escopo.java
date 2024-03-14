package Sintaxe_Basica.Escopos;

public class escopo {
    //variavel da classe conta
double saldo=10.0; // variavel declarada dentro da classe, ou seja ela está disponivel para todo os arquivos
                   // podendo ser utilizada em outros metodos

public void sacar(Double valor) {
//variavel local de método
double novoSaldo = saldo - valor;
}

public void imprimirSaldo(){ // método
//disponível em toda classe
System.out.println(saldo);
// System.out.println(novoSaldo); //somente o método sacar conhece esta variável(novoSaldo) retire as "//" iniciais e veja o erro


         // por isso apresenta um erro
// ao declarar variável dentro de um método ela só estará disponivel nele.
}

public double calcularDividaExponencial(){ // método
//variável local de método
double valorParcela = 50.0;
double valorMontante = 0.0; // começando a variável com valor zero
for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
//esta variável será reiniciada a cada execução for
double valorCalculado = valorParcela * x;
valorMontante = valorMontante + valorCalculado;
}
//escopo de fluxo
//x e valorCalculado nunca estarão disponíveis fora do for
return valorMontante;
}

    
}
