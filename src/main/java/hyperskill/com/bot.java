package hyperskill.com;

import java.util.Scanner;

public class bot 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Wallie.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");

        String yourName = scanner.next();
        // reading a name
        System.out.println("What a great name you have, " + yourName + "!");
    }
}
