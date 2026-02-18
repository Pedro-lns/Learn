package test.String;

import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word: ");
        StringBuffer buffer = new StringBuffer(in.nextLine());

        System.out.println(countVogal(buffer));
    }

    public static int  countVogal(StringBuffer buffer){
        int count = 0;
        for(int i = 0 ; i < buffer.length(); i++){

            if(buffer.charAt(i) == 'a' || buffer.charAt(i) == 'e' ||
               buffer.charAt(i) == 'i' || buffer.charAt(i) == 'o' ||
               buffer.charAt(i) == 'u'){
                count++;
            }
        }

        return count;
    }
}
