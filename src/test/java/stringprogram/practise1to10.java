package stringprogram;

public class practise1to10 {

	public static void main(String[] args) {
	
//1 Write a Java program to get the character at the given index within the String

//		String str="Java Exercies!";
//		
//		char c=str.charAt(0);
//		char ch=str.charAt(10);
//		System.out.println(c);
//		System.out.println(ch);
//		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(10));


// 2)Write a Java program to get the character (Unicode code point) at the given index within the String.
		
//		String str = "w3resource.com";
//		    
//	    for(int i=0;i<str.length();i++){   
//	    System.out.println("Character(unicode point) = " + str.codePointAt(i));
//	    }
		

// 5. Write a java program to compare two strings lexicographically. 
		
//		String s1 = "This is Exercise 3";                                                                                  
//		String s2 = "This is Exercise 2" ;                                                                                 
//		
//		int result=s1.compareToIgnoreCase(s2);
//		if(result<0){
//			System.out.println( s1 + " is less than " + s2 );
//		}
//		else if(result==0){
//			System.out.println( s1 + " is equal to " + s2 );
//		}
//		else // (result>0)
//		{
//			System.out.println( s1 + " is greater than " + s2 );
//		}

		
//7.Write a Java program to concatenate a given string to the end of another string.
		
//        String str1 = "PHP Exercises and ";
//        String str2 = "Python Exercises";
//        
//        System.out.println("String 1: " +str1);
//        System.out.println("String 2: " +str2); 
//       
//
//        // Concatenate the two strings together.
//        String str3 = str1.concat(str2);
//
//        // Display the new String.
//        System.out.println("The concatenated string: " +str3);
        
//8.  Write a Java program to test if a given string contains the specified sequence of char values.
        
//         String original= "PHP Exercises and Python Exercises";
//         String charval = "and";
//		System.out.println(original.contains(charval));
	
//9. Write a Java program to compare a given string to the specified character sequence.
         String str9="example.com";
         String str10="example.com";
         String str11="Example.com";
         
         System.out.println(str9.contentEquals(str10));
         System.out.println(str9.contentEquals(str11));
         
//10. Write a Java program to compare a given string to the specified string buffer         
         String str12="example.com";
         String str13="Example.com";
         StringBuffer strbuf=new StringBuffer(str12);
         
         System.out.println(str12.contentEquals(strbuf));
         System.out.println(str13.contentEquals(strbuf));
         
 
	}
	
	

}
