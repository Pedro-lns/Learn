package Strings;

public class Quest08 {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder(5);

        str.append("123456789");//Aumenta a capacidade em 7, expandindo-se para 9 e aumentando +3
        System.out.println(str.capacity());
    }
}
