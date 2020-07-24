package custom_collection;
import java.util.*;
import java.lang.IndexOutOfBoundsException;
public class List <T>{
	int size=0;
	static final int Capacity=10;
	Object listobject_elements[];
	public List()
	{
		listobject_elements=new Object[Capacity];
	}
	public void add_element(T t)
	{
		if(size==listobject_elements.length)
		{
			capacity_check();
		}
		listobject_elements[size++]=t;
	}
	private void capacity_check()
	{
		int newsize=(listobject_elements.length)*2;
		listobject_elements=Arrays.copyOf(listobject_elements, newsize);
	}
	public int sizeoflist()
	{
		return size;
	}
	public T get_element(int index)
	{
			if(index<0 || index>=sizeoflist())
				throw new IndexOutOfBoundsException("index is out of given input range");
			else 
				return (T)listobject_elements[index];
	}
	public T remove_element(int index)
	{
		if(index<0 || index>=sizeoflist())
			throw new IndexOutOfBoundsException("index is out of given input range");
		Object removedelement=listobject_elements[index];
		int elements_index=listobject_elements.length-(index+1);
		System.arraycopy(listobject_elements, index+1, listobject_elements, index,elements_index);
		size--;
		return (T)removedelement;
	}
	
}
