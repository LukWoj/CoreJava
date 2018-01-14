import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GenericMethod {
//generic method print array
	
	public static <E> void printArray( E[] inputArray){
		for (E e : inputArray)
		{
			System.out.printf("%s ->", e);
		}
	}
	 public static void main(String[] args) {
	        Integer[] integerarray = {1,2,3,4,5};
	        Double[] doubleArray = {1.1 , 2.1};
	        printArray(integerarray);
	        System.out.println();
	        printArray(doubleArray);
	        
   
	 }
}
	       