package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        System.out.printf("What a great name you have, %s!", myName);
    }
}
