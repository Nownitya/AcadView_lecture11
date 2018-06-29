
package DynamicArray;

public class DAMain 
{
    public static void main(String[] args) 
    {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i <= 10; i++) 
        {
            da.add(i);
            
        }
        da.set(44, 92);	
        
	while (!da.isEmpty())  
        {
            System.out.println(da.removeLast());
            
	}	
    }
    
}
