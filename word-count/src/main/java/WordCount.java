
// 1. split phrase between each word
//	 a. each word must be in array
// 1.5. create hashmap with key as each array item 
//	 a. set hashmap values to default 1
// 2. iterate over array
// 	 a. nest for loop or forEach method
// 3. take outside for loop current value and check 
// that value with inside for loop of same array
//	 a. if value is at same index skip it / no plus one
// 4. return hashmap

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class WordCount {

	private Map<String, Integer> wordCount;

	public WordCount() {
		wordCount = new HashMap<String, Integer>();
	}

	public Map<String, Integer> phrase(String str) {

		List<String> words = Arrays.asList(str.split(" "));

		for(int i = 0; i < words.size(); i++) {

			words.set(i, words.get(i).toLowerCase().replaceAll("[^\\w]", ""));

			// regex will replace character with nothing - this if statement doesn't work
			// because nothing is not null nor is it an empty string.
			// I cannot figure out how to check this 
			// nothing? --> {=2, as=1, java=1, car=1, carpet=1, javascript=1}
			if(words.get(i) == null) {
				words.remove(i);
			} else if(!wordCount.containsKey(words.get(i))) {
				wordCount.put(words.get(i), 1);
			} else {
				wordCount.put(words.get(i), wordCount.get(words.get(i)) + 1);
			}

		}

		return wordCount;
	}

	public static void main(String args[]) {
		WordCount wc = new WordCount();
		System.out.println(wc.phrase("go Go GO"));

		WordCount word = new WordCount();
		System.out.println(word.phrase("car : carpet as java : javascript!!&@$%^&"));
	}
}
