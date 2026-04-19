📌 Access Modifiers in Java
🔹 Definition

Access Modifiers decide scope (where you can access) of classes, variables, methods, and constructors.
Java me 4 access modifiers hote hain:

🔹 Types of Access Modifiers

public

Accessible everywhere (same class, same package, different package).

Maximum visibility.

public class Student {
    public String name = "Shubham";  // accessible everywhere
}


private

Accessible only within the same class.

Best for data hiding (Encapsulation).

Cannot be accessed outside the class, even in subclass.

class Student {
    private String name = "Shubham";

    private void display() {
        System.out.println(name);
    }
}


protected

Accessible in:

Same class

Same package

Subclasses (even if in different package using inheritance).

class Student {
    protected String name = "Shubham";
}

class Derived extends Student {
    void show() {
        System.out.println(name);  // allowed (protected + inheritance)
    }
}


default (no keyword → also called package-private)

Accessible only in same package.

If you don’t write any modifier → by default this applies.

class Student {  // default class
    int age = 21;   // default variable
}

📌 Access Modifier Table
Modifier	Same Class	Same Package	Subclass (different package)	Other Packages
public	✅ Yes	✅ Yes	✅ Yes	✅ Yes
protected	✅ Yes	✅ Yes	✅ Yes	❌ No
default	✅ Yes	✅ Yes	❌ No	❌ No
private	✅ Yes	❌ No	❌ No	❌ No
🔹 Why Access Modifiers?

Encapsulation (hiding data properly)

Security (restrict unwanted access)

Flexibility (control who can use what)