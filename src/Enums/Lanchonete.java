package Enums;

public class Lanchonete {
    public static void main(String[] args){
        String formatHeader = "%20s\n";
        String formatRow  = "%-20s R$%7.2f\n";

        System.out.println("-=".repeat(30));
        System.out.printf(formatHeader, "Cardápio");
        System.out.println("--".repeat(30));
        for(Comidas c : Comidas.values()){
            System.out.printf(formatRow, c, c.getValue());
        }
        System.out.println("-=".repeat(30));
    }
}
