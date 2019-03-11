import java.util.HashMap;

public class HashMapCalculator {

	public String commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numberOfMatches = 0;
		for (int i = 0; i < hashmap1.size(); i++) {
			for (int j = 0; j < hashmap2.size(); j++) {
				if (hashmap1.get(i)==(hashmap2.get(j))) {
					numberOfMatches++;
				}
			}
		}
		System.out.println(numberOfMatches);
		return ("" + numberOfMatches);
	}
}
