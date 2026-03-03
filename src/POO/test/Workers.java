package POO.test;

class Main{
    public static void main(String[] args){
        Gerente gerente = new Gerente("0001", "Robson");
        Horist horist = new Horist("0002", "Cleberson");
        Financer financer = new Financer();

        financer.doPayGerente(gerente, 400, 1617);
        financer.doPayHorist(horist,3, 1500);

    }
}
public class Workers {
    private String id;
    private String name;
    private double wage;

    Workers(String id, String name){
        this.id = id;
        this.name = name;
    }

    //Setter
    public void setWage(double wage){
        this.wage = wage;
    }

    //getter
    public double getWage(){
        return wage;
    }

    public  String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}

class Financer{
    public void doPayGerente(Gerente gerente, double bonus, double wage){
        gerente.setBonus(bonus);
        gerente.setWage(wage);

        System.out.println("Pagamento efetuado para funcionário:");
        System.out.println("Nome: " + gerente.getName());
        System.out.println("Id: " + gerente.getId());
        System.out.println("Cargo: Gerente"  );
        System.out.println("Salário: " + gerente.getWage());
        System.out.printf("Bônus: R$: %.2f\n", gerente.getBonus());
        System.out.printf("Total: R$: %.2f\n", gerente.getWageBonus());
        System.out.println();
    }

    public void doPayHorist(Horist horist, double hour, double wage){
        horist.setHour(hour);
        horist.setWage(wage);

        System.out.println("Pagamento efetuado para funcionário:");
        System.out.println("Nome: " + horist.getName());
        System.out.println("Id: " + horist.getId());
        System.out.println("Cargo: Horista");
        System.out.println("Salário: R$:" + horist.getWage());
        System.out.println("Horas Bônus: " + horist.getHour() + "h");
        System.out.printf("Total: R$:%.2f\n", horist.getHourBonus());
        System.out.println();
    }
}

class Gerente extends Workers{
    private double bonus;

    Gerente(String id, String name) {
        super(id, name);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getWageBonus(){
        double wage = getWage() + bonus;
        return wage;
    }
    public double getBonus(){
        return bonus;
    }
}

class Horist extends Workers{
    private double hour;

    Horist(String id, String name) {
        super(id, name);
    }

    public void setHour(double hour){
        this.hour = hour;
    }

    public double getHourBonus(){
        double wage = super.getWage() * hour;
        return wage;
    }

    public double getHour(){
        return hour;
    }
}