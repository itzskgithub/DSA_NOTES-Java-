create an object
ChatGPT said:

Java me object banane ka syntax simple hai 👇

ClassName obj = new ClassName();

Example
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // object create
        Student s1 = new Student();

        // values assign
        s1.name = "Shubham";
        s1.age = 21;

        // method call
        s1.display();
    }
}