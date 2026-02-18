package test.String;

import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = in.nextLine();

        buffer.append(word);
        System.out.println("Rever word is: " + buffer.reverse());
    }

}
