package Enums.Exercicios;

import java.util.Scanner;

public class Calculadora {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("-=".repeat(30));
        System.out.printf("%20S\n", "calculadora");
        System.out.println("--".repeat(30));
        System.out.println("+ - soma");
        System.out.println("* - multiplicação");
        System.out.println("- - subtração");
        System.out.println("/ - divisão");

        System.out.println();

        System.out.print("Informe valor de a: ");
        double a = in.nextDouble();
        in.nextLine();

        System.out.print("Informe valor de b: ");
        double b = in.nextDouble();
        in.nextLine();

        for(Operadores op : Operadores.values()){
            System.out.print(a + " ");
            System.out.print(op.getOperador().toString() + " ");
            System.out.print(b + " ");
            System.out.println("=" + " " + op.calcular(a,b));
        }


        System.out.println("-=".repeat(30));
    }

}

