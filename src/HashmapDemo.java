import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {

		 
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Red");
		hmap.put(2, "Green");
		hmap.put(3, "Blue");
		hmap.put(4, "Orange");
		
//		System.out.println(hmap.get(1));
//		System.out.println(hmap.size());
		hmap.clear();
		Map<Integer, String> hasmap = new HashMap<Integer, String>();
		hasmap.putAll(hmap);
		System.out.println("Copying " +hasmap);
		
		if(hmap.isEmpty())
		{
			System.out.println("It is empty");
			
		}
		else
		{
			System.out.println("Not empty");
		}
		
	}

}
