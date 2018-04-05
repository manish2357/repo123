package devops.project1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Project !" );
        
        add(111,222);
        
    }
    
    
    
    public static void add(int a, int b)
    {
    	int c = a+b;
    	System.out.println("sum of two numbers :"+c);
    }
}
