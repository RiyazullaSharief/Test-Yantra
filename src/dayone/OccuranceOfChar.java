package dayone;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "hellohellohiiiiiiii";
		
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=' ';
				}
				
			
			}
			if(arr[i]!=' ')
			{
			System.out.println(arr[i]+" "+"occured "+count);
		}
		

	}

}
}
