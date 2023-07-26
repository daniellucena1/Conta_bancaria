import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<Cliente> contas = new ArrayList<Cliente>();
    private String banco;

    public Banco(String banco, Cliente cliente) {
        this.banco = banco;
        this.contas.add(cliente);
    }

    public void getSaldo(int idConta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getConta().getId() == idConta) {
                System.out.println(contas.get(i).getConta().getSaldo());
            }
        }
    }

    public void depositar(int idConta) {
        System.out.print(">> Quanto você quer depositar: ");
        Scanner sc = new Scanner(System.in);
        double quantidade = Double.parseDouble(sc.nextLine());
        for(int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getConta().getId() == idConta) {
                contas.get(i).getConta().setSaldo(quantidade);
            }
        }
        sc.close();
    }

    public void sacar(int idConta) {
        System.out.print(">> Quant você quer sacar: ");
        Scanner sc = new Scanner(System.in);
        double quantidade = Double.parseDouble(sc.nextLine());
        for(int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getConta().getId() == idConta) {
                contas.get(i).getConta().sacar(quantidade);
            }
        }
        sc.close();
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}