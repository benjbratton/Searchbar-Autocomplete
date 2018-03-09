import java.util.Comparator;

public class Term implements Comparable<Term> {
	public String word;
	public long worth;
	/* Initializes a term with the given query string and weight. */
	public Term(String query, long weight){
		if(query.equals(null))
		  throw new java.lang.NullPointerException();//checks if the query is empty
		if(weight < 0)
		  throw new java.lang.IllegalArgumentException();//checks if the weight is empty
		word = query;//creates a variable that can be used by all methods
		worth = weight;//creates a variable that can be used by all methods
	  
	}
	/* Compares the two terms in descending order by weight. */
	public static Comparator<Term> byReverseWeightOrder(){
		return new ReverseOrder();//returns a new class that compares two terms
	}
	public static class ReverseOrder implements Comparator<Term>{
		public int compare(Term v, Term w) {//compares the two terms based on their weight
			if(v.worth > w.worth)
				return -1;//returns the comparison
			else if(v.worth < w.worth)
				return 1;//returns the comparison
			else
				return 0;//returns the comparison
		}
	}
	/* Compares the two terms in lexicographic order but using only the first
	r characters of each query. */
	public static Comparator<Term> byPrefixOrder(int r){
		if(r < 0)
			throw new java.lang.IllegalArgumentException();//checks if the given input is negative and throws an exception if it is
		return new PrefixOrder(r);//returns a new class that compares two terms	
	}
	public static class PrefixOrder implements Comparator<Term> {
		int r;//int r from byPrefixOrder
		PrefixOrder(int r){//constructor of PrefixOrder
			this.r = r;//saves the current value for prefix as the prefix from byPrefixOrder
		}
		public int compare(Term v, Term w) {//compares the two terms based on the prefix of length r
			return v.compareTo(w);//returns the comparison
		}
	}
	/* Compares the two terms in lexicographic order by query. */
	public int compareTo(Term that){
		return this.word.compareTo(that.word);//compares the current query with the next query
	}
	// Returns a string representation of this term in the following format:
	// weight (i.e., ??.toString()), followed by a tab, followed by query.
	public String toString(){
		return Long.toString(this.worth) + "\t" + this.word;
	}
}
