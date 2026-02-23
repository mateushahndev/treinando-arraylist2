/* Desenvolva um sistema bancário. O banco possui diversas contas. Cada conta é identificada por seu
número correspondente e seu saldo. Além disso, a conta contém um cliente titular que é identificado
por seu nome e CPF. Neste sistema o banco pode criar novas contas que deverão ser armazenadas.
Para isto, é necessário receber o número da nova conta, nome e cpf do titular. Para cada nova conta
criada, o saldo será 0 (zero) reais.
Além disso, por intermédio do banco é possível realizar saques, depósitos e verificação de saldo em
contas específicas. Para realizar o saque é necessário enviar ao método o número da conta e o valor
a ser sacado. O sistema deve então localizar a conta desejada e o saque só ser efetivado se o saldo
da conta for suficiente, ou seja, ao efetuar o saque o saldo não pode ficar negativo.
Para efetuar um depósito, se deve ter conhecimento do número da conta e o valor a ser depositado na
conta. O sistema deve encontrar a conta requerida e então o valor será somado ao saldo atual da conta.
Para realizar a verificação de saldo, deve ter conhecimento do número da conta, o método deve buscar
a conta correta e imprimir em tela os dados da conta, como número, nome e cpf do titular, e saldo da
conta. Os dados da conta devem ser impressos sem a utilização do método toString( ).
Para realizar a inicialização do banco, criar contas, fazer saques, depósitos e verificação de saldo,
utilize uma classe de testes. */

package exercicio01;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    private List<Conta> contas;

    public Banco() {

        this.contas = new ArrayList<Conta>();
    }

    public void criarConta(int numeroConta, String nome, String cpf) {

        boolean contaExiste = false;
        for( Conta conta : this.contas ) {

            if(conta.getNumeroConta() == numeroConta) {

                contaExiste = true;
            }
        }

        if(!contaExiste) {

            this.contas.add(new Conta(numeroConta, nome, cpf));
            System.out.printf("\nConta adicionada com sucesso!\n");
        } else {

            System.out.printf("\nEsse número de conta (%d) já existe!\n", numeroConta);
        }
    }

    public void sacarDinheiro(int numeroConta, double valor) {


        boolean encontrou = false;
        for( Conta conta : this.contas ) {

            if(conta.getNumeroConta() == numeroConta) {

                encontrou = true;
                if(conta.getSaldo() >= valor) {

                    conta.decrementarSaldo(valor);
                    System.out.printf("\nSaque de %.2f realizado com sucesso!\n", valor);
                } else {

                    System.out.printf("\nSaldo insuficiente!\n");
                }
            }
        }

        if(!encontrou) {

            System.out.printf("\nA conta número %d não existe!\n", numeroConta);
        }
    }

    public void depositarDinheiro(int numeroConta, double valor) {

        boolean encontrou = false;
        for( Conta conta : this.contas ) {

            if(conta.getNumeroConta() == numeroConta) {

                encontrou = true;
                conta.acrescentarSaldo(valor);
                System.out.printf("\nDeposito concluído!\n");
            }
        }

        if(!encontrou) {

            System.out.printf("\nA conta número %d não existe!\n", numeroConta);
        }
    }

    public void exibirDados(int numeroConta) {

        boolean encontrou = false;
        for( Conta conta : this.contas ) {

            if(conta.getNumeroConta() == numeroConta) {

                encontrou = true;
                conta.exibirDadosConta();
            }
        }
    }
}