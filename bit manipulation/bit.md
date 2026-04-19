Bit manipulation is very important concept in DSA.

Bitwise Operators :

1. OR : if any of them is one then 1 if both is 0 then 0.

2. AND : both 1 then 1 in all other cases 0.

3. XOR : if both are different then 1, and if both are same then 0 
        Eg: 10011 ^ 11010 -> 01110

        Its main significance is to find the unique elenents

        4 ^ 0 = 4
        4 ^ 4 = 0

4. one's complement (symbol ~) : it is not of number 

        ~5 : means not of 5

        110 -> 001
        converts 0 into 1 and 1 into 0.

        in computers there are lot bits not just 4 or 5 bits for example:

        5 -> 00000101

        * left most bit is Most significant bit (if 1 then number is -ve and if 0 then number is +ve)

        * right most bit is least significant bit 

        2's complement find the one's complement of the number and then add by one 

        for example : (5) first we find not of 5 which is 

            00000101 so not of this is 11111010 
            then we will find one's complement
            11111010 -> one's complement is 00000101
            then add 1 so
            00000101
                  +1
            00000110 -> which is 6 but it is -6 because 2's complement gives positive into negative and negative in positive and also same for the 1's complement


5. left shift : in this we shift bits to the left by the given number 

        5 << 2 it means we shift bits of 5 with two space in the left and the last unfilled spaces is filled by 0 

        a << b : a * 2^b; (very important formula)

6. right shift : same as left shift 

        a >> b : a / 2^b;