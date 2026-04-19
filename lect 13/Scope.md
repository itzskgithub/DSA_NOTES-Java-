🔹 Scope in Java

Scope = the region of the program where a variable/method can be accessed.
In Java, there are 4 main types of scope:

1. Local Scope (Method / Block Scope)

Declared inside a method, constructor, or block { }.

Accessible only within that block.

Memory is released once the method finishes.

class Example {
    void show() {
        int x = 10;   // local variable
        System.out.println(x);  // ✅ allowed
    }
    // System.out.println(x); ❌ Error: x not visible here
}

2. Instance Scope (Object Level)

Declared inside a class but without static keyword.

Each object gets a separate copy of the variable.

Accessed through object reference.

class Student {
    int age = 20;   // instance variable
    
    void display() {
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age); // ✅ accessed via object
    }
}

3. Static Scope (Class Level)

Declared with the static keyword.

Only one copy exists for the entire class (shared among objects).

Accessed using the class name or an object.

class Student {
    static String college = "ABC College"; // static variable
}

class Main {
    public static void main(String[] args) {
        System.out.println(Student.college); // ✅ accessed via class
    }
}

4. Global-like Scope

Java doesn’t have real "global variables" like C/C++.

But a public static variable declared in a class can be accessed globally across the project.

class Config {
    public static String APP_NAME = "MyApp"; // global-like
}

class Main {
    public static void main(String[] args) {
        System.out.println(Config.APP_NAME); // ✅ globally accessible
    }
}

📌 Summary Table
Scope Type	Declared Where?	Accessible From?	Memory Lifetime
Local	Inside method / block	Only within that block	Until method ends
Instance	Inside class (non-static)	Via object	As long as object exists
Static	Inside class (static)	Via class name or object	Until program ends
Global	public static variable in class	Across project (import needed)	Until program ends