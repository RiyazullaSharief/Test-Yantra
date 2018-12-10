package dayone;

public class MissingNumber 
{
	
	public static void missingNumber1(int[] arr,int total)
	{
		int ex=total*(total+1)/2;
		int ac=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			ac=ac+arr[i];
		}
	int miss=ex-ac;
	System.out.println(miss);
	}
	
	public static void main(String[] args)
	{
		
		MissingNumber.missingNumber1(new int[]{1,2,3,5,6},6);
		MissingNumber.missingNumber1(new int[] {1,2,3,4,5,6,8,9},9);
	}
}
