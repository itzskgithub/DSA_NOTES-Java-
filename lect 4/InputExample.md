//🔹 Using Scanner (easy & most used)
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking different types of input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a decimal: ");
        double d = sc.nextDouble();

        System.out.print("Enter a word: ");
        String word = sc.next();   // reads single word

        sc.nextLine(); // to consume newline left by next()

        System.out.print("Enter a full line: ");
        String line = sc.nextLine();  // reads full sentence

        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + d);
        System.out.println("Word: " + word);
        System.out.println("Line: " + line);

        sc.close();
    }
}

//🔹 Other Ways (less common but useful)

//BufferedReader (faster, used in CP):

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line: ");
        String str = br.readLine();
        System.out.println("You entered: " + str);
    }
}


Console class (works only in terminal, not in some IDEs):

String name = System.console().readLine();