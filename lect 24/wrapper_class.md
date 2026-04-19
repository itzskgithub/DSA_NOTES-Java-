1️⃣ Wrapper Classes in Java

Wrapper classes are object representations of primitive data types.

Every primitive type has a corresponding wrapper class:

Primitive	Wrapper Class
int	Integer
double	Double
char	Character
boolean	Boolean
byte	Byte
short	Short
long	Long
float	Float

Why use wrapper classes?

Collections like ArrayList cannot store primitives → use wrappers.

Utility methods (parseInt, toString, etc.) are available.

Needed for object-oriented programming features.

2️⃣ Autoboxing and Unboxing

Autoboxing: Automatic conversion of primitive → wrapper.

Integer obj = 10; // int → Integer


Unboxing: Automatic conversion of wrapper → primitive.

int num = obj;    // Integer → int


Manual way:

Integer obj = Integer.valueOf(10); // explicit boxing
int n = obj.intValue();            // unboxing

3️⃣ Converting String ↔ int / Integer
String → int
int num = Integer.parseInt("123"); // returns primitive int

String → Integer
Integer obj = Integer.valueOf("123"); // returns Integer object

int → String
String str = Integer.toString(123);

Integer → int
int n = obj.intValue();

Autoboxing version
Integer obj = Integer.parseInt("123"); // auto converts int → Integer

4️⃣ Key Differences Between parseInt() and valueOf()
Method	Returns	Use Case
parseInt(String)	int	Primitive int needed for calculations
valueOf(String)	Integer	Object needed (collections, wrapper ops)
5️⃣ Summary Diagram
   String
   /    \
  /      \
parseInt()   valueOf()  
   |           |
   v           v
  int        Integer
   |           |
   |           |
toString()   intValue()
   |           |
   v           v
 String       int


This shows all possible conversions: String ↔ int ↔ Integer.

Autoboxing/unboxing happens automatically between int and Integer.

✅ Tips to Remember:

Use parseInt when you only need primitive numbers.

Use valueOf when you need an Integer object (e.g., ArrayList<Integer>).

Autoboxing/unboxing makes Java smart enough to convert automatically in many cases.

Use toString() to convert numbers to string for printing or concatenation.