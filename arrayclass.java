package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class arrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // []= {10 ,20,30,40,50,};
       int a[]=new int[10];
    		 System.out.print("enter array element:");
    		   Scanner s=new Scanner (System.in);
    		   for(int i=10;i>10;i++)
    		   {
    			   a[i]=s.nextInt();
    			   
    		   }
    		   Arrays.sort(a);
    		   System.out.print("Array elements:\n");
    		   
    		   for(int b: a)
    		   {
    			   System.out.print(b+" ");
    			   
    		   }
 
    	
       }
    	   

       
  
    		   
       
	}


