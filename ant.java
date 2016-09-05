import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       for(int i=0;i<n;i++)
       {
       	int x=in.nextInt();
       	int a[]=new int[x];
       	for(int j=0;j<x;j++)
       	{
       		a[j]=in.nextInt();
       		
       	}
       	findsol(a,x);
       	
       	
       }
    }
    public static void findsol(int a[],int n)
    {
    	int i=0;
    	int j=n-1;
    	
    	while(i<j && j>=0)
    	{
    		if(a[i]==-1 && a[j]==1)
    		{
    		i++;
    		j--;
    		}
    		else if(a[i]==-1)
    		{
    			i++;
    		}
    		else if(a[j]==1)
    		{
    			j--;
    			
    		}
    		else
    		break;
    		
    		
    		
    	}
    	while(i<j)
    	{
    
    	for(int m=i;m<j;m++)
    	{
    	if(a[m]!=a[m+1])
    	{
    	int temp=a[m];
    	a[m]=a[m+1];
    	a[m+1]=temp;
    	
    	}	
    	}
    	while(i<j && j>=0)
    	{
    		if(a[i]==-1 && a[j]==1)
    		{
    		i++;
    		j--;
    		}
    		else if(a[i]==-1)
    		{
    			i++;
    		}
    		else if(a[j]==1)
    		{
    			j--;
    			
    		}
    		else
    		break;
    		
    		
    		
    	}
    	
    	}
    
    	System.out.println(i+1);
    	
    }
}
