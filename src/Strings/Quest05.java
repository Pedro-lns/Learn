package Strings;

public class Quest05 {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Java");

        str.append("8");//Aqui concatena str com "8", ficando "Java8"
        str.insert(1,"SE");//Aqui no index 1, insere "SE" em str, ficando "JSEava8"
        str.delete(2,4);//"Remove de str os index de 2 à 3(4-1), ficando "JSva8"

        System.out.println(str);
    }
}
