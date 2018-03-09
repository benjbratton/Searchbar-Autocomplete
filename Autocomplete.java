import java.util.Arrays;

public class Autocomplete {// implement sorting algorithm in this class
	
	public static void main(String[] args) {
		 // always print messages on screen when debugging
		 // System.out.println(…);
		 // read in the terms from a file
		 String filename = args[0]; // first argument from command line
		 In in = new In(filename);
		 int N = in.readInt();
		 Term[] terms = new Term[N];
		 for (int i = 0; i < N; i++) {
		 long weight = in.readLong(); // read the next weight
		 in.readChar(); // scan past the tab
		 String query = in.readLine(); // read the next query
		 terms[i] = new Term(query, weight); // construct the term
		 }
		 // read in queries from standard input and print the top k matching terms
		 int k = Integer.parseInt(args[1]); // 2nd argument from command line
		 Autocomplete autocomplete = new Autocomplete(terms);
		 while (StdIn.hasNextLine()) {
		 String prefix = StdIn.readLine();
		 Term[] results = autocomplete.allMatches(prefix);
		 for (int i = 0; i < Math.min(k, results.length); i++)
		 System.out.println(results[i]);
		 }
		} 
	
	public Term[] terms;
	/* Initializes the data structure from the given array of terms. */
	public Autocomplete(Term[] terms){
		this.terms = terms;
	}
	/* Returns all terms that start with the given prefix, in descending
	order of weight. */
	public Term[] allMatches(String prefix){
		 int first, last, r = prefix.length();
		 Term word = new Term(prefix, 0);
		 first = BinarySearchDeluxe.firstIndexOf(terms, word, Term.byPrefixOrder(r));
		 last = BinarySearchDeluxe.lastIndexOf(terms, word, Term.byPrefixOrder(r));
		 Term[] temp = new Term[last-first]; //Create an array with only the works with the key in them
		 for(int i = 0; i < temp.length; i++) {
			 temp[i] = terms[first + i];
		 	}
		 Arrays.sort(temp, Term.byReverseWeightOrder()); //Sort the array by lexicographic and weight order
		 return temp;

	}
}//End Autoomplete
