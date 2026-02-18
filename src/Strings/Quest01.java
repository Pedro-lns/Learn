package test.String;

import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args){
        Quest01 qs = new Quest01();
        StringBuffer sb = new StringBuffer();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter: ");
        sb = sb.append(in.nextLine());
        sb = qs.noSpace(sb);
        System.out.println(sb);

        in.close();
    }

    public StringBuffer noSpace(StringBuffer another){
        StringBuffer buffer =  new StringBuffer(another.toString().replace(" ", ""));
        return buffer;
    }
}
