import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numberOfMatches = 0;
		for (String key : hashmap1.keySet()) {
			String value = hashmap1.get(key);
			
				if(value.equals(hashmap2.get(key))){
					numberOfMatches++;
				
				}
			}
		System.out.println(numberOfMatches);
		return (numberOfMatches);
	}
}
