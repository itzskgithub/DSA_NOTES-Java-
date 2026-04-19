🔹 public

Access modifier.

Means the method can be accessed from anywhere.

JVM (Java Virtual Machine) needs to access it from outside the class, so it must be public.

🔹 static

Means the method belongs to the class, not to objects of the class.

JVM doesn’t need to create an object of your class to call main.

It can directly call ClassName.main(...).

🔹 void

Return type.

Means the method does not return anything.

JVM doesn’t expect any return value from main.

🔹 main

The method name.

It’s a special name recognized by JVM as the program’s starting point.

🔹 (String args[])

Parameter of the method.

args is an array of String objects.

It holds command-line arguments when you run the program.

Example:

java MyClass Hello World


Here:

args[0] = "Hello"

args[1] = "World"

✅ Correct full form:

public static void main(String[] args) {
    System.out.println("Hello Java");
}


👉 In short:
public static void main(String[] args) is the first method JVM looks for when starting a Java program.