package Enums.Exercicios;

import java.util.Random;

public class ContaMain {
    public static void main(String[] args){
        ContaMain cm = new ContaMain();

        Conta statusConta = Conta.ATIVA;
        cm.info(statusConta);

        statusConta = cm.setStatus();
        cm.info(statusConta);
    }

    public void info(Conta statusConta){
        switch (statusConta) {
            case ATIVA:
                System.out.println("-=".repeat(30));
                System.out.println("Status: " + statusConta);
                System.out.println("Usuário logado!");
                System.out.println("-=".repeat(30));
                break;

            case BLOQUEADA:
                System.out.println("-=".repeat(30));
                System.out.println("Status: " + statusConta);
                System.out.println("Usário bloqueado, impossivel acessar conta!");
                System.out.println("-=".repeat(30));
                break;

            case ENCERRADA:
                System.out.println("-=".repeat(30));
                System.out.println("Status: " + statusConta);
                System.out.println("Usuário não faz mais parte do sistema!");
                System.out.println("-=".repeat(30));
                break;
        }
    }

    public Conta setStatus(){
        Random rand = new Random();

        int temp = rand.nextInt(3);
        Conta statusCont = null;

        switch (temp){
            case 2 -> statusCont = Conta.ENCERRADA;
            case 1 -> statusCont = Conta.ATIVA;
            case 0 -> statusCont = Conta.BLOQUEADA;
        }

        return statusCont;
    }
}
