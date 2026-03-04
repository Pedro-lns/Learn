package POO.Inheritance.ContaBancaria.Controller;

public class ContaEspecial extends ContaBancaria {
    private double limit;

    public ContaEspecial(String nomeConta, String numConta){
        super(nomeConta, numConta);
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

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
