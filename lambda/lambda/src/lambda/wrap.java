package lambda;
import java.util.*;
    class car{
    	String model;int no;
    	car(String model,int no)
    	{
    		this.model=model;
    		this.no=no;
    	}
    	//System.out.println("model="+model+"----"+"car number="+no);
    	
    	void print()
    	{
    		System.out.println("model="+model+"----"+"car number="+no);
    	}
    	 
    }
                
    
     
    
    
    class wrapper
    {
    	car c;
    	wrapper(car c)
    	{
    		this.c=c;
    		
    	}
    }
   public class wrap{
	   public static void swap(wrapper w1,wrapper w2)
	   {
		   car temp=w1.c;
		   w1.c=w2.c;
		   w2.c=temp;
	   }
	   public static void main(String args[])
	   {
		   car c1=new car("zen",123);
		   car c2=new car("nano",987);
		   wrapper w1=new wrapper(c1);
		   wrapper w2=new wrapper(c2);
		   swap(w1,w2);
		   w1.c.print();
		   w2.c.print();
		   Scanner sc=new Scanner(System.in);
		   int x=sc.nextInt();
		   
		   sc.close();
		   
		   
	   }
   }

