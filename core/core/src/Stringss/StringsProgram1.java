package Stringss;

import java.util.*;

public class StringsProgram1  {
	
	public static void main(String[] args) {
		
		String name="Rutuja";
		String surname="Ranmode";
		
		String fullname= name + " " + surname;
		for(int i=0;i<fullname.length();i++)
		{
			System.out.println(fullname.charAt(i));
		}
	}

}
