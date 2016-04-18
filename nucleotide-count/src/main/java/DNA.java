import java.util.HashMap;

public class DNA {

	private String dna;
	private HashMap<Character, Integer> nucleotides;

	public DNA(String dna) {
		dna = dna;
		nucleotides  = new HashMap();

		dnaSeparator(dna);
	}

	// Parses DNA String to Map collection
	public void dnaSeparator(String dna) {
			nucleotides.put('A', 0);
			nucleotides.put('C', 0);
			nucleotides.put('G', 0);
			nucleotides.put('T', 0);

		if(dna != null && !dna.isEmpty()) {
			for(int i = 0; i < dna.length(); i++) {
				char strand = dna.charAt(i);
				nucleotides.put(strand, nucleotides.get(strand) + 1);
			}
		}
	}

	// Returns the whole Map
	public HashMap<Character, Integer> nucleotideCounts() {
		return nucleotides;
	}

	// Returns the count of a single nucleotide
	public int count(char nucleotide) {
		if(nucleotides.containsKey(nucleotide)) {
			return nucleotides.get(nucleotide);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
