package Enums;

public class EnumsMain {
    public static void main(String[] args){

        for(Planetas p : Planetas.values()){
            switch (p){
                case TERRA -> System.out.println("Você já está na terra!");
                case MARTE -> System.out.println("Quem sabe um dia.");
                case MERCÚRIO-> System.out.println("Não compensa");
                default -> System.out.println(p + " está a " + p.getDistance() + " milhares de km");
            }
        }

    }
}
