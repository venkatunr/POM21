package stringprogram;

import java.util.ArrayList;
import java.util.List;

public class Second {

	public static void main(String[] args) {
			
		String input ="pickoutthelongestsubstring";
		char ch[]=input.toCharArray();
		int len=ch.length;
		String val="";
		List<String> list=new ArrayList<String>();

		for(int i=0;i<len;)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ch[i] != ch[j])
				{
					 val=ch[i]+ch[j];
					 i++;	 
				}
				
			}
			list.add(val);
		}

		
		
		
		
		
		
		
	}
	}
	 
	
	
