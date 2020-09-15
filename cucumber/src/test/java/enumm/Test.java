package enumm;
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class Test 
{ 
    // Driver method 
    public static void main(String[] args) throws Throwable  
    { 
    	System.out.println("enum classes cannot have finalize methods"); 
        Test t = new Test() 
        { 
            // final finalize method 
            protected final void finalize() throws Throwable  
            { 
            	System.out.println("enum classes cannot have finalize methods");
            };       
            protected final Object clone()  
                    throws CloneNotSupportedException  
            { 
                return new CloneNotSupportedException(); 
            } 
        }; 
        System.out.println(t.clone()); 
    } 
} 