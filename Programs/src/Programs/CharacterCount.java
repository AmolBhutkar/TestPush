package Programs;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		
		
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		
		String s="Amol Madhukar Bhutkar";
		System.out.println(s);
		
		s=s.replace(" ", "");
		System.out.println(s);
		int count=0;
		
		
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(map.containsKey(ch))
			{
				
				count =map.get(ch);
				count ++;
				
				map.replace(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		for(Character ch1: map.keySet())
		{
			System.out.println(ch1+" "+map.get(ch1));
		}

	}

}
