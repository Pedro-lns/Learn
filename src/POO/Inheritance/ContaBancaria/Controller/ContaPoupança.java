package POO.Inheritance.ContaBancaria.Controller;

public class ContaPoupança extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupança(String nomeConta, String numConta){
        super(nomeConta, numConta);
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

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
