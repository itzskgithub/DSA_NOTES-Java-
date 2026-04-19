📌 Classes in Java

Definition

A class is a blueprint or template for creating objects.

It contains fields (variables) and methods (functions) that define the properties and behavior of objects.

Syntax

class ClassName {
    // fields (data members)
    // methods (member functions)
}


Key Points

Class does not occupy memory until objects are created.

One class can have many objects.

📌 Objects in Java

Definition

An object is a real-world entity created from a class.

It represents a specific instance of the class.

Objects occupy memory.

Syntax

ClassName obj = new ClassName();


How objects work

Use . (dot operator) to access variables and methods of a class.

📌 Example
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving at speed " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        // create objects
        Car c1 = new Car();
        Car c2 = new Car();

        // assign values
        c1.color = "Red";
        c1.speed = 100;

        c2.color = "Blue";
        c2.speed = 120;

        // access methods
        c1.drive();
        c2.drive();
    }
}


Output

Car is driving at speed 100
Car is driving at speed 120

📌 Difference Between Class and Object
Class	Object
Blueprint/template	Instance of class
No memory allocated until object is created	Occupies memory
Defines properties and behavior	Represents real-world entity