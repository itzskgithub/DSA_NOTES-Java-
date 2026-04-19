🔹 Call by Value vs Call by Reference in Java

👉 Important fact first:
Java does not support true Call by Reference (like C++ does).
In Java:

Primitives (int, char, etc.) → always passed by value.

Objects → reference (memory address) is passed by value.

So people say Java is strictly call by value, but objects behave like reference because the reference itself is copied.

1. Call by Value (Primitives)

When we pass a primitive data type, a copy of the value is sent to the method.
Changes inside the method do not affect the original variable.

class Test {
    void changeValue(int x) {
        x = x + 10;  // only changes local copy
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 5;
        Test obj = new Test();
        obj.changeValue(a);
        System.out.println(a);  // Output: 5 (not changed)
    }
}


✅ Because a was passed by value (copy).

2. Call by Reference-like (Objects)

When we pass an object, the reference (address) is copied into the method.
So, both original and method parameter point to the same object in memory.
Changes to the object's data affect the original.
But if we reassign the reference, it won’t affect the original.

class Student {
    String name;
}

class Test {
    void changeName(Student s) {
        s.name = "Rahul";  // changes the object data
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shubham";

        Test obj = new Test();
        obj.changeName(s1);

        System.out.println(s1.name);  // Output: Rahul ✅ changed
    }
}

3. Reassigning Reference (Important Case)

If you reassign inside the method, it won’t affect the original object,
because only the copy of the reference was passed.

class Student {
    String name;
}

class Test {
    void reassign(Student s) {
        s = new Student();   // reassign to new object
        s.name = "Amit";
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shubham";

        Test obj = new Test();
        obj.reassign(s1);

        System.out.println(s1.name);  // Output: Shubham ❌ not Amit
    }
}

📌 Summary
Type	What is Passed?	Effect
Primitives	Copy of value	Original not affected
Objects	Copy of reference (address)	Object data can be changed
Objects (reassigned)	New object assigned locally	Original not affected