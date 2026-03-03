package POO.test;

abstract class Form{
    public abstract double area();
}

class Square extends Form{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }
}

class Circle extends Form{
    private double ray;

    public Circle(double ray){
        this.ray = ray;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(ray,2);
    }
}
public class Quest02 {
    public static void main(String[] args){
        Form[] forms =
        {
            new Square(3),
            new Circle(2)
        };


        System.out.printf("Square Area: %.2f m²\n", forms[0].area());
        System.out.printf("Circle Area: %.2f m²\n", forms[1].area());
    }
}
