package hand.webdome.Exam1;
//判断101——200之间的素数

public class App 
{
    public static void main( String[] args )
    {
    	int count = 0;
    	int a[]=new int[100];
        for(int i=101;i<200;i++)
        {
        	if(Prime(i))
        	{   
        		a[count]=i;
        		count++;
        	}
       
        }
        
        System.out.print("101-200间共有"+count+"个素数,分别是: ");
        
        for(int i=0;i<count;i++)
        {
        	if (i == count-1) {
        		System.out.println(a[i]);
			}
        	else {
        		System.out.print(a[i]+",");
			}
        }
    }
    
    public static boolean Prime(int n) {
		
    	for(int i=2;i<n;i++)
    	{
    		if(n%i==0)
    		{
    			return false;
    		}
    	}
    	return true;
	}
}
