package Enums;

public enum Planetas {
    MARTE(50.30),
    VÊNUS(123.4),
    URANO(532.74),
    TERRA(0),
    JÚPITER(842.62),
    SATURNO(643.32),
    NETUNO(422.53),
    MERCÚRIO(242.21);

    private final double distance;

    Planetas(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }
}
