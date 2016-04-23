import java.util.HashMap;
import java.util.Map;

public class WordCount {
	private Map<String, Integer> wordCount;

	public WordCount() {
		wordCount = new HashMap<String, Integer>();
	}

	public Map<String, Integer> phrase(String str) {
		str.split(' ');
		return wordCount;
	}
}
