🔹 What is ArrayList?

ArrayList is a class in Java that comes from
👉 java.util.ArrayList

It is basically a resizable array.

Normal arrays:

Fixed size ❌
ArrayList:
Dynamic size ✅ (grows automatically)
🔹 Simple Definition

ArrayList is a dynamic array that allows storing elements and automatically resizes when needed.

🔹 Syntax
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
🔹 Key Features
1. Dynamic Size
list.add(10);
list.add(20);

No need to define size beforehand.

2. Indexed Access (like array)
list.get(0);  // 10
3. Allows Duplicates
list.add(10);
list.add(10); // allowed
4. Maintains Insertion Order

Elements stay in the order you add them.

5. Only Objects Allowed

Primitive types are not directly allowed:

ArrayList<int> ❌
ArrayList<Integer> ✅  // Wrapper class
🔹 Important Methods
➤ Add element
list.add(5);
➤ Add at index
list.add(1, 100);
➤ Get element
list.get(0);
➤ Set (update)
list.set(0, 50);
➤ Remove
list.remove(0);        // by index
list.remove(Integer.valueOf(50)); // by value
➤ Size
list.size();
➤ Check empty
list.isEmpty();
➤ Contains
list.contains();
checks whether the value is in the list or not.

🔹 Internal Working (important for interviews)
Internally uses a dynamic array
Default capacity = 10
When full → creates a new bigger array
(approx 1.5x size) and copies elements
🔹 Time Complexity
Operation	Time Complexity
Add (end)	O(1) (amortized)
Add (middle)	O(n)
Get	O(1)
Remove	O(n)
🔹 Array vs ArrayList
Feature	Array	ArrayList
Size	Fixed	Dynamic
Speed	Faster	Slightly slower
Flexibility	Less	More
🔹 Example Program
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);      // [10, 20, 30]
        System.out.println(list.get(1)); // 20

        list.remove(0);
        System.out.println(list);      // [20, 30]
    }
}
🔹 Interview One-Liner

If interviewer asks:

“What is ArrayList?”

You can say:

“ArrayList is a resizable array implementation in Java that provides dynamic memory allocation, fast random access, and allows duplicate elements while maintaining insertion order.”



🔹 Multidimensional ArrayList (Concept)

A multidimensional ArrayList is basically an ArrayList inside another ArrayList.

Think of it like a 2D array (rows & columns).

🔹 Syntax
ArrayList<ArrayList<Integer>> list = new ArrayList<>();
🔹 Simple Example
ArrayList<ArrayList<Integer>> list = new ArrayList<>();

ArrayList<Integer> row1 = new ArrayList<>();
row1.add(1);
row1.add(2);

ArrayList<Integer> row2 = new ArrayList<>();
row2.add(3);
row2.add(4);

list.add(row1);
list.add(row2);
🔹 Structure
[
  [1, 2],
  [3, 4]
]
🔹 Access Elements
list.get(0).get(1);  // 2

👉 First index = row
👉 Second index = column

🔹 Key Idea (Interview line)

“A multidimensional ArrayList is a dynamic 2D structure where each element is itself an ArrayList, allowing flexible row sizes.”