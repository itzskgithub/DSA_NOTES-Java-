📌 Data Types in Java

Java data types are broadly divided into two categories:

🔹 1. Primitive Data Types

These are the basic and predefined data types in Java.

They store simple values (not objects).

Size and range are fixed by the language.

Stored directly in stack memory (fast access).

👉 Types of Primitive Data Types:

Data Type	Size	Example Values
byte	1 byte (8-bit)	-128 to 127
short	2 bytes (16-bit)	-32,768 to 32,767
int	4 bytes (32-bit)	-2,147,483,648 to 2,147,483,647
long	8 bytes (64-bit)	Large integers
float	4 bytes	3.14f, 9.81f
double	8 bytes	3.14159, 2.71828
char	2 bytes (Unicode)	'A', '9', '$'
boolean	1 bit (JVM specific)	true, false
🔹 2. Non-Primitive Data Types

Also called reference types.

They store references (addresses) to objects, not the value itself.

Created by the programmer (not fixed like primitive).

Stored in heap memory, reference stored in stack.

Can be null.

👉 Examples:

Strings → String s = "Hello";

Arrays → int[] arr = {1,2,3};

Classes → class Student { ... }

Objects → Student obj = new Student();

Interfaces

✅ Summary

Primitive → predefined, store simple values, faster.

Non-Primitive → user-defined or complex, store references to objects.