📌 Bit Manipulation in Java
🔹 1. What is Bit Manipulation?

It means working directly with binary representations of numbers using bitwise operators.

Very efficient (constant-time operations).

Used in problems like subsets, masks, DP, XOR tricks, optimization.

🔹 2. Bitwise Operators in Java
Operator	Meaning	Example
& (AND)	1 if both bits are 1	5 & 3 → 101 & 011 = 001 (1)
| (OR)	1 if any bit is 1	5 | 3 → 101 | 011 = 111 (7)
^ (XOR)	1 if bits are different	5 ^ 3 → 101 ^ 011 = 110 (6)
~ (NOT)	Inverts bits	~5 → ...11111010 (-6)
<< (Left Shift)	Multiply by 2^k	5 << 1 = 10
>> (Right Shift)	Divide by 2^k (sign preserved)	10 >> 1 = 5
>>> (Unsigned Right Shift)	Fills 0s on left	-10 >>> 1 gives large positive