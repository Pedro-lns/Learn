package Enums;

public enum Comidas {
    PRATINHO(100,15),
    PIZZA(100,45.99),
    BATATA_FRITA(70,2.99),
    LASANHA(90,24.99);

    private final int delicious;
    private final double value;

    Comidas(int delicious, double value){
        this.delicious = delicious;
        this.value = value;
    }

    public int getDelicious(){
        return delicious;
    }

    public double getValue(){
        return value;
    }
}
