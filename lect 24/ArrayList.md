Java ArrayList – Complete Guide
1️⃣ What is ArrayList?

ArrayList is a resizable array in Java, part of java.util package.

Can store objects (cannot store primitive types directly; use wrapper classes like Integer, Double).

Maintains insertion order.

Allows duplicate elements.

Dynamic size—grows automatically when elements are added.

import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();

2️⃣ How to Create ArrayList
// 1. Without initial capacity
ArrayList<Integer> numbers = new ArrayList<>();

// 2. With initial capacity
ArrayList<String> names = new ArrayList<>(10);

// 3. Using Arrays.asList()
ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));

3️⃣ Basic Operations
Operation	Method / Example
Add element	list.add(element);
Add element at index	list.add(index, element);
Get element	list.get(index);
Update element	list.set(index, element);
Remove element by index	list.remove(index);
Remove element by object	list.remove(object);
Size of list	list.size();
Check if contains element	list.contains(element);
Check if empty	list.isEmpty();
Clear all elements	list.clear();
4️⃣ Looping Through ArrayList
ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

// 1. For loop
for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}

// 2. Enhanced for loop
for (String fruit : fruits) {
    System.out.println(fruit);
}

// 3. Using Iterator
Iterator<String> it = fruits.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// 4. Using forEach (Java 8+)
fruits.forEach(System.out::println);

5️⃣ Sorting ArrayList
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 8, 3));

// Ascending order
Collections.sort(numbers);

// Descending order
Collections.sort(numbers, Collections.reverseOrder());

6️⃣ Searching / Other Useful Methods
Method	Description
list.indexOf(element)	Returns first index of element
list.lastIndexOf(element)	Returns last index of element
list.contains(element)	Check if element exists
list.toArray()	Convert ArrayList to array
list.subList(start, end)	Get sublist from start to end-1
7️⃣ ArrayList vs Array
Feature	Array	ArrayList
Size	Fixed	Dynamic
Type	Can store primitives	Stores objects only
Insert / Delete	Hard (manual)	Easy (methods available)
Part of Collections	No	Yes (java.util)
8️⃣ Autoboxing with ArrayList

ArrayList cannot store primitives, but wrapper classes work:

ArrayList<Integer> nums = new ArrayList<>();
nums.add(10); // autoboxing int → Integer
int n = nums.get(0); // unboxing Integer → int

9️⃣ Multidimensional ArrayList
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));

matrix.add(row1);
matrix.add(row2);

// Access element at row 1, column 2
int value = matrix.get(0).get(1); // 2

10️⃣ Tips / Best Practices

Use generics to specify type (ArrayList<Integer>) → avoids typecasting.

Always use size() instead of length (like arrays).

For thread-safe operations, consider Collections.synchronizedList(list).

Avoid adding/removing elements in a loop if performance is critical → prefer LinkedList.

✅ Example: Complete ArrayList Usage

ArrayList<String> colors = new ArrayList<>();
colors.add("Red");
colors.add("Blue");
colors.add(1, "Green"); // Insert at index 1

System.out.println(colors.get(1)); // Green

colors.remove("Red");
System.out.println(colors.contains("Blue")); // true

colors.forEach(System.out::println);


Output:

Green
true
Green
Blue