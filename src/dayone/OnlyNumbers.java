package dayone;
import java.util.Arrays;
public class OnlyNumbers {
	public static void main(String[] args)
	{
		//int num=0,upper,lower=0;
		String s1="",s2="";
		String str="abuc12 hi34 ahaf45";
 		char[] arr = str.toCharArray();
 		for(int i=0;i<str.length();i++)
 		{
 			if(Character.isAlphabetic(arr[i]))
   				s1+=arr[i];
 			else if(Character.isDigit(arr[i]))
				s2+=arr[i];
 		}
 		System.out.println(s1);
 		System.out.println(s2);
	}
}
	