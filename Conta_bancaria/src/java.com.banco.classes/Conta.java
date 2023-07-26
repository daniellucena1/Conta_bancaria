public class Conta {
    private String agencia;
    private int idConta;
    private double saldoConta = 0;

    public Conta(String agencia, int idConta, double saldoConta) {
        this.agencia = agencia;
        this.idConta = idConta;
        this.saldoConta = saldoConta;
    }

    public int getId(){
        return this.idConta;
    }

    public void setId(int idConta) {
        this.idConta = idConta;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setSaldo(double saldoConta) {
        this.saldoConta += saldoConta;
    }

    public void sacar(double saldoConta) {
        this.saldoConta -= saldoConta;
    }

    public Double getSaldo() {
        return this.saldoConta;
    }
}