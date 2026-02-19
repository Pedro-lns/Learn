package POO;

class People{
    private String name;

    public People(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Worker extends People{
    private double wage;

    public Worker(double wage, String name){
       super(name);
       this.wage = wage;
    }

    public double moreWage(double upWage){
        return wage += upWage;
    }

    public double deficitWage(double lowWage){
        return wage -= lowWage;
    }

    public double getWage(){
        return wage;
    }
}
public class Quest01 {
    public static void main(String[] args){
        Worker worker_1 = new Worker(1627.64, "Pedro Lucas");

        System.out.println("Name: " + worker_1.getName());
        System.out.printf("Wage: R$: %.2f", worker_1.getWage());
    }
}
