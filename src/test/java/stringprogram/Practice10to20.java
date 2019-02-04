package stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Practice10to20 {
	
	public static void main(String[] args) {


		//			  Set<Character> dup=new TreeSet<Character>();
		//			  
		//			  for (Character val : ch){
		//			  if(dup.add(val) == false)
		//			  {
		//				  if(){
		//				  System.out.println(val);
		//				  count++;
		//				  }
		//			  }
		//			  }
		//			  System.out.println(count);



		//11. Write a Java program to create a new String object with the contents of a character array.

		//		char arr_num[]= {'1','2','3','4','5','6'};
		//		String str=String.copyValueOf(arr_num, 0, 4);
		//		 System.out.println("The book contains " + str +" pages");


		//12.Write a Java program to check whether a given string ends with the contents of another string.

		//		String str="Python Exercises";
		//		String str1="es";
		//				
		//	System.out.println(str.endsWith(str1));


		//15. Write a java program to print current date and time in the specified format.
		//		Calendar c = Calendar.getInstance();
		//		System.out.println("Current Date and Time :"); 
		//		System.out.format("%tB %te, %tY%n", c, c, c);
		//		System.out.format("%tl:%tM %tp%n", c, c, c); 


		//26. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement

		//    String str = "The quick brown fox xxxx over the lazy dog.";
		//    String new_str = str.replace("x", "t");
		//    		//replaceAll("x", "t");
		// 
		//    System.out.println("Original string: " + str);
		//    System.out.println("New String: " + new_str);
		//    
		//    String str3 = "Java Exercises.";
		//
		//    // Convert the above string to a char array.
		//    char[] arr = str3.toCharArray();
		//
		//    // Display the contents of the char array.
		//    
		//    for(int i=0;i<str3.length();i++)
		//    System.out.print(arr[i] + " ");

		// Reverse String.

		//		String sr= "String value";


		//		char ch[]=sr.toCharArray();
		//
		//		for(int i=ch.length-1; i>=0;i--)
		//		{
		//			System.out.print(ch[i]);
		//		}

		//		for(int i=sr.length()-1; i>=0;i--)
		//		{
		//			System.out.print(sr.charAt(i));
		//		
		//		}

		//34. Write a Java program to find the second most frequent character in a given string

		String str1 = "sucessess";
		System.out.println("The given string is: " + str1);
		int count=1;
		char ch[]=str1.toCharArray();

		int len=ch.length;

		//  List<Character> lt=new ArrayList<Character>();
		Hashtable<Character,Integer> map=new Hashtable<Character , Integer>();
		Set<Character> st= new HashSet<Character>();


		for(int i=0;i<len;i++)
		{
			if(st.add(ch[i]))
			{
				for(int j=i+1;j<len;j++)
				{

					if(ch[i]==ch[j])
					{ 
						count++;
					}

				} 
				map.put(ch[i],count);
			}

			count = 1;
		}
		System.out.println(map);		
		
		Arrays.sort(map);

		for(Entry<Character, Integer> m: map.entrySet())
		{
			System.out.println(m.getKey()+ " " + m.getValue());

		}
	}
}
