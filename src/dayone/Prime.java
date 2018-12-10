package dayone;


	public class Prime {

	    public static void main(String[] args) {

	   //int num = 13;
	    	for(int j=1;j<=100;j++)
	    	{
	       boolean flag = false;
	        for(int i = 2; i <= j/2; ++i)
	        {
	            // condition for nonprime number
	            if(j % i == 0)
	            {
	            	
	                flag = true;
	                break;
	            }
	        }

	       if (flag==false)
	           System.out.println(j + " is a prime number.");
//	        else
//	            System.out.println(j + " is not a prime number.");
	    }
	}
	}