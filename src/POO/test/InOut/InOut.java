package POO.test.InOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("//home/pedro//Downloads//test//WOW.txt"));

        String str = in.next();
        System.out.println(str);

        PrintWriter out = new PrintWriter("//home//pedro//Downloads//test//WOW.txt");

        out.println("texto");

        in.close();
        out.close();
    }
}
