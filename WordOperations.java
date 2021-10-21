package com.strings;

import java.util.Arrays;

public class WordOperations {

	public static String newTextEditor(String[] operations)
	{
		String result = "";
		String recentActivity = "";
		String insert = "";
		String copiedString ="";
		String pastedString ="";
		char deleteChar =' ';
		int copyIndex =0;
		
		for(String s:operations)
		{
			if(s.contains("INSERT"))
			{
				recentActivity ="INSERT";
				insert=s.split("INSERT ")[1].trim();
				result += insert;
				
			}
			else if(s.contains("DELETE"))
			{//delete erase the last char
				recentActivity ="DELETE";
				
				deleteChar = result.charAt(result.length() - 1);
				
				result = result.substring(0, result.length() -1);
				
			}
			else if(s.contains("COPY")) {
				recentActivity ="COPY";
				
				copyIndex = Integer.parseInt(s.split("COPY ")[1].trim());
				
				copiedString = result.substring(copyIndex);
				
			}
			else if(s.contains("PASTE"))
				{
				recentActivity = "PASTE";
				pastedString = copiedString;
				result += pastedString;
				}
			else if(s.contains("UNDO"))
			{

				if(recentActivity.equals("INSERT"))
				{
					int len= insert.length();
					result = result.substring(0, Math.abs(result.length()-len));
				}
				else if(recentActivity.equals("DELETE"))
				{
					result += deleteChar; 
				}
				else if(recentActivity.equals("PASTE"))
				{
					result= result.split(pastedString)[0];
				}
			}
//			System.out.println(s);
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(newTextEditor(new String[] {"INSERT Codee","DELETE","INSERT Signall","DELETE","UNDO"}));

	}

}
