package dayone;

public class NoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		String str="hi m doing java program";
		 
		String[] split = str.split(" ");
		
  for(int i=0;i<split.length;i++)
  {
	  int count1=0;
	  for(int j=0;j<split[i].length();j++)
	  {
		  count1++;
		
	  }
	 
	 System.out.println(count1);
	  count++;
  }
  
 // System.out.println(count);
	}

}
