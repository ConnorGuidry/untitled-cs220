package cipherassist.verification;

public class DemoClass 
{
	public static void main(String[] args) 
	{
		HashMap first = new HashMap();
		
		first.add("Username", "Password");
		first.add("Username", "Notebook");
		System.out.println(first.getSize());
		System.out.println(first.get("Username"));
		
		first.add("Pasgdbrb", "Usernam1");
		
		first.add("Passwor6", "Usernam7");
		
		first.add("PZ", "Winston");
		
		first.add("Z", "Keith");
		
		System.out.println(first.get("ISUCK"));
		
		System.out.println(first.get("Pasgdbrb"));
		
		System.out.println(first.get("Passwor6"));
		System.out.println(first.getSize());
		
		System.out.println(first.remove("Username"));
		System.out.println(first.get("Username"));
		System.out.println(first.getSize());
		
	}
}
