import java.util.map;

public class DNA {

	private String dna;
	private Map<String, Integer> nucleotides;

	public DNA() {
		dna = dna;
		nucleotides  = new HashMap();
		nucleotides.put("A", 0);
		nucleotides.put("C", 0);
		nucleotides.put("G", 0);
		nucleotides.put("T", 0);
	}

	// not sure if this method needs to return or
	// if just calling it the test will be able to see the map
	// might sound stupid but ... i'll figure it out.
	public nucleotideCounts() {

	}

	public int count(String nucleotide) {
		// This SHOULD return the value of the nucleotide passed in
		return nucleotides.get(nucleotide);
	}

}
