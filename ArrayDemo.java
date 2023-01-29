import java.lang.*;

public class ArrayDemo
{
	public static void main(String args[])
	{
		int A[] = new int [5];
		int []B;
		B = new int [3];
		int []C = new int []{1,2,3,4,5};
		int D[] = {10, 20, 30};
		
		A[0] = 11;
		A[1] = 22;
		A[2] = 33;
		A[3] = 22;
		A[4] = 33;
		
		for(int i=0; i<5; i++)
		{
			System.out.println("A[" + i + "]: " + A[i]);			
		}
		System.out.println("--------------");
		
		for(int value : A)
		{
			System.out.println(value);
		}
	}
}