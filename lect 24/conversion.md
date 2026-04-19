1️⃣ String ↔ int / Integer

Conversion	Method / Approach	Returns	Notes

String → int	Integer.parseInt(str)	int	Primitive

String → Integer	Integer.valueOf(str)	Integer object	Wrapper object

int → String	Integer.toString(num)	String

int → String	String.valueOf(num)	String	

Integer → int	obj.intValue()	int	

Integer → String	obj.toString()	String	

Autoboxing int ↔ Integer	Integer obj = num; int n = obj;	auto conversion	Cleaner syntax
2️⃣ String ↔ char
Conversion	Method / Approach	Returns	Notes

String → char	str.charAt(index)	char	Extracts single character

char → String	Character.toString(ch)	String	

char → String	String.valueOf(ch)	String	

3️⃣ char ↔ int
Conversion	Method / Approach	Returns	Notes

char → int (ASCII code)	(int) ch	int	Unicode code point

char → int (numeric)	Integer.getNumericValue(ch)	int	Returns numeric value for digits/letters
int → char	(char) num	char	ASCII → char


Examples
// String → int / Integer
int n1 = Integer.parseInt("123");
Integer n2 = Integer.valueOf("123");

// int → String
String s1 = Integer.toString(123);
String s2 = String.valueOf(123);

// char → int
char ch = '7';
int num1 = (int) ch;                    // 55 (ASCII)
int num2 = Integer.getNumericValue(ch); // 7 (numeric value)

// int → char
int n = 65;
char ch2 = (char) n; // 'A'

// String → char
String str = "Hello";
char c = str.charAt(0); // 'H'

// char → String
String s3 = Character.toString(c);
String s4 = String.valueOf(c);

4️⃣ Quick Notes / Tips

parseXXX() → returns primitive

valueOf() → returns wrapper object

toString() / String.valueOf() → convert primitive/wrapper/char → String

charAt() → extract single character from String

Casting (int) or (char) → ASCII conversion

Integer.getNumericValue() → numeric value represented by the char