
package javaapplication1;


public class Conta {
   
  private int numero;
    private double saldo;
    private String nome;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Numero: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }

}  
    
    
    
    

