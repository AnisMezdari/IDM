

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class RaceResult {

	private HashMap<String, TimeDuration> candidatesResult = new HashMap<>();
	
	

	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		candidatesResult.put(tagNumber, resultTime);
	}
	
	
	public static HashMap<String, TimeDuration> SortHashMap(Map<String, TimeDuration> hmap){
        List<Map.Entry<String, TimeDuration>> list =
           new LinkedList<Map.Entry<String, TimeDuration>>( hmap.entrySet() );
        Collections.sort( list, new Comparator<Map.Entry<String, TimeDuration>>(){
           public int compare
           (Map.Entry<String, TimeDuration>o1, Map.Entry<String, TimeDuration> o2 )
           {
              return (o1.getKey()).compareTo( o2.getKey() );
           }
        });


        HashMap<String, TimeDuration> hmapTriee = new LinkedHashMap<String, TimeDuration>();
        for (Map.Entry<String, TimeDuration> entry : list)
        {
            hmapTriee.put( entry.getKey(), entry.getValue() );
        }
        return hmapTriee;
	 }

	  
	  
   public static void main(String ...args) {
	   RaceResult rs = new RaceResult();
	   rs.onNewResult("Jean Heude", new TimeDuration(400));
	   rs.onNewResult("Kylian jean", new TimeDuration(1500));
	   rs.onNewResult("dupont et dupont", new TimeDuration(30000));

	   
   }
	
	
}
