package POO;

class NewAnimal{
    private String name;

    public void doSong(){
        System.out.println("Som Genêrico!");
    }
}

class NewDog extends NewAnimal{
    private String name;

    public NewDog(String name){
        this.name = name;
    }

    @Override
    public void doSong(){
        System.out.println("Au Au!");
    }

    public String getName(){
        return name;
    }

}

public class Quest03 {
    public static void main(String[] args){
        NewAnimal animal = new NewDog("Spike");
        print(animal);

    }

    public static void print(NewAnimal animal){
        animal.doSong();
    }

    public static void print(NewDog dog){
        dog.doSong();
    }
}
