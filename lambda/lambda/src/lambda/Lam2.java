package lambda;
import java.util.function.*;
public class Lam2 {

	
//implementing inbuilt functional interfaces
	
	
	public static void predFunction(int number, Predicate<Integer> predicate)
    {
 	   if(predicate.test(number))
 	   {
 		   System.out.println("yes condition is true");
 	   }
 	   else 
 		  System.out.println("condition is false");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Biconsumer
		  BiConsumer<String, String> bi = (a, b) -> System.out.println(a + b);
	        bi.accept("aman ", "singh");
	        
	       // BiFunction
	       BiFunction<String,String,String> bf=(a,b)->{
	    	   String s=a+b;
	    	   return s;
	       };
	       System.out.println(bf.apply("aman ","singh"));
	        BiFunction <Integer,Integer,Integer> bf1=(a,b)->(a * b);
	       System.out.println( bf1.apply(5,7));
	       
	       //function interface 
	       
	       Function<Integer,Integer> f=(a)->{
	    	   Integer fact=1;
	    	   int i;
	    	   for(i=1;i<=a;i++)
	    	   {
	    		  fact*=i ;
	    	   }
	    	   
	    	   
			return fact;
	       };
	       
	       System.out.println(f.apply(8));
	       //-----------------------------------------
	       //predicate
	       
	       Predicate<Integer> pf1=(i)->i<100;//to test if passed number is <100
	       System.out.println(pf1.test(434));
	      
	      
	    	 predFunction(33,(x)->x>55);
	       

	}

}
