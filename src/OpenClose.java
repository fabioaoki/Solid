public class OpenClose {
    /*
    No codigo abaixo temos um cenario onde existe dois tipos de contrato, o problema é que se quisermos criar um novo tipo de contrato,
    teremos que modificar o methodo adcionando mais um if na validacao, isso quebra o principio do Open close onde as classes tem que
    ser aberta para expansao mas fechada para modificacao.
    Esse method funciona hoje e se criamos mais uma condicao, podemos esta quebrando ele.
     */
    class ContratoCLT {
        public double salario() {
            // Implementação para retornar o salário
            return 0.0;
        }
    }
    class Estagio {
        public double bolsaAuxilio() {
            // Implementação para retornar a bolsa de auxílio
            return 0.0;
        }
    }
    class FolhaDePagamento {
        protected double saldo;

        public void calcular(Object contrato) {
            if (contrato instanceof ContratoCLT) {
                saldo = ((ContratoCLT) contrato).salario();
            } else if (contrato instanceof Estagio) {
                saldo = ((Estagio) contrato).bolsaAuxilio();
            }
        }
    }
}
/*-------------APLICANDO O DO SOLID------------*/

/*
aplicando o open close, a melhor forma eh criando uma interface chamada Remuneravel e as classes a implementam, sendo assim voce consegue
sobreescrever o method conforme o tipo de contrado, nao precisamos inserir mais um if e cada classe faz a sua logica, tambem utiliza o princio S do solic
 */

interface Remuneravel {
    double remuneracao();
}
class ContratoCLT implements Remuneravel {
    @Override
    public double remuneracao() {
        // Implementação do método
        return 0.0; // Valor exemplificativo
    }
}
class ContratoPJ implements Remuneravel {
    @Override
    public double remuneracao() {
        // Implementação do método
        return 0.0; // Valor exemplificativo
    }
}
class Estagio implements Remuneravel {
    @Override
    public double remuneracao() {
        // Implementação do método
        return 0.0; // Valor exemplificativo
    }
}
class FolhaDePagamento {
    protected double saldo;

    public void calcular(Remuneravel contrato) {
        this.saldo = contrato.remuneracao();
    }
}
