package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Universo.");
        System.out.println("I was created in 2023.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        final int nDigits = 3;
        int[] numbers = new int[nDigits];

        for (int i = 0; i < numbers.length; i++) {
            if (scanner.hasNext()) {
                numbers[i] = scanner.nextInt();
            }
        }

        int myAge = (numbers[0] * 70 + numbers[1] * 21 + numbers[2] * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!", myAge);
    }
}
