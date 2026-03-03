package POO.Inheritance.ContaBancaria;

public class ContaEspecial extends ContaBancaria{
    private double limit;

    ContaEspecial(String nomeConta, String numConta, double balance, double limit){
        super(nomeConta, numConta, balance);
        this.limit = limit;
    }

    @Override
    public void sacar(double value) {
        if(super.getBalance() < 0){
            System.out.println("-=".repeat(30));
            System.out.println("Saldo Insuficiente!");
            System.out.println("-=".repeat(30));
            return;
        }

        if(value > limit){
            System.out.println("-=".repeat(30));
            System.out.println("Valor de saque maior que o limite permitido!");
            System.out.println("-=".repeat(30));
            return;
        }

        double balance = super.getBalance();
        balance -= value;
        super.setBalance(balance);

        System.out.println("--".repeat(30));
        System.out.println("Saque realizado com sucesso!");
        System.out.printf("Saque: %,.2f\n", value);
        System.out.printf("Saldo: %,.2f\n", balance);
        System.out.println("--".repeat(30));
    }
}
