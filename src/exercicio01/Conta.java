package exercicio01;

public class Conta {
    
    private int numeroConta;
    private double saldo = 0.0;
    private TitularConta titular;

    public Conta(int numeroConta, String nome, String cpf) {

        this.numeroConta = numeroConta;
        this.titular = new TitularConta(nome, cpf);
    }

    public int getNumeroConta() {

        return this.numeroConta;
    }

    public double getSaldo() {

        return this.saldo;
    }

    public void acrescentarSaldo(double valor) {

        this.saldo += valor;
    }

    public void decrementarSaldo(double valor) {

        this.saldo -= valor;
    }

    public void exibirDadosConta() {

        System.out.println("\nNúmero da Conta: " + this.numeroConta);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
        System.out.println("Nome Titular: " + this.titular.getNome());
        System.out.println("CPF do Titular: " + this.titular.getCpf() + "\n");
    }

}
