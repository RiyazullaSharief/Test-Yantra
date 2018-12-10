package dayone;
import java.util.LinkedHashMap;
public class MapArray
{
	public static void main(String[] args)
	{
		String[] a= {"hi","surhi","haisur","hello","hsur","ysur"};
		LinkedHashMap<Integer,String> hp= new LinkedHashMap<>();
		for(int i=0;i<=a.length-1;i++)
		{
			//String st=a[i];
			if(a[i].contains("sur"))
			{
				hp.put(i,a[i].substring(a[i].indexOf("sur")));		
			}
		}
	System.out.println(hp.values());
		System.out.println(hp);
	}
}
