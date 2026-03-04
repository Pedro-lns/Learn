package POO.Inheritance.ContaBancaria;

import Enums.Exercicios.Conta;
import POO.Inheritance.ContaBancaria.Controller.ContaBancaria;
import POO.Inheritance.ContaBancaria.Controller.ContaEspecial;
import POO.Inheritance.ContaBancaria.Controller.ContaPoupança;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("-=".repeat(30));
        ContaBancaria conta = criarConta();
        System.out.println("-=".repeat(30));
    }

    public static ContaBancaria criarConta(){
        Random rand = new Random();

        System.out.println("Informe o nome da conta: ");
        String nome  = in.nextLine();

        System.out.println("Número de Conta gerado com sucesso!");

        int numConta = rand.nextInt(10000, 9999999);
        String num_Conta = String.valueOf(numConta);

        System.out.println("[1] - Poupança");
        System.out.println("[2] - Especial");

        int tipo = -1;

        do {
            try {
                System.out.println("Escolha uma das opções: ");
                tipo = in.nextInt();
                if (tipo == 1 || tipo == 2) break;
            } catch (InputMismatchException e) {
                System.err.println("Informe uma opção válida!");
                in.nextLine();
            }
        }while(true);

        switch (tipo){
            case 1 -> {
                System.out.println("Conta Poupança criado com sucesso!");
                return new ContaPoupança(nome, num_Conta);
            }
            case 2 -> {
                System.out.println("Conta Especial criado com sucesso!");
                return new ContaEspecial(nome,num_Conta);
            }
            default -> {
                System.out.println("Erro");
                return null;
            }
        }
    }

    public static void depositar(double value){

    }

    public static void mostrarRendimento(ContaPoupança conta){

    }

    public static void mostrarDados(ContaBancaria conta){

    }

}
