package POO.Inheritance.ContaBancaria;

public class ContaPoupança extends ContaBancaria{
    private int diaRendimento;

    ContaPoupança(String nomeConta, String numConta, double balance, int diaRendimento){
        super(nomeConta, numConta, balance);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(){
        double balance = super.getBalance();
        double porcent = (balance * 2)/100;
        double receita = porcent * diaRendimento;

        balance += receita;
        super.setBalance(balance);

        System.out.println("--".repeat(30));
        System.out.println("Dias de Rendimento: " + diaRendimento);
        System.out.printf("Receita: R$:%,.2f\n", receita);
        System.out.printf("Saldo: R$:$,.2f\n", super.getBalance());
        System.out.println("--".repeat(30));
    }
}
