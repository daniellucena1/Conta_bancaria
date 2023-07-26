import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Daniel", 18, "santander", 123, 1234.45);

        Banco banco = new Banco("Santander", cliente1);

        int opcao = -1;
        
        while(opcao != 0){
            System.out.println(">> Digite uma das opções: ");
            System.out.println(">> 1 - Sacar");
            System.out.println(">> 2 - Depositar");
            System.out.println(">> 0 - Encerrar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println(">> Qual a sua id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    banco.sacar(id);
                    break;
                case 2:
                    System.out.println(">> Qual a sua id: ");
                    int idcliente = Integer.parseInt(sc.nextLine());
                    banco.depositar(idcliente);
                    break;
                case 0:
                    sc.close();
            }
        }
    }
}
