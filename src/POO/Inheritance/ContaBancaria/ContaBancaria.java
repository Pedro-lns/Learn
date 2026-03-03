package POO.Inheritance.ContaBancaria;

public class ContaBancaria {
    private String nomeClient;
    private String numConta;
    private double balance;

    ContaBancaria(String nomeClient, String numConta, double balance){
        this.nomeClient = nomeClient;
        this.numConta = numConta;
        this.balance = balance;
    }

    public void sacar(double value){
        if(balance < 0){
            System.out.println("-=".repeat(30));
            System.out.println("Saldo Insuficiente!");
            System.out.println("-=".repeat(30));
            return;
        }

        balance -= value;

        System.out.println("--".repeat(30));
        System.out.println("Saque realizado com sucesso!");
        System.out.printf("Saque: %,.2f\n", value);
        System.out.printf("Saldo: %,.2f\n", balance);
        System.out.println("--".repeat(30));
    }

    public void depositar(double value){
        if(value <= 0){
            System.out.println("-=".repeat(30));
            System.out.println("Deposito Insuficiente!");
            System.out.println("-=".repeat(30));
            return;
        }

        System.out.println("--".repeat(30));
        System.out.println("Deposito realizado com sucesso!");
        System.out.printf("Saldo: %,.2f\n", balance);
        System.out.println("--".repeat(30));
    }

    public double getBalance() {
        return balance;
    }

    public String getNomeClient() {
        return nomeClient;
    }

    public String getNumConta() {
        return numConta;
    }
}
