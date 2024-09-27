import java.lang.*;
import java.util.*;
class StrBuffer
{
	public static void main(String args[])
	{
		String s1=new String("Jale");
		System.out.println(s1);
		StringBuffer s2=new StringBuffer(s1);
		System.out.println(s2);
		s2.append(" Abhi");
		System.out.println(s2);
		System.out.println(s2.reverse());
		System.out.println(s2.delete(5,7));
		System.out.println(s2.capacity());
		s2.append("Abdhulkalam");
		System.out.println(s2.deleteCharAt(6));
		s2.setCharAt(15,'p');
		System.out.println(s2);
		System.out.println(s2.substring(6,16));
		System.out.println(s2.substring(6));
		System.out.println(s2.charAt(6));
		System.out.println(s2.indexOf("z"));
		System.out.println(s2.toString().toUpperCase());
		System.out.println(s2.toString().toLowerCase());

	}
}