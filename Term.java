public class Term implements Comparable<Term> {
	private final String word;
	private final long worth;
	/* Initializes a term with the given query string and weight. */
	public Term(String query, long weight){
		if(query.equals(null))
		  throw new java.lang.NullPointerException();
		if(weight < 0)
		  throw new java.lang.IllegalArgumentException();
		word = query;
		worth = weight;
	  
	}
	/* Compares the two terms in descending order by weight. */
	public static Comparator<Term> byReverseWeightOrder(){
		
	}
	/* Compares the two terms in lexicographic order but using only the first
	r characters of each query. */
	public static Comparator<Term> byPrefixOrder(int r){
		if(r < 0)
			throw new java.lang.IllegalArgumentException();
		
		
	}
	/* Compares the two terms in lexicographic order by query. */
	public int compareTo(Term that){
		int size1 = this.word.length();
		int size2 = that.word.length();
		int size = 0;
		int temp = 0;
		if(size1 > size2) {
			size = size2;
		}
		else {
			size = size1;
		}
		for(int i = 0; i < size; i++) {
			if(this.word.indexOf(i)<that.word.indexOf(i)) {
				temp = -1;
				break;
			}
			else if(this.word.indexOf(i)>that.word.indexOf(i)) {
				temp = 1;
				break;
			}
			else {
				continue;
			}
		}
		if(size1 != size2 && this.word.indexOf(size) == that.word.indexOf(size)) {
			temp = -1;
		}
		return temp;
	}
	// Returns a string representation of this term in the following format:
	// weight (i.e., ??.toString()), followed by a tab, followed by query.
	public String toString(){
		return Long.toString(worth) + "	" + word;
	}
}
