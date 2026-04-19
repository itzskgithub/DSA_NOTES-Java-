✅ Why do we need Comparator?

Because default sorting only works for:

numbers → ascending
strings → lexicographical

❌ But what if:

sort by frequency
sort by string length
sort by marks then name

👉 That’s where Comparator comes in

🔹 Syntax (Basic)
Arrays.sort(arr, new Comparator<Type>() {
    public int compare(Type a, Type b) {
        // logic
    }
});
⚡ Return Rules (VERY IMPORTANT)
Return	Meaning
< 0	a comes before b
> 0	a comes after b
0	equal
🔥 Shortcut
return a - b;   // ascending
return b - a;   // descending
🧩 Types of Sorting Using Comparator
🔹 1. Sort numbers (Descending)
Arrays.sort(arr, (a, b) -> b - a);
🔹 2. Sort by frequency (your question)
if(freqA != freqB)
    return freqA - freqB;
return a - b;
🔹 3. Sort Strings by Length
Arrays.sort(arr, (a, b) -> a.length() - b.length());
🔹 4. Sort 2D Array (Important for TCS)
Arrays.sort(arr, (a, b) -> a[1] - b[1]);

👉 Sort based on second column

🔹 5. Sort Objects (Very Important)
class Student {
    int marks;
    String name;
}

Arrays.sort(students, (a, b) -> a.marks - b.marks);
🧠 Comparator vs Comparable (IMPORTANT DIFFERENCE)
Feature	Comparator	Comparable
Location	Outside class	Inside class
Flexibility	Multiple ways to sort	Only one default sort
Method	compare()	compareTo()
🔹 Comparable Example
class Student implements Comparable<Student> {
    int marks;

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}

👉 Default sorting defined inside class

🔥 Where Comparator is used
✅ 1. Arrays.sort()
Arrays.sort(arr, comparator);
✅ 2. Collections.sort()
Collections.sort(list, comparator);
✅ 3. PriorityQueue (VERY IMPORTANT)
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

👉 Max heap

✅ 4. TreeMap / TreeSet
TreeSet<Integer> set = new TreeSet<>((a, b) -> b - a);
⚡ Modern Java (Lambda Style)

Instead of:

new Comparator<Integer>() { ... }

👉 Use:

(a, b) -> a - b

✔️ Short
✔️ Clean
✔️ Interview friendly

🚨 Common Mistakes

❌ Using int[] with Comparator
✔️ Use Integer[]

❌ Forgetting equal case
✔️ Always handle tie

❌ Overflow issue
✔️ Use:

Integer.compare(a, b);
🎯 Golden Pattern (REMEMBER THIS)

Whenever question says:

sort based on something
custom condition
multiple conditions

👉 Think:

Comparator needed
💡 Final Summary

👉 Comparator = custom rule for sorting

👉 You control:

how two elements are compared