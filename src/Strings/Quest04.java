package test.String;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word: ");
        StringBuffer buffer = new StringBuffer(in.nextLine());

        System.out.println(noA(buffer));

    }

    public static StringBuffer noA(StringBuffer buffer){
        StringBuffer newBuffer = new StringBuffer(buffer.toString().replace('a', '@'));
        return newBuffer;
    }
}
