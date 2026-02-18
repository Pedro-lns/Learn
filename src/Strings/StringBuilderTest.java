package test.String;

public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder str = new StringBuilder("Hello, fantastic");

        //sb.append(", World!");
        // sb.replace(0,sb.length()-1,"Hello");

        System.out.println(str.capacity());//default capacity: 16
        System.out.println(sb);
        System.out.println(sb.compareTo(str));
        System.out.println(str.delete(0,2));
        System.out.println(str.deleteCharAt(0));
        System.out.println(sb.reverse());

    }
}
