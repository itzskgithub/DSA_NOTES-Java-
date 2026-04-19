📌 Java Methods
🔹 Definition

A method in Java is a block of code that performs a specific task and can be reused.

👉 In simple words: functions in Java = methods.

🔹 Syntax
Access_modifier returnType methodName(parameters) {
    // method body
    return value;   // if returnType is not void
}


returnType → Data type of the value returned (int, String, void, etc.)

methodName → Name of the method (should be meaningful)

parameters → Input values (optional)

method body → Code to execute

📌 Types of Methods

Predefined (built-in) methods

Already available in Java libraries.

Example: Math.sqrt(16), System.out.println()

User-defined methods

Created by programmer.

📌 Method Categories

Without parameters and without return type

void greet() {
    System.out.println("Hello");
}


With parameters and without return type

void greet(String name) {
    System.out.println("Hello " + name);
}


Without parameters and with return type

int getNumber() {
    return 10;
}


With parameters and with return type

int add(int a, int b) {
    return a + b;
}

📌 Example Program
class Calculator {
    // method without return type
    void greet() {
        System.out.println("Welcome to Calculator");
    }

    // method with return type
    int add(int a, int b) {
        return a + b;
    }

    // method with return type
    int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();  // create object

        c.greet();   // calling method

        int sum = c.add(5, 7);    // calling with parameters
        System.out.println("Sum = " + sum);

        System.out.println("Square = " + c.square(4));
    }
}