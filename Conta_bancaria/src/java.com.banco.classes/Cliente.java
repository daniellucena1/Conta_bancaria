public class Cliente {  
    private String nome;
    private int idade; 
    private Conta conta;

    public Cliente(String nome, int idade, String agencia, int idConta, double saldoConta) {
        conta = new Conta(agencia, idConta, saldoConta);
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public Conta getConta(){
        return this.conta;
    }
}