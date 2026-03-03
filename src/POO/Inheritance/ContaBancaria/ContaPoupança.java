package POO.Inheritance.ContaBancaria;

public class ContaPoupança extends ContaBancaria{
    private int diaRendimento;

    ContaPoupança(String nomeConta, String numConta, double balance, int diaRendimento){
        super(nomeConta, numConta, balance);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(){

    }
}
