package com.skk;

import java.math.*;

public class BigIntegerDemo {

public static void main(String[] args) {

       // create 3 BigInteger objects
	BigInteger bi1, bi2, bi3,bi4;  

	// assign values to bi1, bi2
	bi1 = new BigInteger("555555555121111111111111111111111113");
	bi2 = new BigInteger("511111111111111111111111110");
	bi3 = new BigInteger("511111111111111111111111110"); //testing

	// perform add operation on bi1 using bi2
	bi3 = bi1.add(bi2);
	bi4=bi3.add(bi2);
	  
	String str = "Result of addition is " +bi4;;

	// print bi3 value
	System.out.println( str );
    }
}