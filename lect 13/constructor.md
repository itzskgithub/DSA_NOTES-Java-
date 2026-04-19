📌 Constructor in Java
🔹 Definition

A constructor is a special method in Java that is automatically called when an object of a class is created.

Its main use is to initialize objects (give values to variables).

🔹 Features of Constructor

Constructor ka naam class ke naam jaisa hota hai.

Constructor ke paas return type nahi hota (even void bhi nahi).

Jab object banta hai, tab constructor automatically execute hota hai.

🔹 Types of Constructors

Default Constructor

Agar programmer khud constructor na banaye, Java ek default constructor provide karta hai (jo sab variables ko default values deta hai).

class Student {
    String name;
    int age;

    // default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();   // constructor called automatically
        s1.display();
    }
}


Output

Name: Unknown, Age: 0


Parameterized Constructor

Jisme parameters diye jaate hain aur unse object ke variables initialize hote hain.

class Student {
    String name;
    int age;

    // parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Shubham", 21);
        Student s2 = new Student("Rahul", 22);

        s1.display();
        s2.display();
    }
}


Output

Name: Shubham, Age: 21
Name: Rahul, Age: 22


Copy Constructor (not built-in in Java, but we can make it manually)

class Student {
    String name;
    int age;

    // parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Shubham", 21);
        Student s2 = new Student(s1);   // copy constructor

        s1.display();
        s2.display();
    }
}


Output

Name: Shubham, Age: 21
Name: Shubham, Age: 21

📌 Difference Between Constructor and Method
Constructor	Method
Called automatically when object is created	Called manually using object
No return type (not even void)	Must have return type
Used for object initialization	Used to define behavior (actions)