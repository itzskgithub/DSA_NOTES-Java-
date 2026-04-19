📌 Operator Precedence & Associativity in Java
🔹 1. What is Precedence?

Precedence decides which operator is evaluated first when more than one operator is in an expression.

Example:

int x = 10 + 5 * 2; 
// Multiplication (*) has higher precedence than addition (+)
// So: 10 + (5*2) = 20

🔹 2. What is Associativity?

If two operators have the same precedence, associativity decides which one is evaluated first (left → right OR right → left).

Example:

int y = 100 / 10 * 5; 
// / and * have same precedence
// They are LEFT to RIGHT associative
// So: (100/10) * 5 = 50

🔹 3. Precedence & Associativity Table (Java)
Precedence (High → Low)	Operators	Associativity
1	(), [], .	Left to Right
2	++ (post), -- (post)	Left to Right
3	++ (pre), -- (pre), + (unary), - (unary), !, ~	Right to Left
4	*, /, %	Left to Right
5	+, -	Left to Right
6	<<, >>, >>> (shift)	Left to Right
7	<, <=, >, >=	Left to Right
8	==, !=	Left to Right
9	&	Left to Right
10	^	Left to Right
11	|	Left to Right
12	&&	Left to Right
13	||	Left to Right
14	?: (ternary)	Right to Left
15	=, +=, -=, *=, /=, etc.	Right to Left