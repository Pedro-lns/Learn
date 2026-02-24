package Enums.Exercicios;

public enum Operadores {
    SOMA("+"){
        @Override
        public double calcular(double a , double b){
            return a + b;
        }
    },

    PRODUTO("*") {
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    },

    SUBTRAÇÃO("/") {
        @Override
        public double calcular(double a, double b) {
            return a/b;
        }
    },

    DIVISÃO("-") {
        @Override
        public double calcular(double a, double b) {
            return a-b;
        }
    };

    private final String operador;

    Operadores(String operador){
        this.operador = operador;
    }

    public String getOperador(){
        return operador;
    }

    public abstract double calcular(double a, double b);
}
