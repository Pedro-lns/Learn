package Enums.Exercicios;

import java.util.Random;

public class SemaforoMain {
    public static void main(String[] args){
        Random rand = new Random();

        int id = rand.nextInt(3);

        switch (id){
            case 0 -> System.out.println("Sinal " + Semaforo.VERMELHO + ", ESPERE!");
            case 1 -> System.out.println("Sinal " + Semaforo.VERDE  + ", SIGA EM FRENTE!");
            case 2 -> System.out.println("Sinal " + Semaforo.AMARELO + ", ATENÇÃO!");
        }

    }
}
