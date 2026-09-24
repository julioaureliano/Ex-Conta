package javaapplication1;

public class JavaApplication1 {




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta Conta = new Conta(12345, "Maria Silva");

        System.out.println("=== Dados iniciais ===");
        Conta.exibirDados();

        System.out.println("\n=== Depositando R$500,00 ===");
        Conta.depositar(500.0);
        Conta.exibirDados();

        System.out.println("\n=== Sacando R$200,00 ===");
        boolean sucesso1 = Conta.sacar(200.0);
        System.out.println("Saque realizado? " + sucesso1);
        Conta.exibirDados();

        System.out.println("\n=== Tentando sacar R$1000,00 (saldo insuficiente) ===");
        boolean sucesso2 = Conta.sacar(1000.0);
        System.out.println("Saque realizado? " + sucesso2);
        Conta.exibirDados();

        System.out.println("\n=== Consultando saldo diretamente ===");
        System.out.println("Saldo atual: " + Conta.consultarSaldo());

        System.out.println("\n=== Tentando depositar valor negativo ===");
        Conta.depositar(-50.0);
        Conta.exibirDados();
    }

}
    