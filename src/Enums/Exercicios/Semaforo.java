package Enums.Exercicios;

public enum Semaforo {
    VERMELHO(0),
    VERDE(1),
    AMARELO(2);

    private final int id;

    Semaforo(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

}

