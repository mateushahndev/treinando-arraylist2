package exercicio01;

public class TitularConta {
    
    private String nome;
    private String cpf;

    public TitularConta(String nome, String cpf) {

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {

        return this.nome;
    }

    public String getCpf() {

        return this.cpf;
    }
}
