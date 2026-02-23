package Strings;

public class Quest06 {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("hello");
        StringBuilder another = new StringBuilder("Hello");
        Quest06 qs = new Quest06();

        System.out.println(qs.compareTo(str,another));
    }

    public boolean compareTo(StringBuilder str, StringBuilder another){
        while(str.indexOf(" ") != -1 || another.indexOf(" ") != -1){
            if(str.indexOf(" ") != -1) str.deleteCharAt(str.indexOf(" "));
            if(another.indexOf(" ") != -1) another.deleteCharAt(another.indexOf(" "));
        }

        if(str.length() != another.length()) return false;

        for(int i = 0 ; i < str.length() ; i++){
            char chStr = Character.toLowerCase(str.charAt(i));
            char chAnother = Character.toLowerCase(another.charAt(i));

            if(chStr != chAnother) return false;
        }

        return true;
    }
}
