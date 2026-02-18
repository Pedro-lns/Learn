package test.String;

public class StringBufferTest {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello fantastic World");
        StringBuffer str =  new StringBuffer("Hello, fantastic");

        //sb.append(", World!");
        // sb.replace(0,sb.length()-1,"Hello");

        System.out.println(str.capacity());//default capacity: 16
        System.out.println(sb);
        System.out.println(sb.compareTo(str));
        System.out.println(sb.delete(0,5));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.reverse());

    }
}
