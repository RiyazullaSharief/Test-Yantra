package dayone;

public class Frequencyofacharacter {

	public static void main(String[] args)
	{
		String s1="ramayana";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
					count++;
				}	
			}
			if(ch[i]!=' ')
			{
				System.out.println(ch[i]+" "+count);
			}
		}

	}

}
