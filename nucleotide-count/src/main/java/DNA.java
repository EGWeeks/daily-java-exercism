import java.util.HashMap;


public class DNA {
	public String dna;
	public HashMap<Character, Integer> nucleotides;

	public DNA(String dna) {
		System.out.printf("%s", dna);
		dna = dna;
		nucleotides  = new HashMap();
		dnaSeparator(dna);
	}

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

	public HashMap<Character, Integer> nucleotideCounts() {
		return nucleotides;
	}

	public int count(char nucleotide) {
		if(nucleotides.containsKey(nucleotide)) {
			return nucleotides.get(nucleotide);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
