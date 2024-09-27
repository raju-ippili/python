import java.lang.*;
import java.util.*;
class Str
{
	public static void main(String args[])
	{
		String s1 = new String();
		s1="Happy";
		String s2 = new String("ramu");
		String k=s1+s2;
		System.out.println(k);
		Scanner sm=new Scanner(System.in);
		String m;
		System.out.println("enter string");
		m=sm.next();
		System.out.println(m);
		
		System.out.println("is given string is upper :"+k.toUpperCase());
		System.out.println("is given string is Lower :"+k.toLowerCase());
		System.out.println("charecter at index5 :"+k.charAt(5));
		System.out.println("index of r :"+k.indexOf("r"));
		System.out.println("last index of a :"+k.lastIndexOf("a"));
		System.out.println("hash code :"+k.codePointAt(7));

	}
}