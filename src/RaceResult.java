

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;


public class RaceResult {

	private HashMap<String, TimeDuration> candidatesResult = new HashMap<>();
	
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		candidatesResult.put(tagNumber, resultTime);
	}
	
	
	public void printResult() {

		List<TimeDuration> valueSorted =  new ArrayList<TimeDuration>(candidatesResult.values());
		Collections.sort(valueSorted);
		for(TimeDuration item : valueSorted) {
			
			Set<String> key = RaceResult.getKeysByValue(candidatesResult,item );
			System.out.println(key.iterator().next() + " " + item.toString());
		}		
	}

	public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
	    Set<T> keys = new HashSet<T>();
	    for (Entry<T, E> entry : map.entrySet()) {
	        if (Objects.equals(value, entry.getValue())) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}
	
	  
	  
   public static void main(String ...args) {
	   RaceResult rs = new RaceResult();
	   rs.onNewResult("Jean Heude", new TimeDuration(400));
	   rs.onNewResult("Kylian jean", new TimeDuration(1500));
	   rs.onNewResult("dupont et dupont", new TimeDuration(30000));

	   rs.printResult();
	   
   }
	
	
}
