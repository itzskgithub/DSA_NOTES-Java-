Strings are immutable in java means once it is assigned by some value then it can't be changed later by any updation.

Strings is a class in java, which is denoted by "String".

We can find the length of string by Stringname.length(); 
In strings length is not property of string as in arrays it is a function so used by ().


************

Concatenation in Strings

String firstname = "Shubham";
String lastname = "Pandey";

String fullname = firstname + " " + lastname;

******************


some function in strings:

charAt();  : it is used to find the character of the string at any index with
             charAt(i);

******************

Comparison between strings 

.equals();

    String s1 = "Iron man";
    String s2 = new String("Iron man");
    if(s1.equals(s2)){
        sout("Strings are equal");
    }
    else{
        sout("Strings are not equal");
    }


Note : .equals() return boolean value.

**************************************


finding the substring 

In this we pass two values of indexes which the last index is excluded

String str = "HelloWorld";

String substr = str.substring(0,5);

 Then output will be substr = Hello 
 here index value 5 is excluded


 ********************************

 String Builder: as we know strings are immutable in java so, if we assign any value in strings then it cannot be updated if we have to add further value then in memory another string created with the older data and new data this process continues till we have to add the data in the same strings this leads to increase in time and space complexity .

 so, to over come with this problem stringBuilder is used so that the preexisted string can be updated with the new value.

 syntax:

    StringBuilder sb = new StringBuilder();

    one more thing the type of string builder is not string so when we need to convert it into string the we can use " sb.toString(); " also this can be used for the objects and not for the data types for example,

    char is a datatype so char ch = 'a'  then we cannot use ch.toString();
    because it is a datatype and not object for this we have to use 
    Character ch = 'a';
    
    then we can convert this into ch.toString();