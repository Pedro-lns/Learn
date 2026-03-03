package POO.Inheritance;

//So pra testar
class Animal{
    private String name;

    public void doSong(){
        System.out.println("Som Qualquer!");
    }
}

class Dog extends Animal{
    private String name;

    public Dog(String name){
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

public class Inheritance {
    public static void main(String[] args){
        Animal dog = new Dog("Spike");

        dog.doSong();

        Dog newDog = (Dog)dog;
        System.out.println("Name dog: " + newDog.getName());
    }
}
