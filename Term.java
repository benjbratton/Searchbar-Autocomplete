public class Term implements Comparable<Term> {
	public String word;
	public long worth;
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
		return new ReverseOrder();
	}
	public static class ReverseOrder implements Comparator<Term>{
		public int compare(Term v, Term w) {
			return v.worth - w.worth;
		}
	}
	/* Compares the two terms in lexicographic order but using only the first
	r characters of each query. */
	public static Comparator<Term> byPrefixOrder(int r){
		if(r < 0)
			throw new java.lang.IllegalArgumentException();
		return new PrefixOrder(r);	
	}
	public static class PrefixOrder implements Comparator<Term> {
		int r;
		PrefixOrder(int r){
			this.r = r;
		}
		public int compare(Term v, Term w) {
			return v.compareTo(w);
		}
	}
	/* Compares the two terms in lexicographic order by query. */
	public int compareTo(Term that){
		return this.word.compareTo(that.word);
	}
	// Returns a string representation of this term in the following format:
	// weight (i.e., ??.toString()), followed by a tab, followed by query.
	public String toString(){
		return Long.toString(this.worth) + "\t" + this.word;
	}
}
