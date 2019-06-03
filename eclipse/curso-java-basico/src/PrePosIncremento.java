
public class PrePosIncremento {
	
	 public static void main(String[] args) {
		 
		    int a=1;
		    int b=a++;
		    
		    System.out.println("a= "+a);
		    System.out.println("b= "+b);
		    System.out.println(a++ + (b=++a));
	        //System.out.println(a++ + ++a);
	    }

}
