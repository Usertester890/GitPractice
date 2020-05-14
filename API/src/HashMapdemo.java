import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		hm.put(101, "Value1");
		hm.put(102, "value2");
		hm.put(103, "value3");
		
		System.out.println(hm);
		
		for(Map.Entry map:hm.entrySet()) {
			
			System.out.println(map.getKey() + " " + map.getValue());
		}
		

	}

}
