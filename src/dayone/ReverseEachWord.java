package dayone;

public class ReverseEachWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="hii how you doing";
	//	String str1="";
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			
//			StringBuffer sb= new StringBuffer(split[i]);
//			StringBuffer revers = sb.reverse();
//			System.out.print(revers+ " ");
			String str2="";
			for(int j=split[i].length()-1;j>=0;j--)
			{
				str2=str2+split[i].charAt(j);
			}
			System.out.print(str2+" ");
		}
		
	}

}
