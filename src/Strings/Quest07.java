package Strings;

public class Quest07 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("abc");


        //Quando removemos o primeiro elemento 'a' o b passa ser o novo elemendo
        //de indice 0, mas i avançou, então nunca passamos por b por isso
        //ele não é removido.
        for (int i = 0; i < sb.length(); i++) {
            sb.deleteCharAt(i);
        }

        System.out.println(sb);
    }
}
