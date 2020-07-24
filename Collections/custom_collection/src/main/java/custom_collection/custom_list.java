package custom_collection;

import java.util.logging.Logger;


public class custom_list {
	private static  final Logger LOGGER=Logger.getLogger(custom_list.class.getName());
	public static void main(String args[])
	{
		List<Integer> l1=new List<Integer>();
		l1.add_element(11);
		l1.add_element(30);
		l1.add_element(25);
		l1.add_element(87);
		l1.add_element(91);
		l1.add_element(22);
		l1.add_element(85);
		l1.add_element(44);
		l1.add_element(18);
		l1.add_element(27);
		LOGGER.info("ELEMENTS IN THE LIST ARE:");
		for(int i=0;i<l1.sizeoflist();i++)
			LOGGER.info(l1.get_element(i)+" ");
		
		LOGGER.info("REMOVE ELEMENT 4:" + l1.remove_element(4));
		
	    LOGGER.info("ELEMENT AT INDEX 3:" + l1.get_element(3));
	    LOGGER.info("SIZE OF LIST:" + l1.sizeoflist());
		//System.out.println(l1);
	}
}
