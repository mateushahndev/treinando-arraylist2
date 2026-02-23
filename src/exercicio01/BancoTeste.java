package exercicio01;

public class BancoTeste {
    
    public static void main(String[] args) {
        
        Banco banco1 = new Banco();

        banco1.criarConta(1001, "Mateus de Souza Hahn", "111.222.333-44");

        banco1.exibirDados(1001);

        banco1.depositarDinheiro(1001, 1000);

        banco1.sacarDinheiro(1001, 300);

        banco1.exibirDados(1001);
    }
}
