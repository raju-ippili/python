import java.util.*;
class Quu
{
	public static void main(String args[])
	{
		Queue <Integer> q1=new PriorityQueue<Integer>();
		q1.add(7);
		q1.add(8);
		q1.add(9);
		for(Integer i:q1)
		{
			System.out.println(i);
		}
		Queue <Integer> q2=new ArrayDeque<Integer>();
		q2.add(78);
		q2.add(89);
		q2.add(90);
		for(Integer i:q2)
		{
			System.out.println(i);
		}



	}
}
