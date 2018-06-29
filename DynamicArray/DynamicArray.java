
package DynamicArray;


public class DynamicArray 
{
    private int array[];
    private int nextIndex;
    
    public DynamicArray()
    {
        array = new int[10];
    }
    public boolean isEmpty()
    {
        if(size() == 0)
        {
            return true;
        }
            else
        {
            return false;
        }
    }
    
    public int removeLast()
    {
        if (nextIndex < 1) 
        {
            return -1;
	}
	int value = array[nextIndex - 1];
        array[nextIndex - 1] = 0;
	nextIndex--;
	return value;
        
    }
    
    public void restructure() 
    {
	int temp[] = array;
	array = new int[array.length * 2];
	
        System.arraycopy(temp, 0, array, 0, temp.length);
    }

    public void add(int element) 
    {
	if (nextIndex == array.length) 
        {
            restructure();
	}
	array[nextIndex] = element;
	nextIndex++;
    }

    public int size() 
    {
        return nextIndex;
    }

    public int get(int index) 
    {
        if (index < 0 || index >= nextIndex) 
        {
            return -1;
        }
        return array[index];
    }

    
    public void set(int index, int element) 
    {
        if (index > nextIndex) 
        {
            System.out.println("Enter a index");
            
        }
        else if (index == nextIndex) 
        {
            add(element);
        } 
        else 
        {
            array[index] = element;
        }

    }
}


