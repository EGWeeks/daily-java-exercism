import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Etl {

  public Map<String, Integer> transform(Map<Integer, List<String>> old) {

  	Map<String, Integer> letterScore = new HashMap<String, Integer>();


  	for(Map.Entry<Integer, List<String>> entry : old.entrySet()) {
      int value = entry.getKey();
      List<String> letters = entry.getValue();

      for(int i = 0; i < letters.size(); i++) {
        letterScore.put(letters.get(i).toLowerCase(), value);
      }
  	}

    return letterScore;
  }

}
